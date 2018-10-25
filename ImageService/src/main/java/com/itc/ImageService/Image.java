package com.itc.ImageService;


public class Image {
	int id;
	String title;
	String url;
	
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public Image(int i, String string, String string2) {
		id = i;
		title = string;
		url = string2;
	}
}
