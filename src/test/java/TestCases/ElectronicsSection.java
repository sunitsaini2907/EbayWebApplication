package TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.SetUp;

public class ElectronicsSection extends SetUp {
  @Test( priority=1)
  public void clickElectronicsSection() {
	  driver.findElement(By.xpath("//li[@data-currenttabindex='6']")).click();
	  
  }
  @Test(priority=2)
  public void clickComputerAndNetworkHardware() {
	  driver.findElement(By.xpath("//span[normalize-space()='Computers, tablets and network hardware']")).click();
	  String title= driver.getTitle();
	 Assert.assertEquals(title, "Computers, Tablets & Network Hardware for sale | eBay","Computer, Tablets& Network Hardware page is displayed");
  }
}
