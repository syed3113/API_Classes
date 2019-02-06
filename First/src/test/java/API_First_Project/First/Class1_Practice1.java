package API_First_Project.First;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Class1_Practice1 {

	public static void main(String[] args) {
		
		
		Class1_Data d = new Class1_Data();
		d.setId(2);
		d.setAuthor("Ahtisham");
		d.setName("Ali");
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(d)
		.when()
		.post(" http://localhost:3000/posts");
		System.out.println("Status Code is "+res.statusCode());
		System.out.println("Data:-"+res.asString());
	}
	
}
