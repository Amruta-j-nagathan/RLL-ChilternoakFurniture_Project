package com.app.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	WebDriver driver;
	
	public ContactUsPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	
	//Page Factory
	
	@FindBy(xpath ="//a[@href='/pages/contact']")
	WebElement ContactUs_link;
	
	
	@FindBy(xpath = "//input[@id='contactFormName']")
	WebElement Name;
	
	@FindBy(id = "contactFormEmail")
	WebElement Email;
	
	
	@FindBy(id = "contactFormTelephone")
	WebElement PhoneNo;
	
	
	@FindBy(id = "contactFormMessage")
	WebElement Message;
	
	@FindBy(id = "contactFormSubmit")
	WebElement Click_Send;
	
	@FindBy(xpath="//p[@class='shopify-challenge__message']")
	WebElement ConfirmationText;
	
	
	
	//Actions
	public void Click_contactUsLink() {
		
		ContactUs_link.click();
		
	}
	
	public void Give_Name(String name) throws InterruptedException {
		Thread.sleep(2000);
		Name.sendKeys(name);
	}

	public void give_Email(String emailid) throws InterruptedException {
		Thread.sleep(2000);
		Email.sendKeys(emailid);
	}
	
	public void give_Phone(String phone) throws InterruptedException {
		Thread.sleep(2000);
		PhoneNo.sendKeys(phone);
	}
	
	public void give_Message(String message) throws InterruptedException {
		Thread.sleep(2000);
		Message.sendKeys(message);
	}


	public void Click_Send() throws InterruptedException {
		Thread.sleep(2000);
		Click_Send.click();
		Thread.sleep(9000);

}
	public String validate_Confirmation_Text()
	{
		String confirmation_test = ConfirmationText.getText();
		return confirmation_test;
	}
	

}

