package com.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObjects.HomePage;

public class HomePageTest {
	
	HomePage homepage;
	
	@Test
	public void verifyTitleTest()
	{
		homepage=new HomePage();
		String actTitle=homepage.getHomePageTitle();
		String expTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(actTitle, expTitle);
	}

}
