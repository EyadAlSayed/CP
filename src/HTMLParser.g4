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
      (TAG_CLOSE (htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE) | TAG_SLASH_CLOSE)
    | SCRIPTLET
    | open_b
    | script
    | style
    ;
htmlData: ((htmlElement| CDATA | htmlComment|htmlAttribute) htmlChardata?);

htmlContent
    : SEA_WS* model_variable  (FUNCTION_INDICATOR FUNCTION_NAME)?
     |//htmlChardata? htmlData*
    ;

htmlAttribute
    :
      ng_for (TAG_NG_ATTRIBUTE NG_VALUE)?
    | ng_switch (TAG_NG_ATTRIBUTE NG_VALUE)?
    | ng_case (TAG_NG_ATTRIBUTE NG_VALUE)?
    | ng_show (TAG_NG_ATTRIBUTE NG_VALUE)?
    | ng_hide (TAG_NG_ATTRIBUTE NG_VALUE)?
    | ng_if (TAG_NG_ATTRIBUTE NG_VALUE)?
    | TYPE_EQUALS TYPE_VALUE    //type! ' '   SALEM
    | NG_MODEL_EQUALS MODEL_VALUE //ng-model! ' '   SALEM
    | TAG_NAME (TAG_NG_ATTRIBUTE NG_VALUE)?
    | TAG_NAME (TAG_EQUALS  ATTVALUE_VALUE)?
    ;


/*  ng keyword  */

ng_for: NGFOR;
ng_switch: NGSWITCH;
ng_case: NGCASE;
ng_show : NGSHOW;
ng_hide : NGHIDE;
ng_if : NGIF;
type : TYPE;
model : NG_MODEL;
model_variable : MODEL_VARIABLE;

ng_for_attribute : NG_FOR_ATTRIBUTE;

/*  mustach template  */
open_b : (SEA_W* TAG_OPEN_B SEA_WS* b_attribute SEA_WS*B_CLOSE) ;
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
    :SEA_WS* SCRIPT_OPEN (VAR VAR_VARIABLE VAR_EQUALS VAR_VARIABLE_VALUE)* SCRIPT_CLOSE

    ;

style
    : STYLE_OPEN (STYLE_BODY | STYLE_SHORT_BODY)
    ;