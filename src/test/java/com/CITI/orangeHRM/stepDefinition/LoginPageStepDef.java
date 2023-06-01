package com.CITI.orangeHRM.stepDefinition;

import com.CITI.orangeHRM.baseLayer.BaseClass;
import com.CITI.orangeHRM.pageLayer.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef extends BaseClass {
	
	@Given("User is on LoginPage")
	public void user_is_on_login_page() {
	   BaseClass.inilization();
	   logger.info("Login Page Opened");
	}

	@When("User enter valid username  {string} and password  {string} and click on loginButton")
	public void user_enter_valid_username_and_password_and_click_on_login_button(String Username, String password) {
	  LoginPage loginPage=new LoginPage();
	  loginPage.login(Username, password);
	  
	}

	@Then("user will be on Homepage")
	public void user_will_be_on_homepage() {
	   
	}

}
