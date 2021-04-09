package MyNewProjectAPI.RestAssuredTestProject;

public class Payload {
	public static String getPayload(String fname,String lname) {
		String payload = "\"{\\r\\n\"\r\n"
				+ "				+ \"    \\\"name\\\": \\\"\"+fname+\"\\\",\\r\\n\"\r\n"
				+ "				+ \"    \\\"name\\\": \\\"\"+lname+\"\\\",\\r\\n\"\r\n"
				+ "				+ \"}\"";
		return payload;
	}

}
