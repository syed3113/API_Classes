package API_First_Project.First;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Class2 {
	
	
	public static void main(String[] args) {
		
		
		Address address = new Address();
		address.setHouseNumber(18);
		address.setLandmark("Tender Heart School");
		address.setSector(62);
		
		
		BasicInformation basic = new BasicInformation();
		basic.setId(9);
		basic.setAuthor("Syed");
		basic.setName("Ahtisham");
		basic.setAddress(address);
		
		Response res=
		given()
        .contentType(ContentType.JSON)
        .body(basic)
        .when()
        .post(" http://localhost:3000/posts");
		System.out.println("Status Code:-"+res.getStatusCode());
        System.out.println("Data:-"+res.asString());
        
        int sector = res.jsonPath().get("address.sector");
        System.out.println(sector);
        
        //.then()
       // .statusCode(201);
		
		
		
		
		
		
	}
	

}
