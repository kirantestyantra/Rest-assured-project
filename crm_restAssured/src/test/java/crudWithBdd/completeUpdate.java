package crudWithBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class completeUpdate
{
	@Test
public void update() 
{
		Random random=new Random();
		int randomNo=random.nextInt(1000);
		JSONObject jobj=new JSONObject();
		jobj.put("created by","hi"+randomNo);
		jobj.put("projectName","hkkkk"+randomNo);
		jobj.put("status","ongoing");
		jobj.put("teamsize","78666");
			
			given()
			    .contentType(ContentType.JSON)
			    .body(jobj)
			.when()
			   .put("http://localhost:8084/projects/sdet_22784")
			   .then()
			.assertThat().statusCode(201).contentType(ContentType.JSON).log().all();	
	}
}
