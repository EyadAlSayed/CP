import EyadPackage.HtmlDocument;
import EyadPackage.TestVisitor;
import generate.HTMLLexer;
import generate.HTMLParser;


import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.CharStream;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Compiler {

	static String filePath = "index.html";
	static String ASTPath = "AST.txt";
	
	protected static void showGUI(ParseTree pt, HTMLParser parser) {
		Trees.inspect(pt, parser);
	}


	public static void main(String[] args) {
		try {
			String source = "sample.txt";
			CharStream cs = fromFileName(source);
			HTMLLexer htmlLexer = new HTMLLexer(cs);
			CommonTokenStream token = new CommonTokenStream(htmlLexer);
			HTMLParser parser = new HTMLParser(token);
			org.antlr.v4.runtime.tree.ParseTree tree = parser.htmlDocument();
			HtmlDocument doc = (HtmlDocument) new TestVisitor().visit(tree);
			System.out.println(doc);


		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	public static void main(String[] argv) {
//		CharStream cs;
//		try {
//			cs = CharStreams.fromFileName(filePath);
//			HTMLLexer lexer = new HTMLLexer(cs);
//			CommonTokenStream cts = new CommonTokenStream(lexer);
//			HTMLParser parser = new HTMLParser(cts);
//			//ParseTree pt = parser.();
//		    showGUI(parser.htmlDocument(),parser);
//			DocumentVisitor visitor = new DocumentVisitor();
//			AbstractASTNode document = visitor.visitDocument(parser.htmlDocument());
//			FileWriter resultFile = new FileWriter(ASTPath);
//			resultFile.write(document.toString());
//			resultFile.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
	
}
