package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyCard {
	
	WebDriver driver;
	
	public MyCard(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	By myCards = By.xpath("//a[@href='/mycards']");
	By shareCard = By.xpath("//div[@class='myCard-container']/div[2]//button");
	By edit = By.xpath("//div[@class='myCard-container']/div[2]//span[@aria-label='edit-card']");
	By view = By.xpath("//div[@class='myCard-container']/div[2]//span[@aria-label='view-card']");
	By delete = By.xpath("//div[@class='myCard-container']/div[2]//span[@aria-label='delete-card']");
	By cardTheme1 = By.id("1");
	By cardTheme2 = By.id("2");
	
	By nextButton = By.xpath("//span[contains(text(),'Next')]");
	By looksGoodButton = By.xpath("//span[contains(text(),'Looks Good!')]");
	By close = By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/button[1]");
	
	
	By newCard = By.xpath("//div[@class='addCards']");
	By closeBtn = By.xpath("//body/div[2]/div[3]/div[1]/form[1]/div[1]/div[1]/div[2]/button[1]");
	
	By prefix = By.xpath("//div[contains(text(),'Prefix')]");
	By prefixData = By.cssSelector("#react-select-3-option-3");
	
	By fName = By.name("firstName");
	By lName = By.name("lastName");
	
	By business = By.xpath("//div/div[text()='Business name*']");
	By businessData = By.cssSelector("#react-select-4-option-5");
	
	By designation = By.xpath("//div/div[text()='Designation*']");
	By designationData = By.cssSelector("#react-select-5-option-2");
	
	By address = By.name("addressLine1");
	By pin = By.name("pincode");
	By mobile = By.name("mobileNumber");
	By email = By.name("email");
	By facebook = By.name("facebook");
	
	By industry = By.xpath("//div/div[text()='Industry*']");
	By industryData = By.cssSelector("#react-select-7-option-1");
	
	
	
	public WebElement cardsPage()
	{
		WebDriverWait w = new WebDriverWait(driver , 30);
		w.until(ExpectedConditions.elementToBeClickable(myCards));
		return driver.findElement(myCards);
	}
	
	public WebElement share()
	{
		return driver.findElement(shareCard);
	}
	
	public WebElement editBtn()
	{
		return driver.findElement(edit);
	}
	
	public WebElement theme1()
	{
		return driver.findElement(cardTheme1);
	}
	public WebElement theme2()
	{
		return driver.findElement(cardTheme2);
	}
	
	public WebElement nextBtn()
	{
		return driver.findElement(nextButton);
	}
	
	public WebElement goodBtn()
	{
		return driver.findElement(looksGoodButton);
	}
	
	public WebElement viewPage()
	{
		return driver.findElement(view);
	}
	
	public WebElement closeBtn()
	{
		return driver.findElement(close);
	}
	
	public WebElement delete()
	{
		return driver.findElement(delete);
	}
	
//	new card create
	
	public WebElement newCard()
	{
		return driver.findElement(newCard);
	}
	
	public WebElement prefix()
	{
		return driver.findElement(prefix);
	}
	
	public WebElement prefixValue()
	{
		return driver.findElement(prefixData);
	}
	
	public WebElement business()
	{
		return driver.findElement(business);
	}
	
	public WebElement businessValue()
	{
		return driver.findElement(businessData);
	}
	
	public WebElement designation()
	{
		return driver.findElement(designation);
	}
	
	public WebElement designationValue()
	{
		return driver.findElement(designationData);
	}
	
	public WebElement address()
	{
		return driver.findElement(address);
	}
	
	public WebElement pincode()
	{
		return driver.findElement(pin);
	}
	
	public WebElement mobileno()
	{
		return driver.findElement(mobile);
	}
	
	public WebElement emailid()
	{
		return driver.findElement(email);
	}
	
	public WebElement industries()
	{
		return driver.findElement(industry);
	}
	
	public WebElement industryValue()
	{
		return driver.findElement(industryData);
	}
}
