package com.itc.GallaryService;

import java.util.List;

public class Gallery {
	int id;
	List<Object> images;

	public List<Object> getImages() {
		return images;
	}

	public void setImages(List<Object> images) {
		this.images = images;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
