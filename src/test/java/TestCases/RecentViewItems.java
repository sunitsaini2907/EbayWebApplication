package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.SetUp;

public class RecentViewItems extends SearchFunctionality {
  @Test(priority=5, groups= "recentItem")
  public void recentViewItems() {
	  driver.get("https://www.ebay.ca/");
	 
	  WebElement recentItem= driver.findElement(By.xpath("//h2[text()='Your Recently Viewed Items']"));
	  JavascriptExecutor js= (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].scrollIntoView()", recentItem);
	  if(recentItem.isDisplayed()) {
		  Assert.assertTrue(true);
		  System.out.println("Recent view item element is displayed");
	  }
  }
}
