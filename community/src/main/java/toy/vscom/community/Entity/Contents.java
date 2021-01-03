package toy.vscom.community.Entity;

import org.springframework.data.mongodb.core.mapping.Document;
import toy.vscom.community.DAO.SearchContentDAO;

@Document(collection = SearchContentDAO.COLLECTION)
public class Contents {
	int userId;
	String content;
}
