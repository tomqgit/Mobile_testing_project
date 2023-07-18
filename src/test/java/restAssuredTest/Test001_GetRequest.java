package restAssuredTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test001_GetRequest {

	
	@Test
	void getWeatherDetails () {
		
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		//http://restapi.demoqa.com/utilities/weather/city/
		
		
		RequestSpecification requestSpecification = RestAssured.given();
		
		
		Response response=requestSpecification.request(Method.GET,"/employees/?employee_name=Caesar Vance");
		//String responseBody = response.getBody().asPrettyString();
		//System.out.println(responseBody);
		
		JsonPath jsonpath = response.jsonPath();
		
		System.out.println(jsonpath.get("id"));
		System.out.println(jsonpath.get("employee_name"));
		System.out.println(jsonpath.get("employee_salary"));
		System.out.println(jsonpath.get("employee_age"));
		System.out.println(jsonpath.get("profile_image"));
		
		
		
		
		
		
		
	}
	
}
