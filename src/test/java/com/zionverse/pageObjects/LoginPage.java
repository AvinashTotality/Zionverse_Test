package com.zionverse.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zionverse.base.BasePage;
import com.zionverse.utils.HelperFunction;

import dev.failsafe.Timeout;

public class LoginPage extends BasePage{

	 
	WebDriverWait waitdriver;
	HelperFunction hp;
	

	By Home_Login_Button = By.xpath("//span[text()='login']");
	By EmailID_Textfield = By.xpath("//input[@placeholder='Email']");
	By Password_Textfield = By.xpath("//input[@placeholder='Password']");
	By Popup_Login_Button = By.xpath("//button[text()='login']");
	By Home_Profile_Button = By.xpath("//a[text()='Profile']");
	By txt_OTP = By.xpath("(//input[@name='txtOTP'])[1]");
	By btn_Verify= By.xpath("//button[text()='Verify']");
	

	public void verify_Zionverse_Page_Launch() throws InterruptedException {
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
	
	public void enter_Two_Authentication_Code() {
		hp=new HelperFunction();
		String twoAuthCode=hp.getTwoFactorCode("DPFIWECTQSATDVSGYIEB5W4MRZVHHXJW");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(txt_OTP).click();
		driver.findElement(txt_OTP).sendKeys(twoAuthCode);
		driver.findElement(btn_Verify).click();
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
