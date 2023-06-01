package com.CITI.orangeHRM.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CITI.orangeHRM.baseLayer.BaseClass;
import com.CITI.orangeHRM.utilsLayer.WebElementActions;

public class HomePage extends BaseClass {
	@FindBy(xpath = "//span[text()='Admin']")
	private WebElement AdminPage;
	
	@FindBy(xpath = "//i[contains(@class,'bi-list')]")
	private WebElement MenuButton;
	
	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement PIMPage;
	
	public HomePage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void ClickOnMenu()
	{	
		WebElementActions.clickOnElement(MenuButton);
	}
	
	public void openAdminPage()
	{	
		WebElementActions.clickOnElement(AdminPage);
	}
	
	public void openPIMPage()
	{	
		WebElementActions.clickOnElement(PIMPage);
	}
	
	public String getTitle() {
		return driver.getTitle();
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

}
