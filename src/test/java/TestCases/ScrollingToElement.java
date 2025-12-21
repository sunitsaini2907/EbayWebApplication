package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.SetUp;

public class ScrollingToElement extends SetUp {
  @Test (priority=1)
  public void srollElementIntoView() {
	  JavascriptExecutor js= (JavascriptExecutor) driver;
	  WebElement element= driver.findElement(By.xpath("//div[@data-src='https://i.ebayimg.com/images/g/mrsAAOSwghBiTyoe/s-l500.webp']"));
	  js.executeScript("arguments[0].scrollIntoView()",element);
	  element.click();
	  String title= driver.getTitle();
	  Assert.assertEquals(title, "Headphones for sale | eBay");
	  System.out.println("Scrolled to element and clicked on the element");
	  
  }
}
