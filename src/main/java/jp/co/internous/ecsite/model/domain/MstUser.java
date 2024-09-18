package jp.co.internous.ecsite.model.domain;

public class MstUser {
	//フィールドを設定
	private int id;
	private String userName;
	private String password;
	private String fullName;
	private int isAdmin;
	
	//setterとgetterを設定
	//idのsetterとgetter
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	//userNameのsetterとgetter
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName() {
		return userName;
	}
	
	//passwordのsetterとgetter
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	
	//fullNameのsetterとgetter
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getFullName() {
		return fullName;
	}
	
	//isAdminのsetterとgetter
	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}
	public int getIsAdmin() {
		return isAdmin;
	}
	
}
