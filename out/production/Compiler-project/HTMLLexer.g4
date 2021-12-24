lexer grammar  HTMLLexer;

HTML_COMMENT
    : '<!--' .*? '-->'
    ;

HTML_CONDITIONAL_COMMENT
    : '<![' .*? ']>'
    ;

XML
    : '<?xml' .*? '>'
    ;

CDATA
    : '<![CDATA[' .*? ']]>'
    ;

DTD
    : '<!' .*? '>'
    ;

SCRIPTLET
    : '<?' .*? '?>'
    | '<%' .*? '%>'
    ;

SEA_WS
    :  (' '|'\t'|'\r'? '\n')+
    ;

SCRIPT_OPEN
    : SEA_WS* '<script' .*? '>' SEA_WS* ->pushMode(SCRIPT)
    ;


STYLE_OPEN
    : '<style' .*? '>'  ->pushMode(STYLE)
    ;

TAG_OPEN
    : '<' -> pushMode(TAG)
    ;

//Begining of 'input tag' syntax   SALEM

TAG_OPEN_INPUT
    : ' '* '<input' ->pushMode(INPUT_MODE)
    ;

HTML_TEXT
    : ~('<'|'{')+
    ;

TAG_OPEN_MUSTACH
    :SPACE* '{{' SPACE* ->pushMode(MUSTACH_MODE)
    ;

// tag declarations

mode TAG;

NGFOR: SPACE* 'ng-for';



//SALEM
TYPE : ' '* 'type';
NG_MODEL : ' '* 'ng-model';

TAG_CLOSE
    : '>' -> popMode
    ;

TAG_SLASH_CLOSE
    : '/>' -> popMode
    ;

TAG_SLASH
    : '/'
    ;


// lexing mode for attribute values

TAG_EQUALS
    : '=' -> pushMode(ATTVALUE)
    ;


//End of 'input tag' syntax   SALEM
    TAG_NAME_INPUT_END
        : 'input' ->popMode
        ;

TAG_NAME
    : TAG_NameStartChar TAG_NameChar*
    ;

TAG_WHITESPACE
    : [ \t\r\n] -> channel(HIDDEN)
    ;

TAG_NG_FOR
    : NGFOR '!' '\'' -> pushMode(NG_FOR_MODE)
    ;
TAG_SQ_BRACKET : SPACE* '[' -> pushMode(SQ_BRACKET_MODE);
TAG_CARLE_BRACKET : SPACE* '{' ->pushMode(CARLE_BRAKET_MODE);






//TAG_NG_SWITCH_ATTRIBUTE : '!' -> pushMode(NG_SWITCH_MODE);

fragment
HEXDIGIT
    : [a-fA-F0-9]
    ;

fragment
DIGIT
    : [0-9]
    ;

fragment
TAG_NameChar
    : TAG_NameStartChar
    | '-'
    | '_'
    | '.'
    | DIGIT
    | '\u00B7'
    | '\u0300'..'\u036F'
    | '\u203F'..'\u2040'
    ;

fragment
TAG_NameStartChar
    : [:a-zA-Z]
    | '\u2070'..'\u218F'
    | '\u2C00'..'\u2FEF'
    | '\u3001'..'\uD7FF'
    | '\uF900'..'\uFDCF'
    | '\uFDF0'..'\uFFFD'
    ;
fragment WORD : [a-zA-Z]+;

// <scripts>

mode SCRIPT;
//Begining of 'var' syntax   SALEM
VAR
   : ' '* 'var' -> pushMode(VAR_MODE)
   ;

SCRIPT_CLOSE
    : SEA_WS* '</script>' ->popMode
    ;

// <styles>

mode STYLE;

STYLE_BODY
    : .*? '</style>' -> popMode
    ;

STYLE_SHORT_BODY
    : .*? '</>' -> popMode
    ;


// attribute values

mode ATTVALUE;

// an attribute value may have spaces b/t the '=' and the value
ATTVALUE_VALUE
    : SPACE* ATTRIBUTE -> popMode
    ;
ATTRIBUTE
    :
      DOUBLE_QUOTE_STRING
    | SINGLE_QUOTE_STRING
    | ATTCHARS
    | HEXCHARS
    | DECCHARS
    ;

fragment ATTCHARS
    : ATTCHAR+ ' '?
    ;

fragment ATTCHAR
    : '-'
    | '_'
    | '.'
    | '/'
    | '+'
    | ','
    | '?'
    | '='
    | ':'
    | ';'
    | '#'
    | [0-9a-zA-Z]
    ;

fragment HEXCHARS
    : '#' [0-9a-fA-F]+
    ;

fragment DECCHARS
    : [0-9]+ '%'?
    ;

fragment DOUBLE_QUOTE_STRING
    : '"' ~[<"]* '"'
    ;
fragment SINGLE_QUOTE_STRING
    : '\'' ~[<']* '\''
    ;


/* EYAD */
mode NG_FOR_MODE;

IN : SPACE* 'in';
SPACE : ' ';
EQUALS : SPACE* '=';
SEM_COLON : ';';
SINGLE_QUOTE : SPACE* '\'';


NG_FOR_VALUE
    :SPACE* NG_FOR_ATTRIBUTE ->popMode
    ;

NG_FOR_ATTRIBUTE
     : ID_CHAR
     | ID_WORD
     | ID_CHAR_LIST
     | ID_WORD_LIST
     | ID_ITEMS_CH_CHAR
     | ID_ITEMS_CH_WORD
     | ID_ITEMS_W_CHAR
     | ID_ITEMS_W_WORD
     | ID_ITEMS_CH_LIST
     | ID_ITEMS_W_LIST
     | ID_ITEMS_CH_OBJ;




fragment IDCHAR : SPACE* [a-zA-Z];
fragment IDWORD : SPACE* [a-zA-Z]+;
fragment IDNUM : SPACE* [0-9]+;

/*  x in t */
fragment ID_CHAR : IDCHAR SPACE IN SPACE IDCHAR  (SEM_COLON ID_INDEX)* SINGLE_QUOTE;

/* xxx in ttt  */
fragment ID_WORD : IDWORD SPACE IN SPACE? IDWORD (SEM_COLON ID_INDEX)* SINGLE_QUOTE;

/* x in [a,b,c] */
fragment ID_CHAR_LIST : IDCHAR SPACE IN SPACE TAG_SQ_BRACKET CLOSE_SQ_BRACKET (SEM_COLON ID_INDEX)* SINGLE_QUOTE;

/* xxx in [a,b,c] */
fragment ID_WORD_LIST : IDWORD SPACE IN SPACE TAG_SQ_BRACKET CLOSE_SQ_BRACKET (SEM_COLON ID_INDEX)* SINGLE_QUOTE;

/* x,y in t*/
fragment ID_ITEMS_CH_CHAR : (IDCHAR COMMA?)+ SPACE IN SPACE IDCHAR (SEM_COLON ID_INDEX)* SINGLE_QUOTE;

/* xxx,yyy in t*/
fragment ID_ITEMS_W_CHAR : (IDWORD COMMA?)+ SPACE IN SPACE IDCHAR (SEM_COLON ID_INDEX)* SINGLE_QUOTE;

/* x,y in ttt*/
fragment ID_ITEMS_CH_WORD : (IDCHAR COMMA?)+ SPACE  IN SPACE IDWORD (SEM_COLON ID_INDEX)* SINGLE_QUOTE;

/*  xxx,yyy in ttt*/
fragment ID_ITEMS_W_WORD : (IDWORD COMMA?)+ SPACE  IN SPACE IDWORD (SEM_COLON ID_INDEX)* SINGLE_QUOTE;

/* x,y in [a,b,c] */
fragment ID_ITEMS_CH_LIST : (IDCHAR COMMA?)+ SPACE IN SPACE TAG_SQ_BRACKET CLOSE_SQ_BRACKET (SEM_COLON ID_INDEX)* SINGLE_QUOTE;

/* xx,yy in [a,b,c] */
fragment ID_ITEMS_W_LIST : (IDWORD COMMA?) + SPACE IN SPACE TAG_SQ_BRACKET CLOSE_SQ_BRACKET (SEM_COLON ID_INDEX)* SINGLE_QUOTE;

/* x,y in {object} */
fragment ID_ITEMS_CH_OBJ : (IDCHAR COMMA?)+ SPACE IN SPACE TAG_CARLE_BRACKET CLOSE_CARLE_BRAKET (SEM_COLON ID_INDEX)* SINGLE_QUOTE ;

/* xx,yy in {object}*/
fragment ID_ITEMS_W_OBJ : (IDWORD COMMA?)+ SPACE IN SPACE TAG_CARLE_BRACKET CLOSE_CARLE_BRAKET (SEM_COLON ID_INDEX)* SINGLE_QUOTE ;


/* ; i = index */
fragment ID_INDEX : IDCHAR SPACE? EQUALS SPACE? IDWORD ;


/* not used regex */
fragment SINGLE_QUOTE_FOR_ATT
    :  ~[<']* '\''
    ;
fragment SIGNLE_FOR_OPEN_B
    :  ~[<]*  '\''
    ;





//   SALEM
mode INPUT_MODE;

TAG_NAME_INPUT_BEGIN
    : 'input' ->pushMode(INPUT_MODE)
    ;
 TAG_CLOSE_INPUT
        : ' '* '>' -> popMode
        ;

TAG_SLASH_CLOSE_INPUT
            : ' '* '/>' -> popMode
            ;


//Begining of 'type' syntax   SALEM
TYPE_EQUALS
  : TYPE '!\'' -> pushMode(TYPE_MODE);


//Begining of 'ng-model' syntax   SALEM
NG_MODEL_EQUALS
    : NG_MODEL '!\'' -> pushMode(NG_MODEL_MODE);




//Type mode for type!   SALEM
mode TYPE_MODE;

TYPE_VALUE
    : ' '* TYPE_ATTRIBUTE -> popMode
    ;
TYPE_ATTRIBUTE
    : ~[<']* '\'';




//Type mode for ng-model!   SALEM
mode NG_MODEL_MODE;

MODEL_VALUE
    : ' '* MODEL_ATTRIBUTE -> popMode
    ;
MODEL_ATTRIBUTE
    : ~[<']* '\'';

//   SALEM
mode VAR_MODE;

VAR_VARIABLE
    : (' ' | '\n')* [a-zA-Z]*;
VAR_EQUALS
    : ' '* '=' ;
VAR_VARIABLE_VALUE
    : ' '* '\'' ~[<']* '\'' ->popMode ;
     

mode SQ_BRACKET_MODE;

COMMA: SPACE* ',';

CLOSE_SQ_BRACKET : SPACE* SQ_BRACKET_ATTRIBUTE* SPACE* ']' ->popMode;

SQ_BRACKET_ATTRIBUTE
    : ITEMS
    ;

fragment ITEMS: (ITEMCHAR | ITEMWORD | ITEMNUM | ITEMNUMBER);
fragment ITEMCHAR : SINGLE_QUOTE SPACE? [a-zA-Z] SPACE? SINGLE_QUOTE COMMA?;
fragment ITEMWORD : SINGLE_QUOTE SPACE? [a-zA-Z]+ SPACE? SINGLE_QUOTE COMMA?;
fragment ITEMNUM : SINGLE_QUOTE SPACE? [0-9]+ SPACE? SINGLE_QUOTE COMMA?;
fragment ITEMNUMBER:  [0-9]+ COMMA?;

mode CARLE_BRAKET_MODE;

PIP : ':';
CLOSE_CARLE_BRAKET: SPACE* CARLE_BRAKET_VALUE* SPACE* '}' ->popMode;
CARLE_BRAKET_VALUE : NUM_ATT | TXT_ATT;

fragment NUM_ATT : IDWORD SPACE* PIP SPACE* IDNUM COMMA*;
fragment TXT_ATT : IDWORD SPACE* PIP SPACE* SINGLE_QUOTE IDWORD SINGLE_QUOTE COMMA*;

mode MUSTACH_MODE;

MUSTACH_CLOSE: SPACE* '}}' SPACE* -> popMode;

MUSTACH_ATTRIBUTE
    :
    [a-zA-Z]+
    ;
