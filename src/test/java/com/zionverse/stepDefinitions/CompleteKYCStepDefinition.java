package com.zionverse.stepDefinitions;

import com.zionverse.base.BasePage;
import com.zionverse.pageObjects.CompleteKYCPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CompleteKYCStepDefinition {

//	public static WebDriver driver = driverInitialization();
	CompleteKYCPage completekyc;

	@When("User Click on the profile button")
	public void user_click_on_the_profile_button() {

		System.out.println("Step-18");
		completekyc = new CompleteKYCPage();
		completekyc.click_On_Profile();
	}

	@And("User click on the KYC button")
	public void user_click_on_the_kyc_button() {

		completekyc.click_On_KYC_Button();

	}

	@And("Verify user details on the complete your KYC")
	public void verify_user_details_on_the_complete_your_kyc() {

		completekyc.verify_User_Details();
	}

	@And("Click on the proceed button")
	public void click_on_the_proceed_button() {

		completekyc.click_On_Proceed_Button();
	}

	@And("Click on the agree radio and proceed button")
	public void click_on_the_agree_radio_and_proceed_button() {

		completekyc.click_On_AgreeRadio_Button();
		completekyc.click_On_Proceed_Button();
	}

	@And("Click on the pan button and proceed button")
	public void click_on_the_pan_button_and_proceed_button() {

		completekyc.select_PanCard_Option();
		completekyc.click_On_Proceed_Button();
	}

	@And("Click on the upload id button")
	public void click_on_the_upload_id_button() {

		completekyc.select_Upload_ID_Option();

	}

	@And("Click on the upload link and select document")
	public void click_on_the_upload_link_and_select_document() {
		completekyc.click_On_Upload_And_Select_Documents();
	}
}
