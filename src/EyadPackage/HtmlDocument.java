package EyadPackage;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {

    private final List<HtmlElement> elements = new ArrayList<>();

    public List<HtmlElement> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        return "HtmlDocument { \n" +
                "\t elements = \n \t " + elements +"\n"+
                '}';
    }
}
