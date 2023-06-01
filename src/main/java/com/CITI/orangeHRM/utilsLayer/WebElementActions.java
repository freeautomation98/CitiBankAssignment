package com.CITI.orangeHRM.utilsLayer;

import org.openqa.selenium.WebElement;

import com.CITI.orangeHRM.baseLayer.BaseClass;

public class WebElementActions  extends BaseClass
{

	public static void enterTextInTextBox(WebElement wb,String value)
	{
		if((wb.isDisplayed())&&(wb.isEnabled()))
		{
			wb.sendKeys(value);
		}
	}
	
	public static void clickOnElement(WebElement wb)
	{
		if((wb.isDisplayed())&&(wb.isEnabled()))
		{
			wb.click();
		}
	}
	
}	