package com.zionverse.myrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/avinash/eclipse-workspace/Project_Zionverse/Features",tags="@Sanity",
		glue = {"com.zionverse.stepDefinitions"},
		monochrome = true,
		plugin = {"pretty",
//				"html:target/reports/cucumber.html",
//				"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"
				}
				
		)
public class TestRunner {

}

