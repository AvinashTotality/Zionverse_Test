package com.zionverse.myrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Features"},
		glue = {"com.zionverse.stepDefinitions"},
		monochrome = true,
		dryRun = true,
		plugin = {"pretty",
				"json:target/Cucumber.json"
//				"html:target/cucumber-reports"
//				"html:target/reports/cucumber.html",
//				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
				}
				
		)
public class TestRunner {

}

