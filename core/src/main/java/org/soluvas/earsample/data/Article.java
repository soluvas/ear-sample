package org.soluvas.earsample.data;

import org.joda.time.DateTime;

public class Article {

	private String title;
	private String summary;
	private String content;
	private String creator;
	private DateTime created;
	
	public Article() {
		this.created = new DateTime();
	}
	
	public Article(String title, String summary, String content,
			String creator) {
		super();
		this.title = title;
		this.summary = summary;
		this.content = content;
		this.creator = creator;
		this.created = new DateTime();
	}
	
	public Article(String title, String summary, String content,
			String creator, DateTime created) {
		super();
		this.title = title;
		this.summary = summary;
		this.content = content;
		this.creator = creator;
		this.created = created;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public DateTime getCreated() {
		return created;
	}
	public void setCreated(DateTime created) {
		this.created = created;
	}
	
}
