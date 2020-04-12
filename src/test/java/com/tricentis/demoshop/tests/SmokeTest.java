package com.tricentis.demoshop.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import com.tricentis.demoshop.listeners.CustomListeners;
import com.tricentis.demoshop.methods.BaseMethods;
import com.tricentis.demoshop.methods.BusinessMethods;

@Listeners(CustomListeners.class)

public class SmokeTest extends BaseTest {

	@Test(groups = {"login"})
	public void smoke_tc_01() {
		BaseMethods.openUrl(BaseMethods.testData.getProperty("URL"));
		BusinessMethods.clickOnElement(BaseMethods.elementSelectors.getProperty("Log in"));
		BusinessMethods.verifyPageURLsubString("login");
		BusinessMethods.enterDataInTxtField(BaseMethods.elementSelectors.getProperty("Email"), BaseMethods.testData.getProperty("username"));
		BusinessMethods.enterDataInTxtField(BaseMethods.elementSelectors.getProperty("Password"), BaseMethods.testData.getProperty("password"));
		BusinessMethods.clickOnElement(BaseMethods.elementSelectors.getProperty("Remember me"));
		BusinessMethods.clickOnElement(BaseMethods.elementSelectors.getProperty("Log in button"));
		BusinessMethods.clickOnElement(BaseMethods.elementSelectors.getProperty("Log out"));
		}
	
	@Test(groups = {"books"})
	public void smoke_tc_02() {
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
