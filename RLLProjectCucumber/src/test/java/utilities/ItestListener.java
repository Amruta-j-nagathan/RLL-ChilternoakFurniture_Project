package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ItestListener implements ITestListener {
    private ExtentReports extentReports;
    private ExtentTest extentTest;

    @Override
    public void onStart(ITestContext context) {
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("target/SparkReport.html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(sparkReporter);
    }

    @Override
    public void onTestStart(ITestResult Status) {
        extentTest = extentReports.createTest(Status.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult Status) {
        extentTest.fail(Status.getThrowable());
    }

    @Override
    public void onTestSuccess(ITestResult Status) {
        extentTest.pass("Test passed");
    }

    @Override
    public void onFinish(ITestContext context) {
        extentReports.flush();
    }
}


