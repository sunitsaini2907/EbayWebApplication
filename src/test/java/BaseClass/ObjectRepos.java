package BaseClass;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ObjectRepos {
	WebDriver driver;
	public ObjectRepos(WebDriver driver)
	{
		this.driver= driver;
	}

	By searchBox= By.xpath("//input[@id='gh-ac']");
	By searchButn= By.xpath("//span[@class='gh-search-button__label']");
	By iphone16ProMax= By.xpath("//span[normalize-space()='iPhone 16 Pro Max 256gb Dessert Titanium Att Only']");
	
	
	public void searchIphone() {
		driver.findElement(searchBox).sendKeys("Iphone 16 pro max");
		driver.findElement(searchButn).click();
		driver.findElement(iphone16ProMax).click();
		Set<String> wId=driver.getWindowHandles();
		ArrayList<String> WindowId= new ArrayList<>(wId);
		String wId1= WindowId.get(1);
		driver.switchTo().window(wId1);  // switching to cart window
		
		
		
		
		
	}
}

