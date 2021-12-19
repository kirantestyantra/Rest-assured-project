package withBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class updateResource {
	@Test

	public void completeupdate()
	{                                                                                         
		
	JSONObject jobj = new JSONObject();
	jobj.put("projectname", " TYSS13");
	
	RequestSpecification reqRes = RestAssured.given();
	reqRes.contentType(ContentType.JSON);
	reqRes.body(jobj);
	
	reqRes.put("http://localhost:8084/addProject/TY_PROJ_2205");
	
	ResponseSpecification validateRes = reqRes.then();
	reqRes.log().all();	
	}

}
