package paramaters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Queryparameter {
@Test
public void querry() {
	given()
	   .queryParam("page","2")
	.when()
	   .get("https://reqres.in/api/users")
	.then()
	   .statusCode(200)
	   .log().all();
	
	
	
}
}
