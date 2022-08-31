package com.zionverse.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/avinash/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//span[text()='login']")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("avinash@totalitycorp.com");
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Avinash@123");
//		driver.findElement(By.xpath("//button[text()='login']")).click();
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
//		driver.findElement(By.xpath("//a[text()='Profile']")).click();
//		
//		//KYC completed
//		driver.findElement(By.xpath("//p[text()='Complete Your KYC']")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Full Name as on ID']")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Full Name as on ID']")).sendKeys("Avinash Singh");
//		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
//		driver.findElement(By.xpath("//input[@name='agree']")).click();
//		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
//		driver.findElement(By.xpath("//label[text()='pan card']")).click();
//		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
//		driver.findElement(By.xpath("//label[text()='Upload ID']")).click();
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
//		WebElement upload_file = driver.findElement(By.xpath("//input[@id='file-upload']"));
//
//		upload_file.sendKeys("/Users/avinash/Documents/Documents/PAN.jpeg");
//		driver.findElement(By.xpath("//button[text()='cancel']")).click();
//		driver.findElement(By.xpath("//button[text()='continue']")).click();
//		driver.findElement(By.xpath("//label[@for='file-upload']")).sendKeys("/Users/avinash/Documents/Documents/PAN");
	}
}
