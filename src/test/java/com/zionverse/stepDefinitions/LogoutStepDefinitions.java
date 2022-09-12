package com.zionverse.stepDefinitions;

import com.zionverse.pageObjects.LogoutPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDefinitions {
	LogoutPage lp;
	@When("Click on the logout button")
	public void click_on_the_logout_button() {
	    lp=new LogoutPage();
	    lp.click_On_Logout_Button();
	}

	@Then("Verify user logout successffully")
	public void verify_user_logout_successffully() {
	    
	}
}
