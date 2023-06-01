package com.CITI.orangeHRM.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CITI.orangeHRM.baseLayer.BaseClass;

public class PIMPage extends BaseClass {

	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement pimlink;

	@FindBy(xpath = "//a[text()='Add Employee']")
	private WebElement addEmployee;

	@FindBy(name = "firstName")
	private WebElement firstName;

	@FindBy(name = "lastName")
	private WebElement lastName;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement saveButton;

	@FindBy(xpath = "//label[text()='Employee Id']/preceding::input[1]")
	private WebElement EmployeeName;
	
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
	private WebElement deleteIcon;
	
	@FindBy(xpath = "//button[text()=' Yes, Delete ']")
	private WebElement yesDeleteButton;
	
	
	@FindBy(xpath = "//button[text()=' Search ']")
	private WebElement searchButton;
	
	public PIMPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnPimLink() throws InterruptedException {
		pimlink.click();
		logger.info("Clicked on PIM Link");
		Thread.sleep(1000);
	}
	

	public void addEmployee(String fname, String lname) throws InterruptedException {
		Thread.sleep(2000);
		addEmployee.click();
		logger.info("Clicked on Add Button");
		Thread.sleep(2000);
		firstName.sendKeys(fname);
		logger.info("Entered First Name");
		Thread.sleep(1000);
		lastName.sendKeys(lname);
		logger.info("Entered Last Name");
		Thread.sleep(2000);
		saveButton.click();
		logger.info("Clicked on Save Button");
	}
	
	public void searchEmployee(String existingUserName) throws InterruptedException
	{

		Thread.sleep(2000);
		EmployeeName.sendKeys(existingUserName);
		logger.info("Entered Employee Name");
		Thread.sleep(2000);
		searchButton.click();
		logger.info("Clicked on Search Button");
		Thread.sleep(2000);
		deleteIcon.click();
		logger.info("Clicked on Delete Button");
		Thread.sleep(2000);
		yesDeleteButton.click();
		logger.info("Clicked on Yes Delete Button");
	}

}
