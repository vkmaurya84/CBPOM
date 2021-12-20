package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	WebDriver driver;
	
	public Login(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By userName = By.name("email");
	By password = By.xpath("//input[@type='password']");
	By proceed = By.xpath("//span[contains(text(),'Continue')]");
	
	By ForgetPass = By.xpath("//h6[contains(text(),'Forgot password ?')]");
	By restBtn = By.xpath("//span[contains(text(),'Reset password')]");
	
	
	
	
	public WebElement email()
	{
		return driver.findElement(userName);
	}
	
	public WebElement password()
	{
//		WebDriverWait w = new WebDriverWait(driver , 10);
		return driver.findElement(password);
	}
	
	public WebElement submit()
	{
		return driver.findElement(proceed);
	}
	
	public WebElement ForgetPass()
	{
		return driver.findElement(ForgetPass);
	}
	
	public WebElement restBtn()
	{
		return driver.findElement(restBtn);
	}
}
