package org.tested;

import java.util.List;

public class Root{
    public int id;
    public Category category;
    public String name;
    public List<String> photoUrls;
    public List<Tag> tags;
    public String status;
	public Root(int id, Category category, String name, List<String> photoUrls, List<Tag> tags, String status) {
		super();
		this.id = id;
		this.category = category;
		this.name = name;
		this.photoUrls = photoUrls;
		this.tags = tags;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public Category getCategory() {
		return category;
	}
	public String getName() {
		return name;
	}
	public List<String> getPhotoUrls() {
		return photoUrls;
	}
	public List<Tag> getTags() {
		return tags;
	}
	public String getStatus() {
		return status;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhotoUrls(List<String> photoUrls) {
		this.photoUrls = photoUrls;
	}
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    
}

