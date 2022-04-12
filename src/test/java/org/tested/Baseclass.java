package org.tested;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Baseclass {
	static RequestSpecification rr;
	Response Response;
	
	public void header(String key,String value) {
		 rr = RestAssured.given().header(key,value);
	}
	public void queryParam(String key, String value) {
		 rr = rr.queryParam(key, value);
	}
	public void pathparam(String key, String value) {
	 rr = rr.pathParam(key, value);		
}
	
	public Response methodeType(String Type,String endpoint) {
		switch (Type) {
		case "GET":
			Response = rr.log().all().get(endpoint);

			break;
		case "PUT":
			Response = rr.log().all().put(endpoint);

			break;
		case "POST":
			Response = rr.log().all().post(endpoint);

			break;
		case "DELETE":
			Response = rr.log().all().delete(endpoint);

			break;	

		default:
			break;

		}
		return Response;

	}
	public void basicAuth(String username,String password) {
		rr.auth().preemptive().basic(username , password);

	}
	public int getStatus(Response Response) {
		int code = Response.getStatusCode();
		return code;
	}
	public ResponseBody getresBody(Response Response) {
		ResponseBody body = Response.getBody();
		
		return body;
	}
	public String getbodyasString(Response Response) {
		String String = getresBody(Response).asString();
		return String;
		

	}
	public String getbodyaspretty(Response Response) {
		String asPrettyString = getresBody(Response).asPrettyString();
		return asPrettyString;

	}
	public void givenBody(String program) {
		rr = rr.given().body(program);

	}
	
	public RequestSpecification body(Object Response) {
		RequestSpecification body = rr.body(Response);
		return body;
		

	}
	
	
	
	
	

	
	}

