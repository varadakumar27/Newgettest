package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerDemo implements ITestListener {

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		 System.out.println("Screen shot captured====="+arg0.toString());
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		System.out.println("TestCase started====" +arg0.toString());
		
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Congrates Testcase has been passed===="+ arg0.toString());
	}

}
