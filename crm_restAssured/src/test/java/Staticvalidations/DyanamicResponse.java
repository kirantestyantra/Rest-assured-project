package Staticvalidations;

import static io.restassured.RestAssured.*;

import java.util.List;

import org.testng.Assert;

import io.restassured.response.Response;

public class DyanamicResponse {
	
	
public void validate() {
	
	String expectedprojectname="tyss_789";
	String actualProname=null;
	Response resp=when()
			.get("http://localhost:8084/projects");
	
	List<String>list1=resp.jsonPath().get("projectName");
	boolean flag=false;
	for (String listdata : list1) {
		if(expectedprojectname.equals(listdata)) 
		{
			actualProname=listdata;
			flag=true;
		}	
	}
	Assert.assertEquals(expectedprojectname, actualProname);
	System.out.println("kiran");
	Assert.assertTrue(flag);
	Assert.assertEquals(flag,false);




}
	
	
	
}
