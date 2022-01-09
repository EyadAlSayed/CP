package EyadPackage;



import generate.HTMLParser;
import generate.HTMLParserBaseVisitor;

import java.util.List;

public class TestVisitor extends HTMLParserBaseVisitor {

    @Override
    public HtmlDocument visitHtmlDocument(HTMLParser.HtmlDocumentContext ctx) {
        HtmlDocument htmlDocument = new HtmlDocument();

        for (int i = 0; i < ctx.htmlElements().size(); i++) {
            if (ctx.htmlElements(i) != null)
            htmlDocument.getElements().add(visitHtmlElements(ctx.htmlElements(i)));
        }
        return htmlDocument;
    }


    //    @Override
//    public HtmlDocument visitHtmlDocument(HTMLParser.HtmlDocumentContext ctx) {
//        HtmlDocument htmlDocument = new HtmlDocument();
//        for (int i = 0; i < ctx.htmlElements().size(); i++) {
//            htmlDocument.getElements().add(visitHtmlElements(ctx.htmlElements(i)));
//        }
//        return htmlDocument;
//    }

    @Override
    public HtmlElement visitHtmlElements(HTMLParser.HtmlElementsContext ctx) {
        return visitHtmlElement(ctx.htmlElement());
    }

    @Override
    public HtmlElement visitHtmlElement(HTMLParser.HtmlElementContext ctx) {
     /*  HtmlElement htmlElement = new HtmlElement();
        htmlElement.setTagOpen(ctx.TAG_OPEN(0).getText());
        htmlElement.setTagName(ctx.TAG_NAME(0).getText());
        for (int i = 0; i < ctx.htmlAttribute().size(); i++) {
            htmlElement.getHtmlAttributes().add(visitHtmlAttribute(ctx.htmlAttribute(i)));
        }
        return htmlElement;*/


        HtmlElement htmlElement = new HtmlElement();
       htmlElement.setTagOpen(ctx.TAG_OPEN(0).getText());
        htmlElement.setTagName(ctx.TAG_NAME(0).getText());
        List<HTMLParser.HtmlDataContext> elementContexts = ctx.htmlContent().htmlData();
        if (ctx.htmlAttribute().size() > 0) {
            for (HTMLParser.HtmlAttributeContext attributeContext : ctx.htmlAttribute()) {
                htmlElement.getHtmlAttributes().add(visitHtmlAttribute(attributeContext));
            }
        }
        if (elementContexts.size() <= 0) { // Html tag
            htmlElement.setContentText(ctx.htmlContent().htmlChardata().getText());
        } else {
            for (int i = 0; i < ctx.htmlContent().htmlData().size(); i++) {
                htmlElement.getHtmlElements().add(visitHtmlElement(ctx.htmlContent().htmlData(i).htmlElement()));
            }
        }
        return new HtmlElement();
    }

    @Override
    public HtmlAttribute visitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx) {
        HtmlAttribute htmlAttribute = new HtmlAttribute();
        htmlAttribute.setTagName(ctx.TAG_NAME().getText());
        return htmlAttribute;
    }
}
