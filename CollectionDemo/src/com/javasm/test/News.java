package com.javasm.test;

public class News {
	private String title;
	private String contentDesc;
	
	public News(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContentDesc() {
		return contentDesc;
	}

	public void setContentDesc(String contentDesc) {
		this.contentDesc = contentDesc;
	}

	@Override
	public String toString() {
		return "News [title=" + title + "]";
	}
	
	
}
