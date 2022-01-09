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
    | SEA_WS* model_variable  (FUNCTION_INDICATOR FUNCTION_NAME)?
    | SEA_WS* open_b
    ;

htmlAttribute
    :
      TAG_NG_FOR NG_FOR_CLOSE // eyad
    | TAG_NG_SHOW ng_show
    | TAG_NG_IF ng_if
    | TAG_NG_HIDE ng_hide
    | TAG_EVENT event
    | TAG_NAME (TAG_NG_FOR ng_for)?
    | TAG_NAME (TAG_NG_HIDE ng_hide)?
    | TAG_NAME (TAG_NG_IF ng_if)?
    | TAG_NAME (TAG_NG_IF ng_show)?
    | TYPE_EQUALS TYPE_VALUE    //type! ' '   SALEM
    | NG_MODEL_EQUALS MODEL_VALUE //ng-model! ' '   SALEM
    | TAG_NAME (TAG_EQUALS  ATTVALUE_VALUE)?
    ;


/*  ng for keyword  */
ng_for : NG_FOR_CLOSE;
ng_hide : NG_HIDE_CLOSE;
ng_if : NG_IF_CLOSE;
ng_show : NG_SHOW_CLOSE;

model_variable : MODEL_VARIABLE;

/* event */
event: EVENT_CLOSE;

/*  mustach template  */
mustach_open : (SEA_WS* TAG_OPEN_MUSTACH SEA_WS* mustach_body SEA_WS*MUSTACH_CLOSE) ;
mustach_body : MUSTACH_VALUE;

open_b : (SEA_W* TAG_OPEN_B SEA_WS* b_attribute SEA_WS* B_CLOSE);
b_attribute : B_ATTRIBUTE;

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
    :SEA_WS* SCRIPT_OPEN (VAR VAR_VARIABLE VAR_EQUALS VAR_VARIABLE_VALUE)* SCRIPT_CLOSE // salem
    | SEA_WS* SCRIPT_OPEN (VAR VAR_OBJ)* SCRIPT_CLOSE //eyad
    ;

style
    : STYLE_OPEN (STYLE_BODY | STYLE_SHORT_BODY)
    ;