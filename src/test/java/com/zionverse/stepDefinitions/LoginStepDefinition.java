package com.zionverse.stepDefinitions;

import com.zionverse.base.BasePage;
import com.zionverse.pageObjects.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BasePage {

	LoginPage loginpage;

	@Given("Landing on the zionverse page")
	public void landing_on_the_zionverse_page() throws InterruptedException {
		System.out.println("Step-1");
		driverInitialization();
		loginpage = new LoginPage();
		loginpage.verify_Zionverse_Page_Launch();
		System.out.println("Step-6");

	}

	@When("Enter email id {string} and password {string}")
	public void enter_email_id_and_password(String email, String password) {
		System.out.println("Step-7");
//		System.out.println("**** Enter emailid:: " + email + "password::" + password + "****");
		loginpage.enter_Email_And_Password(email, password);
		System.out.println("Step-10");

	}

	@And("Click on the login button")
	public void click_on_the_login_button() {
//		System.out.println("**** Click on the Login button ****");
		System.out.println("Step-11");
		loginpage.click_On_Login();
	}
	
	@When("Enter valid two authenticator code")
	public void enter_valid_two_authenticator_code() {
	    loginpage.enter_Two_Authentication_Code();
	}

	@Then("Verify user login successfully")
	public void verify_user_login_successfully() throws InterruptedException {
//		System.out.println("**** Verify user login successfully ****");
		System.out.println("Step-14");
		loginpage.verify_Login_Successfully();
		 System.out.println("Step-17");
		
	}
}
