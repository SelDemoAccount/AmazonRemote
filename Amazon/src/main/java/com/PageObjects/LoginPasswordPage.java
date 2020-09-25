package com.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ActionsUtil.CActions;
import com.BaseClass.BaseClass;

public class LoginPasswordPage extends BaseClass {

	CActions cactions=new CActions();
	
	public LoginPasswordPage() {
		PageFactory.initElements(getDriver(), this);
	}

	//password field
	@FindBy(id = "ap_password")
	private WebElement pwdtxt;

	//login button
	@FindBy(id = "signInSubmit")
	private WebElement loginbtn;
	
	
	@FindBy(css = "h4.a-alert-heading")
	private WebElement errHead;
	
	@FindBy(css="span.a-list-item")
	private WebElement errMsg;
	

	//enter password
	public void enterPassword(String passwd) {
		pwdtxt.sendKeys(passwd);
	}

	//click on login button
	public void clickLoginBtn() {
		loginbtn.click();
	}

	public String getErrHeadText()
	{
		return errHead.getText();
	}
	
	public String getErrMsgText()
	{
		return errMsg.getText();
	}
	
public boolean isErrHeadDisplayed()
{
return cactions.isDisplayed(getDriver(), errHead);
}
	
}
