package com.tricentis.demoshop.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import com.tricentis.demoshop.listeners.CustomListeners;
import com.tricentis.demoshop.methods.baseMethods;
import com.tricentis.demoshop.methods.businessMethods;

@Listeners(CustomListeners.class)

public class SmokeTest extends BaseTest {

	@Test(groups = {"login"})
	public void smoke_tc_01() {
		baseMethods.openUrl(baseMethods.testData.getProperty("URL"));
		businessMethods.clickOnElement(baseMethods.elementSelectors.getProperty("Log in"));
		businessMethods.verifyPageURLsubString("login");
		businessMethods.enterDataInTxtField(baseMethods.elementSelectors.getProperty("Email"), baseMethods.testData.getProperty("username"));
		businessMethods.enterDataInTxtField(baseMethods.elementSelectors.getProperty("Password"), baseMethods.testData.getProperty("password"));
		businessMethods.clickOnElement(baseMethods.elementSelectors.getProperty("Remember me"));
		businessMethods.clickOnElement(baseMethods.elementSelectors.getProperty("Log in button"));
		businessMethods.clickOnElement(baseMethods.elementSelectors.getProperty("Log out"));
		}
	
	@Test(groups = {"books"})
	public void smoke_tc_02() {
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
