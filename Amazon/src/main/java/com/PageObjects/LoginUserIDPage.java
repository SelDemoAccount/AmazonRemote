package com.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ActionsUtil.CActions;
import com.BaseClass.BaseClass;

public class LoginUserIDPage extends BaseClass{
	
	CActions cactions = new CActions();
	
	public LoginUserIDPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id="ap_email")
	private WebElement userId;

	@FindBy(id="continue")
	private WebElement continuebtn;
	
	@FindBy(css = "h4.a-alert-heading")
	private WebElement errHead;
	
	@FindBy(css="span.a-list-item")
	private WebElement errMsg;
	
	public void  enterUserName(String uname)
	{
		userId.sendKeys(uname);
	}
	
	public void clickContinueBtn()
	{
		continuebtn.click();
	}
	
	public String getErrHeadText()
	{
		
		return errHead.getText();
	}
	
	public String getErrMsgText()
	{
		return errMsg.getText();
	}
	
	public boolean isErrHeadDisplayed() {
		
		return cactions.isDisplayed(getDriver(), errHead);
		
	}
	
	
}
