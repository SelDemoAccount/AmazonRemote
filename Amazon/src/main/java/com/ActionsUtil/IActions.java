package com.ActionsUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface IActions {

	public boolean moveToElement(WebDriver driver, WebElement ele);
	public void click(WebDriver ldriver, WebElement ele);
	public boolean click1(WebElement locator, String locatorName);
	public boolean isDisplayed(WebDriver ldriver, WebElement ele);
	public boolean JSClick(WebDriver driver, WebElement ele);
	public boolean findElement(WebDriver ldriver, WebElement ele);
}
