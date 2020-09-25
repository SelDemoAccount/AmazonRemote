package com.BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	// Declare ThreadLocal Driver
	public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();
	public static String url = "https://www.amazon.in/";

	public static WebDriver getDriver() {
		return driver.get();
	}

	public static void launchApp(String browser)
		{
			if(browser.equalsIgnoreCase("Chrome"))
			{
			WebDriverManager.chromedriver().setup();
			driver.set(new ChromeDriver());
			System.out.println("Chrome Browser launched...");
			}
			if(browser.equalsIgnoreCase("Firefox"))
			{
			WebDriverManager.firefoxdriver().setup();
			driver.set(new FirefoxDriver());
			System.out.println("Firefox Browser launched...");
			}
			if(browser.equalsIgnoreCase("IE"))
			{
			WebDriverManager.iedriver().setup();
			driver.set(new InternetExplorerDriver());
			System.out.println("IE Browser launched...");
			}
			
			getDriver().manage().window().maximize();
			//getDriver().manage().deleteAllCookies();
			//ImplicitWait TimeOuts
			getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			//Pageload TimeOuts
			//getDriver().manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			getDriver().get(url);
		}
	
	@AfterTest
	public void teardown()
	{
		//getDriver().quit();
	}
}
