package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Industry {
	
	WebDriver driver;
	
	public Industry(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By industryPage = By.xpath("//a[@href='/industries']");
	By industry = By.xpath("//div[@id='industryA']/div[2]");
	By industryCard = By.xpath("//div[@data-id='1']");

	
	public WebElement industryList()
	{
		WebDriverWait w = new WebDriverWait(driver , 30);
		w.until(ExpectedConditions.elementToBeClickable(industryPage));
		return driver.findElement(industryPage);
	}
	
	public WebElement industryCardList()
	{
		WebDriverWait w = new WebDriverWait(driver , 10);
		w.until(ExpectedConditions.elementToBeClickable(industry));
		return driver.findElement(industry);
	}
	
	public WebElement industryCardPreview()
	{
		return driver.findElement(industryCard);
	}
}
