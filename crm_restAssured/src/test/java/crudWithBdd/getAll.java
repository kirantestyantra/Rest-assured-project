package crudWithBdd;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class getAll 
{
	@Test
	public void getAll() 
	{
		when()
		   .get("http://localhost:8084/projects")
		  .then()
		  .assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
	}
}
