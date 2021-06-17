package io.vnp.javavnp.Example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DocumentService {

	public List<Document> getDocumentBySorting() {
		List<Document> document = new DocumentDAO().getDocument();
		// Collections.sort(document, new MyComparator());
		/*
		 * Collections.sort(document, new Comparator<Document>() {
		 * 
		 * @Override public int compare(Document doc1, Document doc2) { return
		 * doc2.getName().compareTo(doc1.getName()); }
		 * 
		 * });
		 */

		Collections.sort(document, (doc1, doc2) -> doc2.getName().compareTo(doc1.getName()));
		return document;
	}

	public static void main(String[] args) {
		System.out.println(new DocumentService().getDocumentBySorting());
	}
}

/*
 * class MyComparator implements Comparator<Document> {
 * 
 * public int compare(Document doc1, Document doc2) { return
 * doc2.getName().compareTo(doc1.getName()); } }
 */