package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\DELL\\eclipse-workspace\\RLL_Project_ContactUs\\RLL_project_ContactUsForm\\src\\test\\resource\\features\\ContactUs.feature",
glue = {"com.app.stepdefs","com.app.pagefactory"},
plugin = {"pretty","html:target/cucumber/report.html",
		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		  "timeline:test-output-thread/"},monochrome = true)

public class JUnitRunner {

}
