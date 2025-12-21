package BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SetUp {
	protected WebDriver driver;
  @BeforeSuite
  public void OpenBrowser() {
	  driver= new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://www.ebay.ca/");
	  driver.manage().window().maximize();
	  
	 }
  
@AfterSuite

public void closeBrowser() throws InterruptedException {
	Thread.sleep(5000);
	driver.quit();
}
  
  
}
