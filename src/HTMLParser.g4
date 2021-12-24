parser grammar HTMLParser;

options { tokenVocab=HTMLLexer; }

htmlDocument
    : scriptletOrSeaWs* XML? scriptletOrSeaWs* DTD? scriptletOrSeaWs* htmlElements*
    ;

scriptletOrSeaWs
    : SCRIPTLET
    | SEA_WS
    ;

htmlElements
    : htmlMisc* htmlElement htmlMisc*
    ;

htmlElement
    : TAG_OPEN TAG_NAME htmlAttribute*
      (TAG_CLOSE (htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE)? | TAG_SLASH_CLOSE)
    | SCRIPTLET
    | mustach_open
    | script
    | style
    ;
htmlData: ((htmlElement| CDATA | htmlComment|htmlAttribute) htmlChardata?);

htmlContent
    :  htmlChardata? htmlData*
    ;

htmlAttribute
    :
      TAG_NG_FOR ng_for_value
    | TAG_NAME (TAG_NG_FOR ng_for_value)?
    | TAG_NAME (TAG_EQUALS  ATTVALUE_VALUE)?
    ;


/*  ng for keyword  */
ng_for_value : NG_FOR_VALUE;


/*  mustach template  */
mustach_open : (SEA_WS* TAG_OPEN_MUSTACH SEA_WS* mustach_body SEA_WS*MUSTACH_CLOSE) ;
mustach_body : MUSTACH_ATTRIBUTE;

htmlChardata
    :
     HTML_TEXT
    | SEA_WS
    ;

htmlMisc
    : htmlComment
    | SEA_WS
    ;

htmlComment
    : HTML_COMMENT
    | HTML_CONDITIONAL_COMMENT
    ;

script
    : SCRIPT_OPEN (SCRIPT_BODY | SCRIPT_SHORT_BODY)
    ;

style
    : STYLE_OPEN (STYLE_BODY | STYLE_SHORT_BODY)
    ;