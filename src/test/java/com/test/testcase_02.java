package com.test;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class testcase_02 {
	@Test(enabled=true)
	public void TestCase_02(){
	  
		RestAssured.baseURI="https://apigenerator.dronahq.com/api/";
    	RequestSpecification req=RestAssured.given();
    	Response response=req.request(Method.GET,"/zLGH-lnj/data");
    	//response.then().body("country",Matchers.hasSize(11));
    	
    	JsonPath jsonPathEvaluator = response.jsonPath();

    	
    	List<String> all = jsonPathEvaluator.getList("country");

    
    	for(String country : all)
    	{
    		System.out.println("Country " + country);
    	}
    }
}
