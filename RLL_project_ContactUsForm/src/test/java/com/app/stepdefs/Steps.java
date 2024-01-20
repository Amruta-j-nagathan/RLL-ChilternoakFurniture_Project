package com.app.stepdefs;





import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
import com.app.pagefactory.*;
//import utilities.ItestListener;
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Files;

public class Steps  {
	private static final Logger logger = LogManager.getLogger(Steps.class);
	Base B;
	WebDriver driver= B.GetDriver();
	ContactUsPage cp = new ContactUsPage(Base.driver);
    
	@Given("I am on Chilternoak Furniture Homepage")
	public void i_am_on_chilternoak_furniture_homepage() {
		logger.info("Chilternoak Furniture Homepage");
		cp = new ContactUsPage(driver);
		//Base.openBrowser();
	}

	@When("I click on ContactUs link")
	public void i_click_on_contact_us_link() throws InterruptedException {
		
		logger.info("Clicking on ContactUs link");
		Thread.sleep(2000);
		cp.Click_contactUsLink();
	    
	}

	/*@Then("I will be on ContactUs Page and Capture the title of the page")
	public void i_will_be_on_contact_us_page_and_capture_the_title_of_the_page() {
		
		logger.info("Capturing the title of the page");
		
		//System.out.println("title of the is page is : "+ driver.getTitle());
	
		
		
	 
	}*/

	@Then("I entered name as {string} on the page")
	public void i_entered_name_as_on_the_page(String name) throws InterruptedException {
		logger.info("Entering the name");
	    cp.Give_Name(name);
	}

	@Then("I entered email id as {string} on the page")
	public void i_entered_email_id_as_on_the_page(String email) throws InterruptedException {
		logger.info("Entering the mail");
		cp.give_Email(email);
	    
	}

	@Then("I entered phone no as {string} on the page")
	public void i_entered_phone_no_as_on_the_page(String phone) throws InterruptedException {
		logger.info("Entering the Phone");
	    cp.give_Phone(phone);
	}

	@Then("I entered message as {string} on the page")
	public void i_entered_message_as_on_the_page(String message) throws InterruptedException {
		logger.info("Entering the message");
	    cp.give_Message(message);
	    
	    
	}

	@Then("I click on send button")
	public void i_click_on_send_button() throws InterruptedException {
		logger.info("Click on the send button");
	  cp.Click_Send();
	  Thread.sleep(5000);
	}
	
	@Then("It shoulld diplayed the message {string}")
	public void it_shoulld_diplayed_the_message(String Status) {
		logger.info("Messaged displayed");
		
		
		
			String expected = Status;
			String actualText = cp.validate_Confirmation_Text();
			Assert.assertTrue(actualText.contains(expected));
			
				
			}
				
		  
	}

	
    

      


