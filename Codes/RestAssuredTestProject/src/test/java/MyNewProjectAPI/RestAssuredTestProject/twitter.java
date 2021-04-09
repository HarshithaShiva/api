package MyNewProjectAPI.RestAssuredTestProject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class twitter {
	String ConsumerKey="eUcY6pYA8zTzDMooRqXt9iiGm";
	String ConsumerSecret="KKK5uMQ7oN6dTBKdDilPox5KcjROEmq4lrDvRMAL6aCimcOius";
	String Token="2511016963-d6Ju0svwJDgMY5NdhVSCgNAoGLIOa8NoDNGc5Bv";
	String TokenSecret="W9kE07bgEde07cp5zcokpc7nHAt7WQYd9XYOBUPapmD9w";
	
	@Test
	public void getTweet() {
		RestAssured.baseURI="https://api.twitter.com/1.1/statuses";
		Response res = given().auth().oauth(ConsumerKey,ConsumerSecret,Token,TokenSecret).
				queryParam("count","1").
				when().get("/home_timeline.json").then().extract().response();
		String response=res.asString();
		System.out.println(response);
		JsonPath js=new JsonPath(response);
		String id=js.get("id").toString();
		System.out.println(id);
		String text=js.get("text").toString();
		System.out.println(text);
				
		
	}
	@Test
	public void postanddeleteTweet() {
		RestAssured.baseURI="https://api.twitter.com/1.1/statuses";
		Response res = given().auth().oauth(ConsumerKey,ConsumerSecret,Token,TokenSecret).
				queryParam("status","1").
				when().post("/update.json").then().extract().response();
		String response=res.asString();
		System.out.println(response);
		JsonPath js=new JsonPath(response); 
		String id=js.get("id").toString();
		System.out.println(id);
		String text=js.get("text").toString();
		System.out.println(text);
		
		given().auth().oauth(ConsumerKey,ConsumerSecret,Token,TokenSecret).
		when().post("/destroy/"+id+".json").then().assertThat().statusCode(200);
		
	}
	

}
