package com.zionverse.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	
	public static WebDriver driver;
	
	public WebDriver launchBrowser() {
//		if(System.getProperty(os.name)) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/avinash/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.zionverse.com/");
		driver.manage().window().maximize();
		return driver;
//		}
	}
}
