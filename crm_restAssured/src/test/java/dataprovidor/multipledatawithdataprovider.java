package dataprovidor;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericLib.pojoLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class multipledatawithdataprovider {

	@Test(dataProvider= "getData")
	public void create(String createdBy,String projectName,String status,int timeSize) 
	{


		pojoLibrary pojb=new pojoLibrary(createdBy,projectName,status,timeSize);
		given()
		.body(pojb)
		.contentType("application/json")

		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat().contentType(ContentType.JSON)
		.and()
		.statusCode(201)
		.log().all();

	}

	@DataProvider
	public Object[][] getData()
	{
		Object[][] objarray=new Object[2][4];
		objarray[0][0]="gugu";
		objarray[0][1]="data1 proj";
		objarray[0][2]="ongoing";
		objarray[0][3]=48;


		objarray[1][0]="kiran799";
		objarray[1][1]="kiran project455";
		objarray[1][2]="completed";
		objarray[1][3]=454;
		return objarray;


	}
}
