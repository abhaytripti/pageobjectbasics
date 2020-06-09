package com.automation.listeners;

import java.io.IOException;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.automation.base.Page;

import com.automation.utilities.Utilities;
import com.relevantcodes.extentreports.LogStatus;

public class CustomListners extends Page implements ITestListener {
	
	public void onFinish(ITestContext arg0) {
		
			
	}
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
		
	}
	public void onTestFailure(ITestResult arg0) {
		System.setProperty("org.uncommons.reportng.escape-output","false");
		try {
			Utilities.captureScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		test.log(LogStatus.FAIL, arg0.getName().toUpperCase()+"Failed with exception:"+arg0.getThrowable());
		test.log(LogStatus.FAIL, test.addScreenCapture(Utilities.screenshotName));
		Reporter.log("Click to see Screenshot");
		 //to show screenshot as link in reportNG emailed report and html report
		 //Reporter.log("<a href=\"C:\\Tripti\\AutomationTesting\\SeleniumTesting\\screenshot\\error.jpg\">screenshot</a>");
		 //to open link in different tab
		 Reporter.log("<a target=\" _blank\" href="+Utilities.screenshotName+">screenshot</a>");
		 Reporter.log("<br>");
		 Reporter.log("<a target=\" _blank\" href="+Utilities.screenshotName+" ><img src ="+Utilities.screenshotName+"height=200 width=200></img></a>");
		 rep.endTest(test);
			rep.flush();
	}
	public void onTestSkipped(ITestResult arg0) {
		
	test.log(LogStatus.SKIP, arg0.getName().toUpperCase()+" Skipped the test as the runmode is NO");	
	rep.endTest(test);
	rep.flush();
	}	
	
	public void onTestStart(ITestResult arg0) {
		test=rep.startTest(arg0.getName().toUpperCase());
		
		//runmodes -Y
		//System.out.println(!Utilities.isTestRunnable(arg0.getName(), excel));
		
	}

	public void onTestSuccess(ITestResult arg0) {
		test.log(LogStatus.PASS, arg0.getName().toUpperCase()+"PASS");
		rep.endTest(test);
		rep.flush();
	}

	
	public void onTestFailedWithTimeout(ITestResult arg0) {
		// TODO Auto-generated method stub
	
	}
	

	
	
	

}
