// Generated from D:/My compiler project/CP/src\HTMLParser.g4 by ANTLR 4.9.2
package generate;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HTMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HTMLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptletOrSeaWs(HTMLParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElements(HTMLParser.HtmlElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(HTMLParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlData(HTMLParser.HtmlDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ng_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNg_for(HTMLParser.Ng_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ng_hide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNg_hide(HTMLParser.Ng_hideContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ng_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNg_if(HTMLParser.Ng_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ng_show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNg_show(HTMLParser.Ng_showContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(HTMLParser.EventContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#mustach_open}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMustach_open(HTMLParser.Mustach_openContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#mustach_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMustach_body(HTMLParser.Mustach_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlChardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlChardata(HTMLParser.HtmlChardataContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlMisc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlMisc(HTMLParser.HtmlMiscContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlComment(HTMLParser.HtmlCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(HTMLParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(HTMLParser.StyleContext ctx);
}