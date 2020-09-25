package com.Tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.PageObjects.LoginUserIDPage;

public class LoginUserIdPageTest {

	LoginUserIDPage loginUserIdPage;

	@Parameters("uid")
	@Test(groups = "user-id")
	public void userIdTest(String uname) {
		System.out.println("Entering userid..");
		loginUserIdPage = new LoginUserIDPage();
		loginUserIdPage.enterUserName(uname);
		System.out.println("Entered userid.."+uname);
		loginUserIdPage.clickContinueBtn();
		System.out.println("Clicked on Continue button..");
		
		//If error displayed
		if(loginUserIdPage.isErrHeadDisplayed())
		{
		String expErrHeadMsg = "There was a problem";
		String expErrMsgTxt = "We cannot find an account with that email address";
		String actErrHeadMsg = loginUserIdPage.getErrHeadText();
		String actErrMsgTxt = loginUserIdPage.getErrMsgText();
		if (actErrHeadMsg.equals(expErrHeadMsg) && actErrMsgTxt.equals(expErrMsgTxt))
		Assert.assertTrue(true);
		}
		
	}
}
