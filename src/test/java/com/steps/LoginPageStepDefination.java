package com.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefination {
	
	@Given("I am on Login Page")
	public void iAmOnLoginPage() {
	System.out.println("I am on Login Page");	
	}
	
	@When("I enter valid username and password")
	public void enterValidUserCredential() {
		System.out.println("I enter valid username and password");		
	}
	@Then("I am able to login successfully")
	public void loginSuccessfully() {
		System.out.println("I am able to login successfully");		
	}
	
	@When("I enter invalid username and password")
	public void enterInValidUserCredential() {
		System.out.println("I enter invalid username and password");		
	}
	@Then("I am not able to login successfully")
	public void loginUnSuccessfully() {
		System.out.println("I am not able to login successfully");
		System.out.println("Error message Login failure now");
		
	}
	

}
