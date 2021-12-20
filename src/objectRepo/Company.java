package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Company {
	
	WebDriver driver;
	
	public Company(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By companyPage = By.xpath("//a[@href='/companies']");
	By company = By.xpath("//div[@id='companyL']/div[2]");
	By companyCard = By.xpath("//div[@data-id='1']");
	
	
	public WebElement companyList()
	{
		WebDriverWait w = new WebDriverWait(driver , 30);
		w.until(ExpectedConditions.elementToBeClickable(companyPage));
		return driver.findElement(companyPage);
	}
	
	public WebElement companyCard()
	{
		WebDriverWait w = new WebDriverWait(driver , 10);
		w.until(ExpectedConditions.elementToBeClickable(company));
		return driver.findElement(company);
	}
	
	public WebElement companyCardPreview()
	{
		return driver.findElement(companyCard);
	}

}
