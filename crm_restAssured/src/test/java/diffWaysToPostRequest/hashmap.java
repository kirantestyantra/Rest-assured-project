package diffWaysToPostRequest;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class hashmap {
@Test
public void create() {
	
			Random random=new Random();
			int randomNo=random.nextInt(1000);//used to give a unique name every time
			
			HashMap map=new HashMap();
			map.put("created by","TYSS_purple"+randomNo);
			map.put("projectName","tyss_440"+randomNo);
			map.put("status","created");
			map.put("teamsize","39");
			
			given()
			
			.contentType(ContentType.JSON)
			    .body(map)
			.when()
			    .post("http://localhost:8084/addProject")
			.then()
			    .assertThat().statusCode(201).contentType(ContentType.JSON).log().all();	
}
}
