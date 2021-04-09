package MyNewProjectAPI.RestAssuredTestProject;
import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class APIThird {
	Properties prop = new Properties();
	@BeforeTest
	public void getData() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Qualitest\\eclipse-workspace\\APITesting\\src\\API\\data.properties");
		prop.load(fis);
		prop.getProperty("HOST");
	}
	@Test
	public void APITest3(){
		RestAssured.baseURI=prop.getProperty("HOST");
		Response res=given().
		given().
		param("page","2").
		when().
		get(Resource.resourceData()).then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
		extract().response();
		String responseString=res.asString();
		System.out.println(responseString);
		JsonPath js=new JsonPath(responseString);
		String fname = js.get("data[0].first_name");
		System.out.println(fname);
		Response res1=given().
		given().
		body("{\r\n"
				+ "    \"name\": \""+fname+"\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}").when().
		put(Resource.resourceData()).then().assertThat().statusCode(200).extract().response();
		String responseString1=res1.asString();
		System.out.println(responseString1);
	}

}
