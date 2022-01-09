package EyadPackage;


import java.util.ArrayList;
import java.util.List;

public class HtmlElement {

    private String tagOpen;
    private String tagName;
    private final List<HtmlAttribute> htmlAttributes = new ArrayList<>();
    private final List<HtmlElement> htmlElements = new ArrayList<>();
    private String contentText;

    public String getTagOpen() {
        return tagOpen;
    }

    public void setTagOpen(String tagOpen) {
        this.tagOpen = tagOpen;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public List<HtmlAttribute> getHtmlAttributes() {
        return htmlAttributes;
    }

    public List<HtmlElement> getHtmlElements() {
        return htmlElements;
    }

    public String getContentText() {
        return contentText;
    }

    public void setContentText(String contentText) {
        this.contentText = contentText;
    }

    @Override
    public String toString() {
        return "HtmlElement { \n" +
                " \t tagOpen='" + tagOpen + '\'' +
                ", \t \t tagName='" + tagName + '\'' +
                ", \t \t \t htmlAttributes=" + htmlAttributes +
                ", \t \t \t \t htmlElements=" + htmlElements +
                ", \t \t \t \t contentText='" + contentText + '\'' +
                '}';
    }
}
