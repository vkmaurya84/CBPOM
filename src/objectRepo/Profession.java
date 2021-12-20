package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Profession {
	
	WebDriver driver;
	
	public Profession(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By professionPage = By.xpath("//a[@href='/professions']");
	By profession = By.xpath("//div[@id='professionA']/div[2]");
	By professionCard = By.xpath("//div[@data-id='1']");
	
	public WebElement professionList()
	{
		WebDriverWait w = new WebDriverWait(driver , 30);
		w.until(ExpectedConditions.elementToBeClickable(professionPage));
		return driver.findElement(professionPage);
	}
	
	public WebElement professionCardList()
	{
		WebDriverWait w = new WebDriverWait(driver , 10);
		w.until(ExpectedConditions.elementToBeClickable(profession));
		return driver.findElement(profession);
	}
	
	public WebElement professionCardPreview()
	{
		return driver.findElement(professionCard);
	}

}
