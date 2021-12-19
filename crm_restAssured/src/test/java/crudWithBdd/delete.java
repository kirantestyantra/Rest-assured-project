package crudWithBdd;

import  static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class delete {
	@Test
public void deleteResource() 
{
	
	when()
	  .delete("http://localhost:8084/projects/TY_PROJ_1809")
	.then()
	  .assertThat().statusCode(204).contentType(ContentType.JSON).log().all();
}
}
