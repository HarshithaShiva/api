package MyNewProjectAPI.RestAssuredTestProject;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class APISecond {
	@Test
	public void APITest2(){
		RestAssured.baseURI="https://reqres.in/";
		Response res=given().
		given().
		body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}").
		when().
		post("api/users").then().assertThat().statusCode(201).and().contentType(ContentType.JSON).
		extract().response();
		String responseString=res.asString();
		System.out.println(responseString);
		JsonPath js=new JsonPath(responseString);
		String myid = js.get("id");
		System.out.println(myid);
	}

}
