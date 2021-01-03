package toy.vscom.community.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserInfo {
	@Id
	private Long		id;
	private String	userId;
	private String	userPw;
}
