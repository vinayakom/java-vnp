package io.vnp.javavnp.Example;

import java.util.ArrayList;
import java.util.List;

public class DocumentDAO {

	public List<Document> getDocument() {
		List<Document> documents = new ArrayList<>();
		documents.add(new Document(101, "Core Java", 400));
		documents.add(new Document(363, "Hibernate", 180));
		documents.add(new Document(275, "Spring", 200));
		documents.add(new Document(893, "Web Serivce", 300));
		return documents;
	}
}
