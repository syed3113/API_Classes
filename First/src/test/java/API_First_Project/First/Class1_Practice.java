package API_First_Project.First;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Class1_Practice {
	
	
	public static void main(String[] args) {
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(" http://localhost:3000/posts/3");
		System.out.println("Status Code:-"+res.statusCode());
		System.out.println("Data:-"+res.asString());
		
		
		
		Response res1=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get("  http://localhost:3000/comments");
				System.out.println("Status Code:-"+res1.statusCode());
				System.out.println("Data:-"+res1.asString());
				
				Response res2=
						given()
						.contentType(ContentType.JSON)
						.when()
						.get("  http://localhost:3000/profile");
						System.out.println("Status Code:-"+res2.statusCode());
						System.out.println("Data:-"+res2.asString());
		
		
	}

}
