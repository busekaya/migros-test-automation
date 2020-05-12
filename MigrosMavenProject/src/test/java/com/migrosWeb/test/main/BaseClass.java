package com.migrosWeb.test.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver = null;
	public static WebDriverWait wait;
	public static Properties config = null;
	
	public void LoadConfigProperty() throws IOException {
		config = new Properties();
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//config//config.properties");
		config.load(ip);
	}
	
	   
	public void openBrowser() throws Exception {
		// loads the config options
		LoadConfigProperty();
		
		try {
		// configures the driver path
		if (config.getProperty("browserType").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//src//test//lib//geckodriver.exe");
    		driver = new FirefoxDriver();
		} else if (config.getProperty("browserType").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//test//lib//chromedriver.exe");
 			driver = new ChromeDriver();
 			}
		
		}
		  
	   	catch (WebDriverException e){  
	   		
	  		System.out.println("Browser not found " +e.getMessage());
	    	}
	}
	

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void implicitWait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public void visibleElementWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public void visibleTextWait(WebElement element, String msg) {
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.textToBePresentInElementValue(element, msg));
	}
	
	public void invisibleElementtWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	
	public void pageLoad(int time) {
		driver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
	}

	public void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}
	

	public void setEnv() throws Exception {
		LoadConfigProperty();
		String baseUrl = config.getProperty("siteUrl");
		driver.get(baseUrl);
	}


	
}