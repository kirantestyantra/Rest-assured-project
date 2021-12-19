package chaining;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import  static io.restassured.RestAssured.*;

import java.util.Random;

public class getAndPut {

	
@Test
public void chaining() {
	
	
	
	Response resp=when()
			  .get("http://localhost:8084/projects");
	     String proId=resp.jsonPath().get("[0].projectId");
	 given()
	 .pathParam("projectId", proId)
	 .when()
	 .delete("http://localhost:8084/projects/{projectId}")
	 .then().log().all();	
}
}
