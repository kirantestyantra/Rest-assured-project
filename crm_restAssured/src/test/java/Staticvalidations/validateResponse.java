package Staticvalidations;




import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;
import junit.framework.Assert;


public class validateResponse {

	@Test
	public void validation() 
	{
		
		
		String expectedProName="tyss_789";
		Response resp = when()
				
		.get("http://localhost:8084/projects");
		
		String actualProName=resp.jsonPath().get("[0].projectName");
		
		System.out.println("actual value"+actualProName);
        System.out.println("expected value"+expectedProName);	
        
        resp.then()
        .assertThat().statusCode(200).contentType(ContentType.JSON)
        .log().all();
        
        Assert.assertEquals(expectedProName,actualProName );
	}
	
	
}
