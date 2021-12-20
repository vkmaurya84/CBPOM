package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Settings {
	
	WebDriver driver;
	
	public Settings(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By currentUser = By.xpath("//button[@aria-label='account of current user']");
	By settings = By.xpath("//nav[@aria-label='list']/div[1]");
	By logout = By.xpath("//nav[@aria-label='list']/div[2]");
	
	By profile = By.xpath("//div[@id='setting-sidebar']/ul/li[1]");
	By fName = By.name("firstName");
	By lName = By.name("lastName");
	By Continue = By.xpath("//span[contains(text(),'Continue')]");
	By profileCloseBtn = By.xpath("//div[@class='m-2']/div/button");
	
	
	
	
	public WebElement user()
	{
		WebDriverWait w = new WebDriverWait(driver , 30);
		w.until(ExpectedConditions.elementToBeClickable(currentUser));
		return driver.findElement(currentUser);
	}
	
	public WebElement logout()
	{
		return driver.findElement(logout);
	}
	
	public WebElement setting()
	{
		return driver.findElement(settings);
	}
	
	public WebElement profile()
	{
		return driver.findElement(profile);
	}
	
	public WebElement profileClose()
	{
		return driver.findElement(profileCloseBtn);
	}
	
	public WebElement firstName()
	{
		return driver.findElement(fName);
	}
	
	public WebElement lastName()
	{
		return driver.findElement(lName);
	}
	
	public WebElement profileUpdate()
	{
		return driver.findElement(Continue);
	}
	
	
	By privacy = By.xpath("//div[@id='setting-sidebar']/ul/li[2]");
	By privacyClose = By.xpath("//div[@id='privacy-sidebar']/div[1]/span[3]/button");
	By privacyBack = By.xpath("//div[@id='privacy-sidebar']/div[1]/span[1]/button");
//	who can add you ? 
	By everyone = By.xpath("//div[@id='privacy-sidebar']/div[2]/div[2]/div[1]/div[2]/span[1]");
	By mutualone = By.xpath("//div[@id='privacy-sidebar']/div[2]/div[3]/div[1]/div[2]/span[1]");
	By none = By.xpath("//div[@id='privacy-sidebar']/div[2]/div[4]/div[1]/div[2]/span[1]");
//	who can Introduce you ?
	By contact = By.xpath("//div[@id='privacy-sidebar']/div[3]/div[2]/div[2]/span[1]");
	By noone = By.xpath("//div[@id='privacy-sidebar']/div[3]/div[4]/div[2]/span[1]");
	
	
	
	public WebElement privacyPage()
	{
		return driver.findElement(privacy);
	}
	
	public WebElement addEvery()
	{
		return driver.findElement(everyone);
	}
	
	public WebElement addMutual()
	{
		return driver.findElement(mutualone);
	}
	
	public WebElement addNone()
	{
		return driver.findElement(none);
	}
	
	public WebElement introContact()
	{
		return driver.findElement(contact);
	}
	
	public WebElement introNone()
	{
		return driver.findElement(noone);
	}
	
	public WebElement privacyCloseBtn()
	{
		return driver.findElement(privacyClose);
	}
	
	public WebElement privacyBackBtn()
	{
		return driver.findElement(privacyBack);
	}
	
	
	
	By notificationSeting = By.xpath("//div[@id='setting-sidebar']/ul/li[3]");
	By notificationClose = By.xpath("//div[@id='notofication']/span[3]/button[1]");
	By notificationBack = By.xpath("//div[@id='notofication']/span[1]/button[1]");
//	Get Latest Updates
	By notify = By.xpath("//div[@id='privacy-sidebar']/div[1]/div[2]/div[1]/div[2]/span[1]");
	By noNotify = By.xpath("//div[@id='privacy-sidebar']/div[1]/div[3]/div[1]/div[2]/span[1]");
//	Your network - Recommend contacts?
	By recommend = By.xpath("//div[@id='privacy-sidebar']/div[2]/div[2]/div[2]/span[1]");
	By noRecommend = By.xpath("//div[@id='privacy-sidebar']/div[2]/div[4]/div[2]/span[1]");

	
	public WebElement notificationSetting()
	{
		return driver.findElement(notificationSeting);
	}
	
	public WebElement notifyme()
	{
		return driver.findElement(notify);
	}
	
	public WebElement notNotifyme()
	{
		return driver.findElement(noNotify);
	}
	
	public WebElement recommended()
	{
		return driver.findElement(recommend);
	}
	
	public WebElement notRecommended()
	{
		return driver.findElement(noRecommend);
	}
	
	public WebElement notificationSettingCloseBtn()
	{
		return driver.findElement(notificationClose);
	}
	
	public WebElement notificationSettingBackBtn()
	{
		return driver.findElement(notificationBack);
	}
	
	By plan = By.xpath("//div[@id='setting-sidebar']/ul/li[4]");
	By standard = By.xpath("//p[contains(text(),'Standard')]");
	By pay = By.xpath("//button[contains(text(),'Pay & Subscribe')]");
	By checkouBack = By.xpath("//button[@aria-label='back']");
	By myPlanBack = By.xpath("//div[@id='plan-container']/div[1]/span[1]/button[1]");
	By myPlanClose = By.xpath("//div[@id='plan-container']/div[1]/span[3]/button[1]");
	
	
	public WebElement planPage()
	{
		return driver.findElement(plan);
	}
	
	public WebElement planPageBack()
	{
		return driver.findElement(myPlanBack);
	}
	
	public WebElement planPageClose()
	{
		return driver.findElement(myPlanClose);
	}
	
	By refer = By.xpath("//div[@id='setting-sidebar']/ul/li[5]");
	By help = By.xpath("//div[@id='setting-sidebar']/ul/li[6]");
	By about = By.xpath("//div[@id='setting-sidebar']/ul/li[8]");
	
	public WebElement RE()
	{
		return driver.findElement(refer);
	}
	
	public WebElement help()
	{
		return driver.findElement(help);
	}
	
	public WebElement about()
	{
		return driver.findElement(about);
	}
	
	By feed = By.xpath("//div[@id='setting-sidebar']/ul/li[7]");
	By feedCategory = By.xpath("//div[contains(text(),'Choose category')]");
	By feedSelect = By.cssSelector("#react-select-3-option-1");
	By comment = By.id("comments");
	By submit = By.xpath("//span[contains(text(),'Submit')]");
	By feedbackBack = By.xpath("//div[@id='CommentBox']/div[1]/span[1]/button[1]");
	By feedbackClose = By.xpath("//div[@id='CommentBox']/div[1]/span[3]/button[1]");
	
	public WebElement feedback()
	{
		return driver.findElement(feed);
	}
	
	public WebElement feedbackCategory()
	{
		return driver.findElement(feedCategory);
	}
	
	public WebElement feedbackSelect()
	{
		return driver.findElement(feedSelect);
	}
	
	public WebElement comments()
	{
		return driver.findElement(comment);
	}
	
	public WebElement submit()
	{
		return driver.findElement(submit);
	}
	
	public WebElement feedbackBackBtn()
	{
		return driver.findElement(feedbackBack);
	}
	
	public WebElement feedbackCloseBtn()
	{
		return driver.findElement(feedbackClose);
	}
	
}
