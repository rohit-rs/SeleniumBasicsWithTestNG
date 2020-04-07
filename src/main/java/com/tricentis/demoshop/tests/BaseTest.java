package com.tricentis.demoshop.tests;

import org.testng.annotations.BeforeClass;
import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.tricentis.demoshop.methods.BaseMethods;


public class BaseTest {

	@BeforeClass(alwaysRun = true)
	public void beforeClass() throws IOException {
		BaseMethods.initialize();
	}

	@BeforeTest(alwaysRun = true)
	public void beforeTest() throws IOException {
		BaseMethods.launchBrowser();
	}

	@AfterTest(alwaysRun = true)
	public void afterTest() {
		BaseMethods.closeBroswer();
	}
	
}
