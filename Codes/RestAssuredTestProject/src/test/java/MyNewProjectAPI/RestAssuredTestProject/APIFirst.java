package MyNewProjectAPI.RestAssuredTestProject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class APIFirst {
	@Test
	public void APITest() {
		RestAssured.baseURI="https://reqres.in/";
		given().
				param("page","2").
				when().
				get("api/users").
				then().assertThat().
				statusCode(200).and().contentType(ContentType.JSON).and().body("data[0].first_name",equalTo("Michael"));

	}

}
