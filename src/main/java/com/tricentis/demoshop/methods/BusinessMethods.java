package com.tricentis.demoshop.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;

public class BusinessMethods extends BaseMethods {

	public static void clickOnElement(String locator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(locator))).click();
		Reporter.log("[Clcked on element with locator: " + locator + " .]" , true);
	}
	public static void enterDataInTxtField(String locator, String data) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator))).sendKeys(data);
		Reporter.log("[Data: " + data + " is entered in field with locator " + locator + " .]" , true);
	}
	
	public static void verifyPageURLsubString(String urlSubString) {
		Assert.assertEquals(true, driver.getCurrentUrl().contains(urlSubString));
		Reporter.log("[Page URL contains: " + urlSubString + " .]");
	}
}
