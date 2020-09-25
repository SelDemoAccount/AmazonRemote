package com.Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.PageObjects.MainPage;

public class SignInTest extends BaseClass {

	MainPage mp;

	@BeforeTest
	public void setUp() {
		launchApp("chrome");
		System.out.println("launchApp function completed...");
	}

	@Test
	public void signInTest() throws Throwable {
		mp = new MainPage();
		System.out.println("signIn test is executing...");
		mp.signIn();
		System.out.println("signIn test completed.....");
	}

	@AfterTest
	public void closeBrowser() {
		// getDriver().close();
	}
}
