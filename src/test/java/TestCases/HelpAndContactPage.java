package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.SetUp;

public class HelpAndContactPage extends SetUp {
  @Test(priority=1)
  public void clickHelpPage() {
	  WebElement helpPage= driver.findElement(By.xpath("//a[text()='Help & Contact']"));
	  helpPage.click();
	  WebElement searchHelp= driver.findElement(By.xpath("//input[@id='sr-input']"));
	  searchHelp.sendKeys("how to track order");
	  Actions act= new Actions(driver);
	  act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
	  String queryResult= driver.findElement(By.xpath("//span[text()='Tracking your item']")).getText();
	  Assert.assertEquals(queryResult, "Tracking your item");
	  System.out.println("Result is displayed");
	  
  }
}
