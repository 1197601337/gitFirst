package www.news.com.model;

import java.util.Date;

public class News {
	private Integer id;
	private String title;
	private String content;
	private String resource;
	private Date date;
	private Caregory caregory;

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getResource() {
		return resource;
	}
	public void setResource(String resource) {
		this.resource = resource;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Caregory getCaregory() {
		return caregory;
	}
	public void setCaregory(Caregory caregory) {
		this.caregory = caregory;
	}
	
}
