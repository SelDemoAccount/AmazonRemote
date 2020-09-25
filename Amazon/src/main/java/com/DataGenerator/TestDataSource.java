package com.DataGenerator;

import org.testng.annotations.DataProvider;

public class TestDataSource {

	//provides userid to LoginUserIdPageTest
	@DataProvider(name = "useridprovider")
	public Object[][] getUserId() 
	{
		return new Object[][] { { "kbandla2002@gmail.com" },
								{ "kbandla2003@gmail.com" }
								};
	}
	
	//provides password to LoginPasswordPageTest
	@DataProvider(name = "passwordprovider")
	public Object[][] getPassWord() 
	{
		return new Object[][] { { "Vidyaghij@2007" },
								{ "Vidyaghij@2007" }
								};
	}
	
}
