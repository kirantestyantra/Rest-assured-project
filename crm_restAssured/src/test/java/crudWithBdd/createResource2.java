package crudWithBdd;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import  static io.restassured.RestAssured.*;

@Test
public class createResource2 {
    public void createResource() {
	Random random=new Random();
	int randomNo=random.nextInt(1000);
	
	JSONObject jobj=new JSONObject();
	jobj.put("created by","TYSS_KIRAN"+randomNo);
	jobj.put("projectName","tyss_445"+randomNo);
	jobj.put("status","created");
	jobj.put("teamsize","30");
	
	given()
	
	.contentType(ContentType.JSON)
	    .body(jobj)
	.when()
	    .post("http://localhost:8084/addProject")
	.then()
	    .assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
	
}}
