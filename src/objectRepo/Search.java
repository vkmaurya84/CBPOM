package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search {
	
	WebDriver driver;
	
	public Search(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By searchFrom = By.xpath("//div[@id='mui-component-select-search']");
	By data = By.xpath("//li[@data-value='GLOBAL']");
	By searchBar = By.xpath("//input[@aria-label='search user']");
	By searchBtn = By.xpath("//button[@aria-label='search']");
	By contact = By.xpath("//div[@aria-label='global-search']/button[1]");
	By global = By.xpath("//div[@aria-label='global-search']/button[2]");
	By addCard = By.id("0");
	By update = By.xpath("//body/div[4]/div[3]/div[1]/div[1]/div[6]/button[1]/span[1]");
	
	By company = By.xpath("//li[@data-value='COMPANY']");
	By companySelect = By.xpath("//div[@id='companyL']/div[2]/div[1]");
	By companyUpdate = By.xpath("//body/div[8]/div[3]/div[1]/div[1]/div[6]/button[1]/span[1]");
	
	
	public WebElement searchHome()
	{
		WebDriverWait w = new WebDriverWait(driver , 30);
		w.until(ExpectedConditions.elementToBeClickable(searchFrom));
		return driver.findElement(searchFrom);
	}
	
	public WebElement searchSelect()
	{
		return driver.findElement(data);
	}
	
	public WebElement searchData()
	{
		return driver.findElement(searchBar);
	}
	
	public WebElement contactCategory()
	{
		WebDriverWait w = new WebDriverWait(driver , 10);
		w.until(ExpectedConditions.elementToBeClickable(contact));
		return driver.findElement(contact);
	}
	
	public WebElement globalCategory()
	{
		WebDriverWait w = new WebDriverWait(driver , 10);
		w.until(ExpectedConditions.elementToBeClickable(global));
		return driver.findElement(global);
	}
	
	public WebElement addCard()
	{
		return driver.findElement(addCard);
	}
	
	public WebElement addCardAfterTags()
	{
		return driver.findElement(update);
	}
	
	public WebElement companySearch()
	{
		return driver.findElement(company);
	}
	
	public WebElement companySelect()
	{
		return driver.findElement(companySelect);
	}
	
	public WebElement companySearchedCardAdd()
	{
		return driver.findElement(companyUpdate);
	}

}
