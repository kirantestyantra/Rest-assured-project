package withBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class deleteResources {
	@Test
	public void deleteResourse()

	{
	    Response response = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_405");
	    ValidatableResponse validateRes = response.then();
	    validateRes.log().all();
	    validateRes.statusCode(204);
	    validateRes.contentType(ContentType.JSON);


	}

}
