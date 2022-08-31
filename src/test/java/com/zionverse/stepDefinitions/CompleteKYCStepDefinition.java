package com.zionverse.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.zionverse.pageObjects.CompleteKYCPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
 
public class CompleteKYCStepDefinition{
	WebDriver driver;
	CompleteKYCPage completekyc;
	
	@When("User click on the KYC button")
	public void user_click_on_the_kyc_button() {
		System.out.println("Drive:: " +driver);
		completekyc=new CompleteKYCPage(driver);
		completekyc.click_On_Profile();
		
		
	}

	@And("Verify user details on the complete your KYC")
	public void verify_user_details_on_the_complete_your_kyc() {
	   
	}

	@And("Click on the proceed button")
	public void click_on_the_proceed_button() {
	    
	}

	@And("Click on the agree radio and proceed button")
	public void click_on_the_agree_radio_and_proceed_button() {
	}

	@And("Click on the pan button and proceed button")
	public void click_on_the_pan_button_and_proceed_button() {
	   
	}

	@And("Click on the upload id button")
	public void click_on_the_upload_id_button() {
	   
	}

	@And("Click on the upload link and select document")
	public void click_on_the_upload_link_and_select_document() {
	    
	}
}
