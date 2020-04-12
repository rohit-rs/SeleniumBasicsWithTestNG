package com.tricentis.demoshop.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class TestDummySmokeTest {
	
	WebDriver driver;
	WebDriverWait wait;
	String url = "http://demowebshop.tricentis.com/";
	
  @Test
  public void f() {
	  driver.get(url);
	  driver.findElement(By.cssSelector("a[href='/login']")).click();
  }
  @BeforeClass
  public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "Dependent_Jars\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
		Reporter.log("[Chrome browser launced sucessfully.]", true);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  driver.quit();
  }

}



