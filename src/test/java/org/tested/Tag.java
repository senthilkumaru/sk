package org.tested;

public class Tag{
    public int id;
    public String name;
    public Tag() {
		// TODO Auto-generated constructor stub
	}

    
	public Tag(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
    
}