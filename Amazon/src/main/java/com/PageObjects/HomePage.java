package com.PageObjects;

import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class HomePage extends BaseClass{
	
	public HomePage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public String getHomePageTitle()
	{
		return getDriver().getTitle();
		
	}
}
