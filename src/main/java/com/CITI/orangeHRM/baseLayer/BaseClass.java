package com.CITI.orangeHRM.baseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	final public static Logger logger=Logger.getLogger(BaseClass.class);
	protected static Properties prop;
	
	
	public BaseClass() {
		prop = new Properties();
		PropertyConfigurator.configure("C:\\Users\\Prathamesh\\OrangeHRM\\BddAssignment\\BddAssignmentOrangeHRM\\src\\main\\java\\com\\CITI\\orangeHRM\\configLayer\\log4j.properties");
		
		
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\Prathamesh\\OrangeHRM\\BddAssignment\\BddAssignmentOrangeHRM\\src\\main\\java\\com\\CITI\\orangeHRM\\configLayer\\config.properties");
			
			prop.load(fis);
			logger.info("Properties File Loaded");
		} catch (Exception e) {
			logger.error("Failed to load properties file"+e.getMessage());
			e.printStackTrace();
		}
		
		
		
	}

	public static void inilization() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		logger.info("Chrome browser Initiated successfully");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		logger.info("OrangeHRM application opened");
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}

}
