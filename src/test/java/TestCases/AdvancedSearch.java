package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.SetUp;

public class AdvancedSearch extends SetUp{
	
  @Test
  public void advancedSearch() {
	  
	  driver.findElement(By.xpath("//a[@class='gh-search-button__advanced-link']")).click(); // click on advanced search
	  WebElement EnterKeyword= driver.findElement(By.xpath("//input[@id='_nkw']"));
	  EnterKeyword.sendKeys("iphone");
	  WebElement dropDown= driver.findElement(By.xpath("//select[@id='s0-1-20-4[0]-7[1]-_in_kw']"));
	  
	  Select select = new Select(dropDown);
	  select.selectByVisibleText("Exact words, any order");
	  WebElement dropDown2= driver.findElement(By.xpath("//select[@id='s0-1-20-4[0]-7[3]-_sacat']"));
	  Select select2= new Select(dropDown2);
	  select2.selectByVisibleText("Cell Phones & Accessories");
	  driver.findElement(By.xpath("//div[@class='field adv-keywords__btn-help']//button[@type='submit'][normalize-space()='Search']")).click();
	  WebElement iphone= driver.findElement(By.xpath("//span[normalize-space()='Apple iPhone 16 Pro , 256GB, Black Titanium']"));
	  if(iphone.isDisplayed()) {
		  Assert.assertTrue(true);
	  }
	  
	  
  }
}
