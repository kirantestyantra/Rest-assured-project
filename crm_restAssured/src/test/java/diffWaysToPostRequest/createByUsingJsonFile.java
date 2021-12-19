package diffWaysToPostRequest;

import java.io.File;

import static io.restassured.RestAssured.*;

public class createByUsingJsonFile

{
	
	public void createWithJsonFile() {
	File file=new File("./src/test/resources/jsondata.json");
	
	given()
	.body(file);
	

}}
