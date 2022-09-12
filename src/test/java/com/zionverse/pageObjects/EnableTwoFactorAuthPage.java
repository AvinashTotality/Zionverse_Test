package com.zionverse.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.zionverse.base.BasePage;
import com.zionverse.utils.HelperFunction;

public class EnableTwoFactorAuthPage extends BasePage {

	By btn_Setting = By.xpath("//div[contains(@class,'navList')]/div[text()='Settings']");
	By btn_2FASecurity = By.xpath("//button[text()='2FA security']");
	By btn_Activate2FA = By.xpath("//button[text()='ACTIVATE 2FA']");
	By input_Account_Password = By.xpath("//input[@placeholder='Account Password']");
	By btn_Continue = By.xpath("//button[text()='Continue']");
	By txt_barcode = By.xpath("//p[contains(@class,'bg-white text-3xs md:text-sm w-40 md:w-72 inline-block')]");
	By input_Secret_Code = By.xpath("//input[@name='authCode']");
	By btn_Activate = By.xpath("//button[text()='Activate']");
	By txt_Enable2FA_Success= By.xpath("//div[text()='TWO FACTOR AUTHENTICATION ENABLED']");

	public void click_On_Setting_Button() {

		driver.findElement(btn_Setting).click();

	}

	public void click_On_2FASecurity_Button() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(btn_2FASecurity).click();

	}

	public void click_On_Active2FA_Button() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(btn_Activate2FA).click();

	}

	public void enter_Account_Password(String acc_password) {

		driver.findElement(input_Account_Password).sendKeys(acc_password);
	}

	public void click_On_Continue_Button() {

		driver.findElement(btn_Continue).click();
	}

	public void enter_Secret_Code() {
		
		HelperFunction hp = new HelperFunction();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String barcode = driver.findElement(txt_barcode).getText();
		System.out.println("Bar code:: " + barcode);
		String authCode = hp.getTwoFactorCode(barcode);
		driver.findElement(txt_barcode).click();
		driver.findElement(input_Secret_Code).sendKeys(authCode);

	}

	public void click_On_Activate_Button() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(btn_Activate).click();
	}

	public void verify_Enable_2FA_Successfully() {
		
		driver.findElement(txt_Enable2FA_Success).isDisplayed();

	}

}
