package com.test;

import java.util.List;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class testcase_01 {

	/*@BeforeClass
	public void setup() {
		RestAssured.baseURI = "https://apigenerator.dronahq.com/api";
       // RestAssured.basePath = "";
        RestAssured.requestSpecification = new RequestSpecBuilder().
                setContentType("application/json").
                build();
	}*/
	  @Test(enabled=true)
		public void TestCase_01(){
		  
			RestAssured.baseURI="https://apigenerator.dronahq.com/api/";
	    	RequestSpecification req=RestAssured.given();
	    	Response response=req.request(Method.GET,"/zLGH-lnj/data");
	    	response.then().body("Wicket-Keeper",Matchers.hasSize(1));
	    	
	  }
	  
	  }
	
	
