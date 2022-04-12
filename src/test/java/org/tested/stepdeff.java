package org.tested;



import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class stepdeff extends Baseclass {
	@Test
	public void create() {
		header("Content-Type", "application/json");
		Category c = new Category(12345, "data");
		List<String>p = new ArrayList<String>(); 
		p.add("google");

		Tag a = new Tag(12, "tag1");
		Tag a1 = new Tag(13, "tag2");
		Tag a2 = new Tag(14, "tag3");
		List<Tag>tags = new ArrayList<>();
		tags.add(a);
		tags.add(a1);
		tags.add(a2);
		
		Root r = new Root(123, c,"dog", p, tags, "Available");
		
	
		RequestSpecification body = body(r);
		Response type = methodeType("POST", "https://petstore.swagger.io/v2/pet");
		System.out.println(getStatus(type));
		System.out.println(getbodyaspretty(type));
		
		Root as = type.as(Root.class);
		System.out.println(as.getId());
		System.out.println(as.getName());
		System.out.println(as.getStatus());
		System.out.println(as.getCategory().getId());

		
		System.out.println(as.getCategory().getName());
		System.out.println(getStatus(type));
		
		List<String> photoUrls = r.getPhotoUrls();
		for (String string : photoUrls) {
			System.out.println(string);
			
		}
	List<Tag> tags2 = r.getTags();
	for (Tag tag : tags) {
		System.out.println(tag);
		

	
	}}}
	

	
	
	
	


