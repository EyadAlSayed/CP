// Generated from D:/My compiler project/CP/src\HTMLParser.g4 by ANTLR 4.9.2
package generate;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTMLParser}.
 */
public interface HTMLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void enterScriptletOrSeaWs(HTMLParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void exitScriptletOrSeaWs(HTMLParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElements(HTMLParser.HtmlElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElements(HTMLParser.HtmlElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(HTMLParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(HTMLParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlData}.
	 * @param ctx the parse tree
	 */
	void enterHtmlData(HTMLParser.HtmlDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlData}.
	 * @param ctx the parse tree
	 */
	void exitHtmlData(HTMLParser.HtmlDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#ng_for}.
	 * @param ctx the parse tree
	 */
	void enterNg_for(HTMLParser.Ng_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ng_for}.
	 * @param ctx the parse tree
	 */
	void exitNg_for(HTMLParser.Ng_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#ng_hide}.
	 * @param ctx the parse tree
	 */
	void enterNg_hide(HTMLParser.Ng_hideContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ng_hide}.
	 * @param ctx the parse tree
	 */
	void exitNg_hide(HTMLParser.Ng_hideContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#ng_if}.
	 * @param ctx the parse tree
	 */
	void enterNg_if(HTMLParser.Ng_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ng_if}.
	 * @param ctx the parse tree
	 */
	void exitNg_if(HTMLParser.Ng_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#ng_show}.
	 * @param ctx the parse tree
	 */
	void enterNg_show(HTMLParser.Ng_showContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ng_show}.
	 * @param ctx the parse tree
	 */
	void exitNg_show(HTMLParser.Ng_showContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#model_variable}.
	 * @param ctx the parse tree
	 */
	void enterModel_variable(HTMLParser.Model_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#model_variable}.
	 * @param ctx the parse tree
	 */
	void exitModel_variable(HTMLParser.Model_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(HTMLParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(HTMLParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#mustach_open}.
	 * @param ctx the parse tree
	 */
	void enterMustach_open(HTMLParser.Mustach_openContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#mustach_open}.
	 * @param ctx the parse tree
	 */
	void exitMustach_open(HTMLParser.Mustach_openContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#mustach_body}.
	 * @param ctx the parse tree
	 */
	void enterMustach_body(HTMLParser.Mustach_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#mustach_body}.
	 * @param ctx the parse tree
	 */
	void exitMustach_body(HTMLParser.Mustach_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#open_b}.
	 * @param ctx the parse tree
	 */
	void enterOpen_b(HTMLParser.Open_bContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#open_b}.
	 * @param ctx the parse tree
	 */
	void exitOpen_b(HTMLParser.Open_bContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#b_attribute}.
	 * @param ctx the parse tree
	 */
	void enterB_attribute(HTMLParser.B_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#b_attribute}.
	 * @param ctx the parse tree
	 */
	void exitB_attribute(HTMLParser.B_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlChardata(HTMLParser.HtmlChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlChardata(HTMLParser.HtmlChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlMisc(HTMLParser.HtmlMiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlMisc(HTMLParser.HtmlMiscContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterHtmlComment(HTMLParser.HtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitHtmlComment(HTMLParser.HtmlCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(HTMLParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(HTMLParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(HTMLParser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(HTMLParser.StyleContext ctx);
}