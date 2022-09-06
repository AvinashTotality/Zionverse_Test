package com.zionverse.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;

public class BasePage {

	public static WebDriver driver;
	public static String browserName = "chrome";
	public static Properties prop;

	public BasePage() {

		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"/Users/avinash/eclipse-workspace/Project_ZV/Zionverse_Test/Config/Configuration.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		}

	}
	

	public  WebDriver driverInitialization() {
		
		String browserName=prop.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/avinash/Downloads/chromedriver");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("safari")) {

		}

		return driver;
		
	}
}
