package com.CITI.orangeHRM.pageLayer;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CITI.orangeHRM.baseLayer.BaseClass;
import com.CITI.orangeHRM.utilsLayer.WebElementActions;

public class LoginPage extends BaseClass {

	@FindBy(xpath = "//input[@name='username']")
	private WebElement UserName;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement Password ;
	
	@FindBy(xpath = "//button[text()=' Login ']")
	private WebElement LoginButton ;
	
	@FindBy(xpath = "//p[text()='Forgot your password? ']")
	private WebElement ForgotPassword;


	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public  void login(String username, String password)
	{
	
		WebElementActions.enterTextInTextBox(UserName, username);
		logger.info("UserName entered");
		WebElementActions.enterTextInTextBox(Password, password);
		logger.info("Password entered");
		WebElementActions.clickOnElement(LoginButton);
		logger.info("Clicked on Login Button");
	}

	
	
}
