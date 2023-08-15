package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Sample1 implements ITestListener {

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("Test Suit is started name is  "+context.getSuite().getName() );
		
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test cases is started name is   "+result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println(" Test cases is Pass name is  "+ result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test cases is fail name is  "+ result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test cases is skipped");

	}
	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("Test Suit is ended name is  "+context.getSuite().getName());
	}
	
	

}
