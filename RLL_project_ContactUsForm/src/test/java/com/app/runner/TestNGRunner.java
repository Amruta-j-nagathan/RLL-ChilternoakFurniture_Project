package com.app.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="C:\\Users\\DELL\\eclipse-workspace\\RLL_Project_ContactUs\\RLL_project_ContactUsForm\\src\\test\\resource\\features\\ContactUs.feature",
glue={"com.app.stepdefs","com.app.pagefactory"},
plugin={"pretty","html:target/CucumberReports/CucumberReport.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})



public class TestNGRunner extends AbstractTestNGCucumberTests {

}
