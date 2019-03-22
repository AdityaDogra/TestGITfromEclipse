package main_package;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Test_case_Listner extends Base_Utils implements ITestListener {

	public Test_case_Listner() throws IOException {
		super();
		
	}

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+" got failed");
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			screenshot(driver, result.getMethod().getMethodName() );
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+" got passed");
		try {
			screenshot(driver, result.getMethod().getMethodName() );
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
