package MyNewProjectAPI.RestAssuredTestProject;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class APIFour {
	@Test
	public void APITest() {
	RestAssured.baseURI="https://reqres.in/";
			Response res=given().
			param("page","2").log().all().
			when().
			get("api/users").
			then().assertThat().log().body().
			statusCode(200).and().contentType(ContentType.JSON).and().
			extract().response();
			String responseString=res.asString();
			System.out.println(responseString);
			JsonPath js=new JsonPath(responseString);
			String fname = js.get("data[0].first_name");
			System.out.println(fname);
			int count = js.get("data.size()");
			System.out.println(count);
			for(int i=0;i<count;i++) {
				String First_Name=js.getString("data["+i+"].first_name");
				System.out.println(First_Name);
			}

}

}
