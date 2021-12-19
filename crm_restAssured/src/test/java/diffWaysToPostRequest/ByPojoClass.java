package diffWaysToPostRequest;

import genericLib.pojoLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class ByPojoClass {
@Test
public void create() {
		
	pojoLibrary pojb=new pojoLibrary("KIRAN78797","DEMO8522","COMPLETED",20);
	given()
	.body(pojb)
	.contentType(ContentType.JSON)
	.when()
	 .post("http://localhost:8084/addProject")
	.then()
		.assertThat().statusCode(201)
		.log().all();
	}

}
