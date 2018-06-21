package online.qsx.model;

public class UserModel {
	private Long id;
	private String loginName;
	private String password;
	private String nickName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public UserModel(Long id, String loginName, String password, String nickName) {
		super();
		this.id = id;
		this.loginName = loginName;
		this.password = password;
		this.nickName = nickName;
	}

	public UserModel(String loginName, String password, String nickName) {
		super();
		this.loginName = loginName;
		this.password = password;
		this.nickName = nickName;
	}

	public UserModel(Long id) {
		super();
		this.id = id;
	}

	public UserModel() {
		super();
	}

}
