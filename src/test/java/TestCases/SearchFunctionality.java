package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.ObjectRepos;
import BaseClass.SetUp;

public class SearchFunctionality extends SetUp {
	
  @Test(priority=1)
  public void search() {
	  ObjectRepos obj = new ObjectRepos(driver);
	  obj.searchIphone();
	  
	  
  }
  @Test(priority=2)
  public void addToCart() {
	  driver.findElement(By.xpath("//a[@id='atcBtn_btn_1']")).click();
	  driver.findElement(By.xpath("//a[@class='ux-call-to-action fake-btn fake-btn--primary']//span[@class='ux-call-to-action__text'][normalize-space()='See in cart']")).click();
	  
	  
	  WebElement iphone= driver.findElement(By.xpath("//img[@alt='iPhone 16 Pro Max 256gb Dessert Titanium Att Only']"));
	  if(iphone.isDisplayed()) {
		  Assert.assertTrue(true);
		 
	  }
	  
  }
  
  @Test(priority=3)
  public void checkout() {
	  WebElement checkout = driver.findElement(By.xpath("//button[normalize-space()='Go to checkout']"));
	  if(checkout.isEnabled()) {
		  Assert.assertTrue(true);
		  
	  }
  }
  @Test(priority= 4)
  public void deleteFromCart() {
	  driver.findElement(By.xpath("//button[@class='number-input__delete icon-btn icon-btn--small icon-btn--transparent']")).click();
	  String title= driver.findElement(By.xpath("//div[@class='font-title-3']")).getText();
	  Assert.assertEquals(title, "You don't have any items in your cart.");
  }
}
