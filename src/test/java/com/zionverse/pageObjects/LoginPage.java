package com.zionverse.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zionverse.base.BasePage;

public class LoginPage extends BasePage{

	 
	WebDriverWait waitdriver;

	By Home_Login_Button = By.xpath("//span[text()='login']");
	By EmailID_Textfield = By.xpath("//input[@placeholder='Email']");
	By Password_Textfield = By.xpath("//input[@placeholder='Password']");
	By Popup_Login_Button = By.xpath("//button[text()='login']");
	By Home_Profile_Button = By.xpath("//a[text()='Profile']");

//	public LoginPage(driver) {
//		System.out.println("Step-2");
//		this.driver = driver;
////		System.out.println("Driver Value:: " + driver);
//		System.out.println("Step-3");
//	}

	public void verify_Zionverse_Page_Launch() throws InterruptedException {
//		System.out.println("Verify Chrome launch Sucessfully");
		System.out.println("Driver Value:: " + driver);
		System.out.println("Step-4");
		driver.get("https://www.zionverse.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(Home_Login_Button).isDisplayed();
		System.out.println("Step-5");
	}

	public void enter_Email_And_Password(String email, String password) {
		System.out.println("Step-8");
		driver.findElement(Home_Login_Button).click();
		driver.findElement(EmailID_Textfield).sendKeys(email);
		driver.findElement(Password_Textfield).sendKeys(password);
		System.out.println("Step-9");

	}

	public void click_On_Login() {
		System.out.println("Step-12");
		driver.findElement(Popup_Login_Button).click();
		System.out.println("Step-13");
	}

	public void verify_Login_Successfully() throws InterruptedException {
		System.out.println("Step-15");
		Thread.sleep(5000);
		driver.findElement(Home_Profile_Button).isDisplayed();
		System.out.println("Step-16");

	}

}
