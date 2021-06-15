package io.vnp.javavnp.Example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DocumentService {

	public List<Document> getDocumentBySorting() {
		List<Document> document = new DocumentDAO().getDocument();
		Collections.sort(document, new MyComparator());
		return document;
	}
	
	public static void main(String[] args) {
		System.out.println(new DocumentService().getDocumentBySorting());
	}
}

class MyComparator implements Comparator<Document> {
	
	public int compare(Document doc1, Document doc2) {
		return doc2.getName().compareTo(doc1.getName());
	}
}