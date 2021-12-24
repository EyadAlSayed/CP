package models.documents;

import models.AbstractASTNode;
import models.nodes.DocumentNode;
import models.util.Formatter;

import java.util.List;

public class DocumentHeader extends AbstractASTNode {

	protected List<DocumentNode> headers;
	
	public DocumentHeader() {
		
	}
	
	public DocumentHeader(List<DocumentNode> headers) {
		this.headers = headers;
	}

	@Override
	protected String nodeName() {
		return "DocumentHeader";
	}

	@Override
	protected Formatter nodeValue(Formatter formatter) {
		for (DocumentNode header: headers)
			formatter.object(header.toString());
		return formatter;
	}
	
}
