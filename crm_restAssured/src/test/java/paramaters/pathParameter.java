package paramaters;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class pathParameter {

	@Test
	public void path() {
		String proid="tyskjdj";
		
		given()
		.pathParam("projectId","TY_PROJ_1809")
		//.pathParam("projectId",proid)
		
		.when()
		.delete("http://localhost:8084/projects/{projectId}")
		.then()
		//.assertThat().statusCode(204)
		.log().all();
	}
}
