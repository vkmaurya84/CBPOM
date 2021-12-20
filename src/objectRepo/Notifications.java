package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Notifications {
	
	WebDriver driver;
	
	public Notifications(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By notification = By.xpath("//button[@aria-label='show 17 new notifications']");
	By notificationDetails = By.xpath("//div[@class='infinite-scroll-component ']/span[1]/li[1]/div[2]");
	By notificationDelete = By.xpath("//div[@class='infinite-scroll-component ']/span[1]/li[1]/div[3]/button");
	By add = By.xpath("//div[@id='card-preview-action-id']/div[1]/div[2]/div[1]/span");
	By block = By.xpath("//div[@id='card-preview-action-id']/div[2]/div[1]/div[1]/span");
	By report = By.xpath("//div[@id='card-preview-action-id']/div[2]/div[2]/div[1]/span");
	By dismiss = By.xpath("//div[@id='card-preview-action-id']/div[3]/button");
	By close = By.xpath("//div[@id='share_card_notification']/div[1]/div[2]/button");
	
	
	
	
	public WebElement notificationList()
	{
		WebDriverWait w = new WebDriverWait(driver , 30);
		w.until(ExpectedConditions.elementToBeClickable(notification));
		return driver.findElement(notification);
	}
	
	public WebElement notificationDetailsList()
	{
		WebDriverWait w = new WebDriverWait(driver , 10);
		w.until(ExpectedConditions.elementToBeClickable(notificationDetails));
		return driver.findElement(notificationDetails);
	}
	
	public WebElement notificationDeletion()
	{
		return driver.findElement(notificationDelete);
	}
	
	public WebElement addCard()
	{
		return driver.findElement(add);
	}

	public WebElement blockCard()
	{
		return driver.findElement(block);
	}
	
	public WebElement dismissCard()
	{
		return driver.findElement(dismiss);
	}
	
	public WebElement closeCard()
	{
		return driver.findElement(close);
	}
	
}
