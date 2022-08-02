# Rest API testing using Rest-Assured Java
-> This is repository of basic REST API testing framework 

-> Converted JSON response to API.

-> The public API used for this example is - https://apigenerator.dronahq.com/api/zLGH-lnj/data

-> This framework is developed using Rest-Assured library for Rest API testing

# Validated JSON response using Groovy Script 
-----------------------------------------------------------------------------
import groovy.json.JsonSlurper

def jsonSlurper = new JsonSlurper()

    def object = jsonSlurper.parseText(
    
          '{"name":"Royal Challengers Bangalore","location":"Bangalore","player":[{"name":"Faf Du Plessis","country":"South Africa","role":"Batsman","price-in-crores":"7"},{"name":"Virat Kohli","country":"India","role":"Batsman","price-in-crores":"15"},{"name":"Glenn Maxwell","country":"Australia","role":"Batsman","price-in-crores":"11"},{"name":"Mohammad Siraj","country":"India","role":"Bowler","price-in-crores":"7"},{"name":"Harshal Patel","country":"India","role":"Bowler","price-in-crores":"10.75"},{"name":"Wanindu Hasaranga","country":"Srilanka","role":"Bowler","price-in-crores":"10.75"},{"name":"Dinesh Karthik","country":"India","role":"Wicket-keeper","price-in-crores":"5.5"},{"name":"Shahbaz Ahmed","country":"India","role":"All-Rounder","price-in-crores":"2.4"},{"name":"Rajat Patidar","country":"India","role":"Batsman","price-in-crores":"0.20"},{"name":"Josh Hazlewood","country":"Australia","role":"Bowler","price-in-crores":"7.75"},{"name":"Mahipal Lomror","country":"India","role":"Bowler","price-in-crores":"7.75"}]}')

object.player.findAll { it.country!= 'India'}.size
------------------------------------------------------------------------------

# Below are instructions are how to execute Rest API test using Rest Assured Java library
-> You can open each test class on src\test\java and execute all of them (or)

-> Go to project folder where i have created testng. xml file.
   Select the testng. xml file, right-click on it, and select Run As option and then go to TestNG suite option.
   The eclipse will execute XML file as TestNG suite.
