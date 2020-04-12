package com.tricentis.demoshop.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.tricentis.demoshop.methods.BaseMethods;
import com.tricentis.demoshop.methods.BusinessMethods;

public class Computers_RegressionTest extends BaseTest {

	@Test
	public void computers_tc_01() {
		BaseMethods.openUrl(BaseMethods.testData.getProperty("URL"));
		BusinessMethods.clickOnElement(BaseMethods.elementSelectors.getProperty("Log in"));
		BusinessMethods.verifyPageURLsubString("login");
		BusinessMethods.enterDataInTxtField(BaseMethods.elementSelectors.getProperty("Email"), BaseMethods.testData.getProperty("username"));
		BusinessMethods.enterDataInTxtField(BaseMethods.elementSelectors.getProperty("Password"), BaseMethods.testData.getProperty("password"));
		BusinessMethods.clickOnElement(BaseMethods.elementSelectors.getProperty("Remember me"));
		BusinessMethods.clickOnElement(BaseMethods.elementSelectors.getProperty("Log in button"));
		BusinessMethods.clickOnElement(BaseMethods.elementSelectors.getProperty("Log out"));
		}

}
