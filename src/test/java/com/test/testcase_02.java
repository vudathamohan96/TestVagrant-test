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
	  
	RestAssured.baseURI="https://apigenerator.dronahq.com/api";
    	RequestSpecification req=RestAssured.given();
    	Response response=req.request(Method.GET,"/zLGH-lnj/data");
    
    	
    	List<String> obj=response.path("player[0].findAll{it.country!='India'}");
    	System.out.println(obj.toString());
    	System.out.println("Total number of Foreign players: "+obj.size());
    }
}
