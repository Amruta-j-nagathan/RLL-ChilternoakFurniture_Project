package com.app.pagefactory;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;


public class Base {
	
   public static WebDriver driver;
	
	@Before()
	public static void openBrowser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.chilternoakfurniture.co.uk/");
	}
	
	public static WebDriver GetDriver() {
		
		return driver;
	}
	
	@After()
	public static void teardown(Scenario scenario) {
		
		if (scenario.isFailed()) {
            // Capture screenshot on test case failure
            try {
                File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                String screenshotPath = "C:\\Users\\DELL\\OneDrive\\Pictures\\Screenshots\\RLL" + scenario.getName() + ".png";
                FileUtils.copyFile(screenshotFile, new File(screenshotPath));
                System.out.println("Screenshot captured: " + screenshotPath);

                // Embed screenshot in the extent report
                byte[] screenshotBytes = FileUtils.readFileToByteArray(screenshotFile);
                scenario.attach(screenshotBytes, "image/png", "Failure Screenshot");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Close the browser
        if (driver != null) {
            driver.quit();
        }
		
		
		//driver.close();
	}

}