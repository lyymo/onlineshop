package cn.webnews.entity;
/**
 * 用户实体类
 * @author lymo
 *
 */
public class NewsUser {
	private int user_id;
	private String user_name;
	private String password;
	
	public NewsUser() {
		super();
	}
	public NewsUser(int user_id, String user_name, String password) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.password = password;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
