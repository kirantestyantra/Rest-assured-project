package withBDD;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateResource {


	@Test
	public void create() 
	{
		
		Random ran=new Random();
		int ranNumber=ran.nextInt();
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "kiran"+ranNumber);
		jobj.put("projectName", "megamind"+ranNumber);
		jobj.put("status", "completed");
		jobj.put("teamsize", "40");
		
		
		RequestSpecification reqRes = RestAssured.given();
		reqRes.body(jobj);
		reqRes.contentType(ContentType.JSON);
		
		Response response=reqRes.post("http://localhost:8084/addProject");
		ValidatableResponse vrespon=response.then();
		vrespon.assertThat().statusCode(201);
		vrespon.assertThat().contentType(ContentType.JSON);
		vrespon.log().all();
	}

	}

	

