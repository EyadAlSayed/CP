package EyadPackage;

public class HtmlAttribute {
    private String tagName;

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        return "HtmlAttribute { \n" +
                "\t tagName='" + tagName + " \n" +
                '}';
    }
}
