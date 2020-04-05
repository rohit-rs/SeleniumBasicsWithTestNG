package com.tricentis.demoshop.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.tricentis.demoshop.methods.baseMethods;
import com.tricentis.demoshop.methods.businessMethods;

public class Computers_Regression extends BaseTest {

	@Test
	public void computers_tc_01() {
		baseMethods.openUrl(baseMethods.testData.getProperty("URL"));
		businessMethods.clickOnElement(baseMethods.elementSelectors.getProperty("Log in"));
		businessMethods.verifyPageURLsubString("login");
		businessMethods.enterDataInTxtField(baseMethods.elementSelectors.getProperty("Email"), baseMethods.testData.getProperty("username"));
		businessMethods.enterDataInTxtField(baseMethods.elementSelectors.getProperty("Password"), baseMethods.testData.getProperty("password"));
		businessMethods.clickOnElement(baseMethods.elementSelectors.getProperty("Remember me"));
		businessMethods.clickOnElement(baseMethods.elementSelectors.getProperty("Log in button"));
		businessMethods.clickOnElement(baseMethods.elementSelectors.getProperty("Log out"));
		}

}
