package API_First_Project.First;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Class1 {
	
	
	public static void main(String[] args) {
		//RestAssured --- First write add static & .* in import than delete rest assured
		/*
		 * Response res= given() .contentType(ContentType.JSON) .when()
		 * .get("  http://localhost:3000/posts/2"); //1 for record number you want to
		 * access //.delete(" http://localhost:3000/posts/2");
		 * System.out.println("Status Code is " +res.statusCode());
		 * System.out.println(res.asString());
		 */
		
		Data d = new Data();
		d.setId(3);
		d.setAuthor("Syed");
		d.setName("Ali");
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(d)
		.when()
		.post(" http://localhost:3000/posts");
		
		System.out.println("Status Code is " +res.statusCode());
		 System.out.println(res.asString());
		
	}
	
	
	

}
