package com.clipboard.listeners;



import com.clipboard.reports.ExtentLogger;
import com.clipboard.reports.ExtentReport;
import org.testng.*;




public class TestListener implements ITestListener, ISuiteListener {


    @Override
    public void onTestStart(ITestResult result) {

        ExtentReport.createTest(result.getMethod().getMethodName());

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentLogger.pass(result.getMethod().getMethodName()+ "is passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentLogger.fail(result.getMethod().getMethodName()+ "is failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentLogger.skip(result.getMethod().getMethodName() +"is skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        //for future use
    }

    @Override
    public void onStart(ITestContext context) {
        //for future use
    }

    @Override
    public void onFinish(ITestContext context) {
        //for future use
    }

    @Override
    public void onStart(ISuite suite) {
        ExtentReport.initReports();
    }

    @Override
    public void onFinish(ISuite suite) {
        ExtentReport.flushReports();
    }
}
