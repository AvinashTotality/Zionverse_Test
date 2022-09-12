package com.zionverse.utils;

import org.jboss.aerogear.security.otp.Totp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.zionverse.base.BasePage;

public class HelperFunction extends BasePage{
	

	// Generate google authentication code
	public  String getTwoFactorCode(String barcode) {
		Totp tcode = new Totp(barcode);
		String twoFactorCode = tcode.now();
		return twoFactorCode;
	}

	public static void uploadFile(By locator, String filePath) {
		
		WebElement upload_file = driver.findElement(locator);
		upload_file.sendKeys(filePath);
	}
}
