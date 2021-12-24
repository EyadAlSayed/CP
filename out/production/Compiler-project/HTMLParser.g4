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
    :
      TAG_OPEN_INPUT  (TYPE_EQUALS TYPE_VALUE NG_MODEL_EQUALS MODEL_VALUE)+ TAG_SLASH_CLOSE_INPUT    // SALEM
      |TAG_OPEN TAG_NAME htmlAttribute*
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
      TAG_NG_FOR ng_for_value // eyad
    | TAG_NAME (TAG_NG_FOR ng_for_value)?
    | TYPE_EQUALS TYPE_VALUE    //type! ' '   SALEM
    | NG_MODEL_EQUALS MODEL_VALUE //ng-model! ' '   SALEM
    | TAG_NAME (TAG_NG_ATTRIBUTE NG_VALUE)?
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
    :SEA_WS* SCRIPT_OPEN (VAR VAR_VARIABLE VAR_EQUALS VAR_VARIABLE_VALUE)* SCRIPT_CLOSE

    ;

style
    : STYLE_OPEN (STYLE_BODY | STYLE_SHORT_BODY)
    ;