package com.zionverse.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	WebDriverWait waitdriver;
	
	
	By Home_Login_Button = By.xpath("//span[text()='login']");
	By EmailID_Textfield = By.xpath("//input[@placeholder='Email']");
	By Password_Textfield = By.xpath("//input[@placeholder='Password']");
	By Popup_Login_Button = By.xpath("//button[text()='login']");
	By Home_Profile_Button= By.xpath("//a[text()='Profile']");
	
	public LoginPage(WebDriver driver) {
		System.out.println("Driver Value:: " +driver);
		this.driver=driver;
	}
	
	public void enter_Email_And_Password(String email, String password) {
		
		driver.findElement(Home_Login_Button).click();
		driver.findElement(EmailID_Textfield).sendKeys(email);
		driver.findElement(Password_Textfield).sendKeys(password);
		
	}
	
	public void  click_On_Login() {
		
		driver.findElement(Popup_Login_Button).click();
	}
	
	public void verify_Login_Successfully() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.findElement(Home_Profile_Button).isDisplayed();
		
	}

}
