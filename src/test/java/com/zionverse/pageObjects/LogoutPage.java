package com.zionverse.pageObjects;

import org.openqa.selenium.By;

import com.zionverse.base.BasePage;

public class LogoutPage extends BasePage {
	
	By btn_Logout = By.xpath("//div[contains(@class,'navList') and text()='Sign Out']");
	By btn_Logout_On_Popup = By.xpath("//button[text()='Sign Out']");
	
	public void click_On_Logout_Button() {
		
		driver.findElement(btn_Logout).click();
		driver.findElement(btn_Logout_On_Popup).click();
	}
}
