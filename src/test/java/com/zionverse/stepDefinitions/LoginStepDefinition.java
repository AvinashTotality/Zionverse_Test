package com.zionverse.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.zionverse.base.BasePage;
import com.zionverse.pageObjects.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDefinition{
	
	WebDriver driver=null;
	LoginPage loginpage;
	BasePage bp;
	
	@Before
	public void openBrowser() {
		bp=new BasePage();
		driver=bp.launchBrowser();
		
		
	}
//	public void navigateURL() {
//		
//		driver.get("https://www.zionverse.com/");
//		driver.manage().window().maximize();
//	}
//		
	@After
	public void closeBrowser() {
		driver.close();
	}

	
	
	@Given("Landing on the zionverse page")
	public void landing_on_the_zionverse_page() {
	    System.out.println("Step-1");
	    
//	    System.setProperty("webdriver.chrome.driver", "/Users/avinash/Downloads/chromedriver");
//		driver = new ChromeDriver();
//		driver.get("https://www.zionverse.com/");
//		driver.manage().window().maximize();;
	   
	}

	@When("Enter email id {string} and password {string}")
	public void enter_email_id_and_password(String email, String password) {
		System.out.println("Email Id:"+email+ "Password:"+ password);
		loginpage=new LoginPage(driver);
		loginpage.enter_Email_And_Password(email, password);
	}

	@And("Click on the login button")
	public void click_on_the_login_button() {
		
		loginpage.click_On_Login();
	}

	@Then("Verify user login successfully")
	public void verify_user_login_successfully() throws InterruptedException {
		
		loginpage.verify_Login_Successfully();
	}
}
