package API_First_Project.First;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class TweetFetch {
	
	
	public static void main(String[] args) {
		
		String consumer_key="jEzVlQurQdCGfwaS5uNpKCnp7";
		String consumer_secret="hqqsHoPgBnShqEJ5rElzUQ9Lhc5Rau6xbSYQLJ9sbC1OU2ZS6c";
		String access_token="1097831318178557952-xIMQb3on5wUn9EQYCnPxwm38Se1C6B";
		String access_secret="e6RqRwnBKWzZKf4Hv0htDXm0JvgB7MsxsB2fz53bZbbpM";
		
		RestAssured.baseURI ="https://api.twitter.com/1.1/statuses";
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.auth()
		.oauth(consumer_key, consumer_secret, access_token, access_secret)
		.queryParam("count","2") // no of tweet you want to fetch
		.when()
		.get("/home_timeline.json");
		
		System.out.println(res.statusCode());
		System.out.println(res.asString());
		
		String tweet1 = res.jsonPath().get("[0].text");
		System.out.println("First Data:-" +tweet1);
		
		String tweet2 = res.jsonPath().get("[1].text");
		System.out.println("Second Data:-" +tweet2);
		
		
	}

}
