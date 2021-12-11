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
    : ~('<'|'{'|':')+
    ;

TAG_OPEN_B
    :' '* '{{' ' '* ->pushMode(OPEN_B_MODE)
    ;

mode OPEN_B_MODE;

B_CLOSE: ' '* '}}' ' '* -> popMode;

B_ATTRIBUTE
    :
    [a-zA-Z]+
    ;

// tag declarations

mode TAG;

NGFOR: ' '* 'ng-for';
NGSWITCH: ' '* 'ng-switch';
NGSHOW: ' '* 'ng-show';
NGIF: ' '* 'ng-if';
NGHIDE: ' '* 'ng-hide';
NGCASE: ' '* 'ng-switch-case';


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
    : ' '* ATTRIBUTE -> popMode
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
     





mode NG_FOR_MODE;

NG_FOR_VALUE
    :NG_FOR_ATTRIBUTE ->popMode
    ;

NG_FOR_ATTRIBUTE:
     SINGLE_QUOTE_FOR_ATT
    | SIGNLE_FOR_OPEN_B
    ;
fragment SINGLE_QUOTE_FOR_ATT
    : '\'' ~[<']* '\''
    ;
fragment SIGNLE_FOR_OPEN_B
    : '\'' ~[<]*  '\''
    ;

mode NG_CONDITION_MODE;

NG_SWITCH_VALUE
    : ' '* NG_SWITCH_ATTRIBUTE ->popMode
    ;
NG_SWITCH_ATTRIBUTE
    :
     SINGLE_QUOTE_SWITCH_ATT
     | SIGNLE_SWITCH_OPEN_B
    ;
fragment SINGLE_QUOTE_SWITCH_ATT
    : '\'' ~[<']* '\''
    ;
fragment SIGNLE_SWITCH_OPEN_B
    : '\'' ~[<]* '\''
    ;