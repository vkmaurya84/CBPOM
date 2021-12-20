package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tags {
	
	WebDriver driver;
	
	public Tags(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By tagsPage = By.xpath("//a[@href='/tags']");
	
	By edit = By.xpath("//div[@id='tagsA']/div[2]//span[@class='update-delete-tag']/button[1]");
	By tagname = By.name("firstName");
	By close = By.xpath("//span[contains(text(),'Close')]");
	By update = By.xpath("//span[contains(text(),'Update')]");
	By delete = By.xpath("//div[@id='tagsA']/div[2]//span[@class='update-delete-tag']/button[2]");
	By tagDelete = By.xpath("//span[contains(text(),'Delete')]");
	
	By tagsContact = By.xpath("//div[@id='tagsA']/div[2]");
	By tagsCard = By.xpath("//div[@data-id='1']");
	
	
	public WebElement tagList()
	{
		WebDriverWait w = new WebDriverWait(driver , 30);
		w.until(ExpectedConditions.elementToBeClickable(tagsPage));
		return driver.findElement(tagsPage);
	}
	
	public WebElement tagEditBtn()
	{
		return driver.findElement(edit);
	}
	
	public WebElement tagUpdate()
	{
		return driver.findElement(tagname);
	}
	
	public WebElement tagUpdateDeleteReject()
	{
		return driver.findElement(close);
	}
	
	public WebElement tagUpdateAccept()
	{
		return driver.findElement(update);
	}
	
	public WebElement tagDelete()
	{
		return driver.findElement(delete);
	}
	
	public WebElement tagDeleteAccept()
	{
		return driver.findElement(tagDelete);
	}
	
	public WebElement tagContact()
	{
		return driver.findElement(tagsContact);
	}
	
	public WebElement tagCardPreview()
	{
		return driver.findElement(tagsCard);
	}


}
