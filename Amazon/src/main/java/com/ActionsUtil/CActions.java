package com.ActionsUtil;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.BaseClass.BaseClass;

public class CActions extends BaseClass implements IActions  {

	public boolean moveToElement(WebDriver driver, WebElement ele) {
		
		boolean flag = false;
		try {
			// WebElement element = driver.findElement(locator);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].scrollIntoView(true);", ele);
			Actions actions = new Actions(driver);
			// actions.moveToElement(driver.findElement(locator)).build().perform();
			actions.moveToElement(ele).build().perform();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

		public void click(WebDriver driver, WebElement ele) {

			Actions act = new Actions(driver);
			act.moveToElement(ele).click().build().perform();
	}

		public boolean click1(WebElement locator, String locatorName) {
			boolean flag = false;
			try {
				locator.click();
				flag = true;
				return true;
			} catch (Exception e) {
				return false;
			} finally {
				if (flag) {
					System.out.println("Able to click on \""+locatorName+"\"");
				} else {
					System.out.println("Click Unable to click on \""+locatorName+"\"");
				}
			}
		}

		
		
		public boolean JSClick(WebDriver driver, WebElement ele) {
			boolean flag = false;
			try {
				// WebElement element = driver.findElement(locator);
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", ele);
				// driver.executeAsyncScript("arguments[0].click();", element);
				flag = true;
			}
			catch (Exception e)
			{
				e.getSuppressed();
			} finally {
				if (flag) {
					System.out.println("Click Action is performed");
				} else if (!flag) {
					System.out.println("Click Action is not performed");
				}
			}
			return flag;
		}

		public boolean isDisplayed(WebDriver ldriver, WebElement ele) {
				boolean flag = false;
				flag = findElement(ldriver, ele);
				if (flag) {
					flag = ele.isDisplayed();
					if (flag) {
						System.out.println("The element is Displayed");
					} else {
						System.out.println("The element is not Displayed");
					}
				} else {
					System.out.println("Not displayed ");
				}
				return flag;
		}

		public boolean findElement(WebDriver ldriver, WebElement ele) {
			boolean flag = false;
			try {
				ele.isDisplayed();
				flag = true;
			} catch (Exception e) {
				// System.out.println("Location not found: "+locatorName);
				flag = false;
			} finally {
				if (flag) {
					System.out.println("Successfully Found element at");

				} else {
					System.out.println("Unable to locate element at");
				}
			}
			return flag;
		}
		
		
		
}
