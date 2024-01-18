package runners;
import org.testng.annotations.Listeners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.ItestListener;

@CucumberOptions(
        features = {"C:\\Users\\DELL\\eclipse-workspace\\CucumberProject\\RLLProjectCucumber\\src\\test\\java\\features\\ContactUs.feature",
                    },
        glue = {"steps" },
        dryRun = false,
        plugin = {
            "pretty",
            "html:targettestng/cucumberreport_ContactUs.html",
            "json:targettestng/cucumber.json",
            "junit:targettestng/xmlReport.xml",
            "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:\", \"timeline:test-output-thread/"
            
          
        },
        monochrome=true
)

@Listeners(ItestListener.class)
public class TestNGRunner extends AbstractTestNGCucumberTests {
}
