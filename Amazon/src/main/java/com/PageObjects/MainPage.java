package com.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ActionsUtil.CActions;
import com.BaseClass.BaseClass;

public class MainPage extends BaseClass {

	CActions ca = new CActions();

	public MainPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(css = "div#nav-signin-tooltip>a.nav-action-button")
	private WebElement signInlnk;

	@FindBy(css = "a#nav-link-accountList")
	private WebElement signInbtn;

	public void signIn() throws Throwable {
		ca.JSClick(getDriver(), signInlnk);
	}

}
