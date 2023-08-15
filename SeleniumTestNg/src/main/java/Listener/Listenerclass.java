package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Listenerclass implements ITestListener{

	//   public static ExtentSparkReporter extentRepoter;
	 public static ExtentReports ententReports;
	@Override
	public void onStart(ITestContext context) {
		ExtentReportClass.setUp();
		System.out.println("Suit is started name is : "+context.getSuite().getName());
		
	
		
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		
	
		System.out.println("Test cases is started name is : "+result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		TakeScreenshot.screenShot(result.getMethod().getMethodName());
		System.out.println("Test cases is Pass name is : "+result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		ExtentReportClass.setUp().flush();
		System.out.println("Test cases is fail name is : "+result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	

		System.out.println("Test suit is ended name is : "+result.getMethod().getMethodName());
		ententReports.flush();
	}

	

	@Override
	public void onFinish(ITestContext context) {
		
	}
	
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	

}
