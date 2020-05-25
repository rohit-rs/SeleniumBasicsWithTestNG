package com.tricentis.demoshop.methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;


public class BaseMethods {
	
	public static WebDriver driver;
	public static WebDriverWait  wait;
	public static Actions action;
	public static Properties elementSelectors;
	public static Properties testData;
	public static SimpleDateFormat formatter;
	
	public static void initialize() throws IOException {
		elementSelectors = new Properties();
		FileInputStream selectors = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/com/tricentis/demoshop/elements/elementSelectors.properites");
		elementSelectors.load(selectors);
		
		testData = new Properties();
		FileInputStream data = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/com/tricentis/demoshop/elements/testData.properites");
		testData.load(data);
	}
	
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "Dependent_Jars\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 60);
		Reporter.log("[Chrome browser launced sucessfully.]", true);
	}
	
	public static void openUrl(String URL) {
		driver.get(URL);
		Reporter.log("[Open URL: " + URL + ".]", true);
	}
		
	public static void closeBroswer() {
		driver.close();
		driver.quit();
		Reporter.log("[Browser closed.]", true);
	}
	
	public static void captureScreenshot() throws IOException {
		formatter = new SimpleDateFormat("yyyy.MM.hh.HH.mm.ss");
		Date date = new Date();
		String filename = formatter.format(date)+".png";
		String directory = System.getProperty("user.dir") + "//Screenshots//";
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory + filename));
		Reporter.log("[Screenshot captured with name: " + filename + ".]", true);
	}
	
}
