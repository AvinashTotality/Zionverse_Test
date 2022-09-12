package com.zionverse.stepDefinitions;

import com.zionverse.pageObjects.EnableTwoFactorAuthPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EnableTwoFactorAuthStepDefinition extends EnableTwoFactorAuthPage {

	@When("Click on the setting button in menu")
	public void click_on_the_setting_button_in_menu() {

		click_On_Setting_Button();
	}

	@When("Click on the 2fa security button")
	public void click_on_the_2fa_security_button() {

		click_On_2FASecurity_Button();
	}

	@When("Click on the activate 2fa button")
	public void click_on_the_activate_2fa_button() {

		click_On_Active2FA_Button();
	}

	@When("Enter account password {string} in password field")
	public void enter_account_password_in_password_field(String password) {

		enter_Account_Password(password);
	}

	@And("Click on the continue button")
	public void click_on_the_continue_button() {

		click_On_Continue_Button();
	}

	@And("Enter 2fa auth code")
	public void enter_2fa_auth_code() {

		enter_Secret_Code();
	}

	@And("Click on the activate button")
	public void click_on_the_activate_button() {

		click_On_Activate_Button();
	}

	@Then("Verify 2fa security activate successfully")
	public void verify_2fa_security_activate_successfully() {

		verify_Enable_2FA_Successfully();
	}

}
