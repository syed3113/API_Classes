package API_First_Project.First;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class MainArrayNotation {
	
	
	public static void main(String[] args) {
		
		Address[] address = new Address[2];
		address[0] = new Address();
		address[0].setHouseNumber(20);
		address[0].setLandmark("Ghaffar");
		address[0].setSector(44);
		
		address[1] = new Address();
		address[1].setHouseNumber(21);
		address[1].setLandmark("ILQA");
		address[1].setSector(40);
		
		BasicInformationArrayNotation basic = new BasicInformationArrayNotation();
	     basic.setId(10);
	     basic.setAuthor("Aligarh");
	     basic.setName("Ahti");
	     basic.setAddress(address);
	     
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(basic)
		.when()
		.post("http://localhost:3000/posts");
		System.out.println("Status Code:-"+res.statusCode());
		System.out.println("Data:-"+res.asString());
		
		int sector = res.jsonPath().get("address[1].houseNumber");
		System.out.println("Sector:-"+sector);
		
	}

}
