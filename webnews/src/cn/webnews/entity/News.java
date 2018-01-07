package cn.webnews.entity;
/**
 * 新闻实体类
 * @author lymo
 *
 */
public class News {
	private int id;
	private String title;
	private String body;
	private String adddate;
	
	public News() {
		super();
	}
	
	public News(int id, String title, String body, String adddate) {
		super();
		this.id = id;
		this.title = title;
		this.body = body;
		this.adddate = adddate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getAdddate() {
		return adddate;
	}
	public void setAdddate(String adddate) {
		this.adddate = adddate;
	}
	
	
}
