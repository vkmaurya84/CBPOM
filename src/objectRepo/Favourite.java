package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Favourite {
	
	WebDriver driver;
	
	public Favourite(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By favouritePage = By.xpath("//a[@href='/favourite']");
	By favouriteContact = By.xpath("//div[@data-id='1']");
	
	
	public WebElement favouriteList()
	{
		WebDriverWait w = new WebDriverWait(driver , 30);
		w.until(ExpectedConditions.elementToBeClickable(favouritePage));
		return driver.findElement(favouritePage);
	}
	
	public WebElement favouriteCard()
	{
		WebDriverWait w = new WebDriverWait(driver , 10);
		w.until(ExpectedConditions.elementToBeClickable(favouriteContact));
		return driver.findElement(favouriteContact);
	}
}
