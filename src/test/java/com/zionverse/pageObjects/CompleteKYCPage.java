package com.zionverse.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.zionverse.base.BasePage;
import com.zionverse.utils.HelperFunction;

public class CompleteKYCPage extends BasePage {
//	WebDriver driver;

	By btn_Home_Profile = By.xpath("//a[text()='Profile']");
	By txt_Profile_Name = By.xpath("//div[text()='Vikash Johari ']");
	By btn_KYC_Button = By.xpath("//p[text()='Complete Your KYC']");
	By slct_Country_Name = By.xpath("//div[text()='India']");
	By txt_User_Name = By.xpath("//input[@value='Vikash Johari ']");
	By input_Name_Field = By.xpath("//input[@placeholder='Full Name as on ID']");
	By txt_EmailID = By.xpath("//input[@value='cauxetoibraki-1302@yopmail.com']");
	By btn_Proceed = By.xpath("//span[text()='Proceed']");
	By radiobtn_Agree = By.xpath("//input[@name='agree']");
	By radiobtn_PanCard= By.xpath("//label[text()='pan card']");
	By radiobtn_AadhaarCard= By.xpath("//label[text()='aadhaar card']");
	By input_AadharNumber = By.xpath("//input[@placeholder='ENTER CARD NO']");
	By btn_UploadID = By.xpath("//label[text()='Upload ID']");
	By input_Upload = By.xpath("//input[@id='file-upload']");
	By msg_Successfully = By.xpath("//h1[text()='verification successfull']");
	
	

	public void click_On_Profile() {
		System.out.println("Step-21");
		driver.findElement(btn_Home_Profile).isDisplayed();
		driver.findElement(btn_Home_Profile).click();
		System.out.println("Step-22");
	}

	public void click_On_KYC_Button() {

//		driver.findElement(txt_Profile_Name).isDisplayed();
		driver.findElement(btn_KYC_Button).click();

	}

	public void verify_User_Details() {

		driver.findElement(slct_Country_Name).isDisplayed();
		driver.findElement(input_Name_Field).sendKeys("Avinash Singh");
//		driver.findElement(txt_User_Name).isDisplayed();
		driver.findElement(txt_EmailID).isDisplayed();

	}
	
	public void click_On_Proceed_Button() {

		driver.findElement(btn_Proceed).click();

	}
	
	public void click_On_AgreeRadio_Button() {

		driver.findElement(radiobtn_Agree).click();

	}
	
	public void select_PanCard_Option() {

		driver.findElement(radiobtn_PanCard).click();

	}
	
	public void select_AadhaarCard_Option() {
		
		driver.findElement(radiobtn_AadhaarCard).click();
		driver.findElement(input_AadharNumber).sendKeys("496137120019");

	}
	
	public void select_Upload_ID_Option() {
		
		driver.findElement(btn_UploadID).click();
	}
	
	public void click_On_Upload_And_Select_Documents() {
	
		HelperFunction.uploadFile(input_Upload, "/Users/avinash/Documents/Documents/Avinash_Aadhaar_Front.jpeg");
		driver.findElement(By.xpath("//button[text()='cancel']")).click();
		driver.findElement(By.xpath("//button[text()='continue']")).click();
		HelperFunction.uploadFile(input_Upload, "/Users/avinash/Documents/Documents/Avinash_Aadhaar_back.jpeg");
		driver.findElement(By.xpath("//button[text()='cancel']")).click();
		driver.findElement(By.xpath("//button[text()='continue']")).click();
//		WebElement upload_file = driver.findElement(input_Upload);
//		driver.findElement(input_Upload).click();
//		upload_file.sendKeys("/Users/avinash/Documents/Documents/Amit_PAN.jpeg");
		
		
//		WebElement upload_file = driver.findElement(input_Upload);
//		//
//				upload_file.sendKeys("/Users/avinash/Documents/Documents/Amit_PAN.jpeg");
//				driver.findElement(By.xpath("//button[text()='cancel']")).click();
//				driver.findElement(By.xpath("//button[text()='continue']")).click();
//				driver.findElement(By.xpath("//label[@for='file-upload']")).sendKeys("/Users/avinash/Documents/Documents/PAN");
	}
	
	public void verify_KYC_Completed_Successfully() {
		
		driver.findElement(msg_Successfully).isDisplayed();
	}
	
	


}
