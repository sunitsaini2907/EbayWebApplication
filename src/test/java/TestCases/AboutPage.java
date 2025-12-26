package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.SetUp;

public class AboutPage  extends SetUp{
  @Test(priority=1)
  public void clickAboutEbay() {
	  WebElement aboutEbay= driver.findElement(By.xpath("//a[@href='https://www.ebayinc.com/']"));
	  JavascriptExecutor js= (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].scrollIntoView()", aboutEbay);
	  aboutEbay.click();
	  
  }
  
  @Test (priority=2)
  public void company() {
	  WebElement company= driver.findElement(By.xpath("//a[text()='Company']"));
	  company.click();
	  WebElement ourCompany= driver.findElement(By.xpath("//h1[text()='Our Company']"));
	  if(ourCompany.isDisplayed()) {
		  Assert.assertTrue(true);
		  System.out.println("Company page is opened");
	  }
  }
  
  @Test(priority= 3)
  public void stories() {
	  WebElement stories= driver.findElement(By.xpath("//a[text()='Stories']"));
	  stories.click();
	  WebElement storiesPage= driver.findElement(By.xpath("//h1[text()='Stories']"));
	  if(storiesPage.isDisplayed()) {
		  Assert.assertTrue(true);
		  System.out.println("Stories Page is opened");
	  }
  }
  @Test(priority=4)
  public void impactPage() {
	  WebElement impact= driver.findElement(By.xpath("//a[text()='Impact']"));
	  impact.click();
	  WebElement impactPage= driver.findElement(By.xpath("//h1[text()='Our 2024 Impact Report']"));
	  if(impactPage.isDisplayed()) {
		  Assert.assertTrue(true);
		  System.out.println("Impact page is opened");
	  }
  }
  @Test (priority=5)
  public void innovationPage() {
	  WebElement innovation= driver.findElement(By.xpath("//a[text()='Innovation']"));
	  innovation.click();
	  WebElement innovationPage= driver.findElement(By.xpath("//*[text()='Innovation at eBay']"));
	  if(innovationPage.isDisplayed()) {
		  Assert.assertTrue(true);
		  System.out.println("Innovation page is opened");
	  }
  }
  
  @Test(priority=6)
  public void investorPage() {
	  WebElement investor= driver.findElement(By.xpath("//a[@href='https://investors.ebayinc.com/']"));
	  investor.click();
	  WebElement investorPage= driver.findElement(By.xpath("//div[@id='_ctrl0_ctl27_divModuleContainer']"));
	  String title= investorPage.getText();
	  System.out.println(title);
	  if(investorPage.isDisplayed()) {
		  Assert.assertTrue(true);
		  System.out.println("Investor page is opened");
		  
	  }
  } 
  @Test(priority=7)
  public void careerPage() throws InterruptedException {
	  SearchContext shadow1= driver.findElement(By.cssSelector("ebi-header")).getShadowRoot();
	  WebElement careerPage= shadow1.findElement(By.cssSelector("a[class='js-l1-link'][href='https://jobs.ebayinc.com/us/en']"));
	  careerPage.click();
	 
	 
	  }
	  
	  
	  
	  
  }

