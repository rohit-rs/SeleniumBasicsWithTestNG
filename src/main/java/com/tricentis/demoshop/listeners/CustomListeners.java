package com.tricentis.demoshop.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.tricentis.demoshop.methods.baseMethods;

public class CustomListeners implements ITestListener{

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		try {
			baseMethods.captureScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("[Test: " + result.getName() + " has been failed.]");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("[Test: " + result.getName() + " has been skipped.]");
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("[Test: " + result.getName() + " has been started.]");
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("[Test: " + result.getName() + " has successfully executed.]");
	}

}
