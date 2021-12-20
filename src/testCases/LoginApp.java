package testCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import objectRepo.Company;
import objectRepo.Contact;
import objectRepo.Favourite;
import objectRepo.Industry;
import objectRepo.Login;
import objectRepo.MyCard;
import objectRepo.Notifications;
import objectRepo.Profession;
import objectRepo.Search;
import objectRepo.Settings;
import objectRepo.Tags;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class LoginApp {
	
	WebDriver driver;
	public void browserSetup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vineet kumar\\Downloads\\Softwares\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 1);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
//		driver.get("https://web.cardbyte.ai/login");
		driver.get("https://cbs.liberin.in:32065/login");
	}
	
	
	@DataProvider
	public Object[][] forgetPasswordData()
	{
		Object[][] forgetPassword = new Object[1][1];
		forgetPassword[0][0] = "ks.vineet99@gmail.com";
		return forgetPassword;
	}
	
	@DataProvider
	public Object[][] createCardData()
	{
		Object[][] newCard = new Object[1][4];
		newCard[0][0] = "iThum tower 5th floor noida india";
		newCard[0][1] = "125463";
		newCard[0][2] = "8005263418";
		newCard[0][3] = "ksvineet99@gmail.com";
		return newCard;
	}
	
	@DataProvider
	public Object[][] tagname()
	{
		Object[][] tag = new Object[1][1];
		tag[0][0] = "newTag";
		return tag;
	}
	
	@DataProvider
	public Object[][] globalSearchData()
	{
		Object[][] globalSearch = new Object[1][1];
		globalSearch[0][0] = "naga";
		return globalSearch;
	}
	
	@DataProvider
	public Object[][] companySearchData()
	{
		Object[][] companySearch = new Object[1][1];
		companySearch[0][0] = "Liberin";
		return companySearch;
	}
	
	@DataProvider
	public Object[][] profileUpdate()
	{
		Object[][] profile = new Object[1][2];
		profile[0][0] = "Vineet Kumar";
		profile[0][1] = "Kumar";
		return profile;
	}
	
	@DataProvider
	public Object[][] feedbackComment()
	{
		Object[][] feedback = new Object[1][1];
		feedback[0][0] = "there is something missing";
		return feedback;
	}
	
	
	Login log ;
	public void login()
	{
		log = new Login(driver);
		
		log.email().sendKeys("vkm.a.u.rya847@gmail.com");
		log.submit().click();
		log.password().sendKeys("Vineet12");
		log.submit().click();
	}
	
	@Test(enabled = false)
	public void logged()
	{
		browserSetup();
		login();
		
		driver.close();
	}
	
	@Test(enabled = false , dataProvider = "forgetPasswordData")
	public void forgotPassword(String mail)
	{
		browserSetup();
		log = new Login(driver);
		log.ForgetPass().click();
		log.email().sendKeys(mail);
		log.restBtn().click();
		
		driver.close();
	}
	
	Contact contact;
	@Test(enabled = false , groups = {"Contact"})
	public void contact()
	{
		contactSetup();
		
//		contact.mail().click();
//		contact.map().click();
		contact.C_block().click();
//		contact.C_block_Accept().click();
		contact.C_block_Reject().click();
//		contact.C_report().click();
		contact.C_favourite().click();
		
		driver.close();
	}
	
	public void contactSetup()
	{
		browserSetup();
		login();
		contact = new Contact(driver);
		
		contact.toast().click();
		contact.list().click();
		contact.contact().click();
	}
	
	public void toasterMsg()
	{
		contact = new Contact(driver);
		contact.toast().click();
	}
	
	
	@Test(enabled = false , groups = {"Contact"})
	public void contactTags()
	{
		contactSetup();
		
		contact.C_tags().click();
		contact.family_tag().click();
		contact.friend_tag().click();
		contact.work_tag().click();
		contact.tagUpdate().click();
		
		driver.close();
	}
	
	@Test(enabled = false , groups = {"Contact"})
	public void shareCards()
	{
		contactSetup();
		
		contact.sendCard().click();
//		when we have two or more cards
		contact.shareCard().click();
		
//		if contact is blocked
//		contact.C_block_Accept().click();
//		contact.C_block_Reject().click();
		
		driver.close();
	}
	
	@Test(enabled = false , groups = {"Contact"})
	public void cardRemove()
	{
		contactSetup();
		
		contact.menu().click();
		contact.c_close().click();
		contact.contact().click();
		contact.menu().click();
		contact.c_remove().click();
//		contact.C_block_Accept().click();
		contact.C_block_Reject().click();
		
		driver.close();
	}
	
	MyCard cards;
	@Test(enabled = false , groups = {"MyCards"})
	public void myCard()
	{
		browserSetup();
		login();
		cards = new MyCard(driver);
		toasterMsg();
		cards.cardsPage().click();
		cards.share().click();
		cards.editBtn().click();
		cards.nextBtn().click();
		cards.theme2().click();
		cards.theme1().click();
		cards.nextBtn().click();
		cards.goodBtn().click();
		
		driver.close();
	}
	
	@Test(enabled = false , groups = {"MyCards"})
	public void viewDeleteCard()
	{
		browserSetup();
		login();
		cards = new MyCard(driver);
		toasterMsg();
		cards.cardsPage().click();
		cards.viewPage().click();
		cards.closeBtn().click();
		
		cards.delete().click();
		contact = new Contact(driver);
//		contact.C_block_Accept().click();
		contact.C_block_Reject().click();
		
		driver.close();
	}
	
	@Test(enabled = false , dataProvider = "createCardData" , groups = {"MyCards"})
	public void setupNewCard(String address , String pincode , String mobile , String email)
	{
		browserSetup();
		login();
		cards = new MyCard(driver);
		toasterMsg();
		cards.cardsPage().click();
		cards.newCard().click();
		cards.prefix().click();
		cards.prefixValue().click();
		cards.business().click();
		cards.businessValue().click();
		cards.designation().click();
		cards.designationValue().click();
		cards.address().sendKeys(address);
		cards.pincode().sendKeys(pincode);
		cards.mobileno().sendKeys(mobile);
		cards.emailid().clear();
		cards.emailid().sendKeys(email);
		cards.industries().click();
		cards.industryValue().click();
		cards.nextBtn().click();
		cards.theme1().click();
		cards.theme2().click();
		cards.theme1().click();
		cards.nextBtn().click();
		cards.goodBtn().click();
		
		driver.close();
	}
	
	Favourite fav;
	@Test(enabled = false , groups = {"Favourite"})
	public void favouriteContactCard()
	{
		favouriteSetup();
		
//		contact.mail().click();
//		contact.map().click();
		contact.C_block().click();
//		contact.C_block_Accept().click();
		contact.C_block_Reject().click();
//		contact.C_report().click();
		contact.C_favourite().click();
		
		driver.close();
	}
	
	public void favouriteSetup()
	{
		browserSetup();
		login();
		fav = new Favourite(driver);
		toasterMsg();
		fav.favouriteList().click();
		fav.favouriteCard().click();
		contact = new Contact(driver);
	}
	
	@Test(enabled = false , groups = {"Favourite"})
	public void favouriteTags()
	{
		favouriteSetup();
		contact.C_tags().click();
		contact.family_tag().click();
		contact.friend_tag().click();
		contact.work_tag().click();
		contact.tagUpdate().click();
		
		driver.close();
	}
	
	@Test(enabled = false , groups = {"Favourite"})
	public void cardsShareToFavourite()
	{
		favouriteSetup();
		
//		when user has only single card created
		
		contact.sendCard().click();
		
		driver.close();
	}
	
	@Test(enabled = false , groups = {"Favourite"})
	public void favouiteCardRemove()
	{
		favouriteSetup();
		
		contact.menu().click();
		contact.c_close().click();
		fav.favouriteCard().click();
		contact.menu().click();
		contact.c_remove().click();
//		contact.C_block_Accept().click();
		contact.C_block_Reject().click();
		
		driver.close();
	}
	
	Company company;
	public void companySetup()
	{
		browserSetup();
		login();
		company = new Company(driver);
		toasterMsg();
		company.companyList().click();
		company.companyCard().click();
		company.companyCardPreview().click();
		contact = new Contact(driver);
	}
	
	@Test(enabled = false , groups = {"Company"})
	public void companies()
	{
		companySetup();
		
//		contact.mail().click();
//		contact.map().click();
		contact.C_block().click();
//		contact.C_block_Accept().click();
		contact.C_block_Reject().click();
//		contact.C_report().click();
		contact.C_favourite().click();
		
		driver.close();
	}
	
	@Test(enabled = false , groups = {"Company"})
	public void companiesTags()
	{
		companySetup();
		
		contact.C_tags().click();
		contact.family_tag().click();
		contact.friend_tag().click();
		contact.work_tag().click();
		contact.tagUpdate().click();
		
		driver.close();
	}
	
	@Test(enabled = false , groups = {"Company"})
	public void companyCardShare()
	{
		companySetup();
//		when user has only single card created
		contact.sendCard().click();
		
		driver.close();
	}
	
	@Test(enabled = false , groups = {"Company"})
	public void companyCardRemove()
	{
		companySetup();
		
		contact.menu().click();
		contact.c_close().click();
		company.companyCardPreview().click();
		contact.menu().click();
		contact.c_remove().click();
//		contact.C_block_Accept().click();
		contact.C_block_Reject().click();
		
		driver.close();
	}
	
	Industry industry;
	public void industrySetup()
	{
		browserSetup();
		login();
		industry = new Industry(driver);
		toasterMsg();
		industry.industryList().click();
		industry.industryCardList().click();
		industry.industryCardPreview().click();
		contact = new Contact(driver);
	}
	
	@Test(enabled = false , groups = {"Industry"})
	public void industries()
	{
		industrySetup();
		
//		contact.mail().click();
//		contact.map().click();
		contact.C_block().click();
//		contact.C_block_Accept().click();
		contact.C_block_Reject().click();
//		contact.C_report().click();
		contact.C_favourite().click();
		
		driver.close();
	}
	
	@Test(enabled = false , groups = {"Industry"})
	public void industriesTags()
	{
		industrySetup();
		
		contact.C_tags().click();
		contact.family_tag().click();
		contact.friend_tag().click();
		contact.work_tag().click();
		contact.tagUpdate().click();
		
		driver.close();
	}
	
	@Test(enabled = false , groups = {"Industry"})
	public void industryCardShare()
	{
		industrySetup();
		
		contact.sendCard().click();
//		when we have two or more cards
		contact.shareCard().click();
		
		driver.close();
		
	}
	
	@Test(enabled = false , groups = {"Industry"})
	public void industryCardRemove()
	{
		industrySetup();
		
		contact.menu().click();
		contact.c_close().click();
		industry.industryCardPreview().click();
		contact.menu().click();
		contact.c_remove().click();
//		contact.C_block_Accept().click();
		contact.C_block_Reject().click();
		
		driver.close();
	}
	
	Profession profession;
	public void professionSetup()
	{
		browserSetup();
		login();
		profession = new Profession(driver);
		toasterMsg();
		profession.professionList().click();
		profession.professionCardList().click();
		profession.professionCardPreview().click();
		contact = new Contact(driver);
	}
	
	@Test(enabled = false , groups = {"Profession"})
	public void professions()
	{
		professionSetup();
		
//		contact.mail().click();
//		contact.map().click();
		contact.C_block().click();
//		contact.C_block_Accept().click();
		contact.C_block_Reject().click();
//		contact.C_report().click();
		contact.C_favourite().click();
		
		driver.close();
	}
	
	@Test(enabled = false , groups = {"Profession"})
	public void professionTags()
	{
		professionSetup();
		
		contact.C_tags().click();
		contact.family_tag().click();
		contact.friend_tag().click();
		contact.work_tag().click();
		contact.tagUpdate().click();
		
		driver.close();
	}
	
	@Test(enabled = false , groups = {"Profession"})
	public void professionCardShare()
	{
		professionSetup();
		
		contact.sendCard().click();
//		when we have two or more cards
		contact.shareCard().click();
		
		driver.close();
	}
	
	@Test(enabled = false , groups = {"Profession"})
	public void professionCardRemove()
	{
		professionSetup();
		
		contact.menu().click();
		contact.c_close().click();
		profession.professionCardPreview().click();
		contact.menu().click();
		contact.c_remove().click();
//		contact.C_block_Accept().click();
		contact.C_block_Reject().click();
		
		driver.close();
	}
	
	
	Tags tag;
	@Test(enabled = false , dataProvider = "tagname" , groups = {"Tags"})
	public void tagUpdate(String tagname)
	{
		browserSetup();
		login();
		tag = new Tags(driver);
		toasterMsg();
		tag.tagList().click();
		tag.tagEditBtn().click();
		tag.tagUpdate().clear();
		tag.tagUpdate().sendKeys(tagname);
//		tag.tagUpdateAccept().click();
		tag.tagUpdateDeleteReject().click();
		
		driver.close();
	}
	
	@Test(enabled = false , groups = {"Tags"})
	public  void tagDelete()
	{
		browserSetup();
		login();
		tag = new Tags(driver);
		toasterMsg();
		tag.tagList().click();
		tag.tagDelete().click();
//		tag.tagDeleteAccept().click();
		tag.tagUpdateDeleteReject().click();
		driver.close();
	}
	
	public void tagSetup()
	{
		browserSetup();
		login();
		tag = new Tags(driver);
		toasterMsg();
		tag.tagList().click();
		tag.tagContact().click();
		tag.tagCardPreview().click();
		contact = new Contact(driver);
	}
	
	@Test(enabled = false , groups = {"Tags"})
	public void tagContact()
	{
		tagSetup();
		
//		contact.mail().click();
//		contact.map().click();
		contact.C_block().click();
//		contact.C_block_Accept().click();
		contact.C_block_Reject().click();
//		contact.C_report().click();
		contact.C_favourite().click();
		
		driver.close();
	}
	
	@Test(enabled = false , groups = {"Tags"})
	public void tagContactTags()
	{
		tagSetup();
		
		contact.C_tags().click();
		contact.family_tag().click();
		contact.friend_tag().click();
		contact.work_tag().click();
		contact.tagUpdate().click();
		
		driver.close();
	}
	
	@Test(enabled = false , groups = {"Tags"})
	public void tagCardShare()
	{
		tagSetup();
		
		contact.sendCard().click();
//		when we have two or more cards
		contact.shareCard().click();
		
		driver.close();
	}
	
	@Test(enabled = false , groups = {"Tags"})
	public void tagCardRemove()
	{
		tagSetup();
		
		contact.menu().click();
		contact.c_close().click();
		tag.tagCardPreview().click();
		contact.menu().click();
		contact.c_remove().click();
//		contact.C_block_Accept().click();
		contact.C_block_Reject().click();
		
		driver.close();
	}
	
	Search search;
	public void searchSetup()
	{
		browserSetup();
		login();
		search = new Search(driver);
		toasterMsg();
		search.searchHome().click();
	}
	
	@Test(enabled = false , dataProvider = "globalSearchData" , groups = {"Search"})
	public void globalSearch(String searchData)
	{
		searchSetup();
		
		search.searchSelect().click();
		search.searchData().sendKeys(searchData, Keys.ENTER);
		search.globalCategory().click();
		search.addCard().click();
		search.addCardAfterTags().click();
		
		driver.close();
	}
	
	@Test(enabled = false , dataProvider = "companySearchData" , groups = {"Search"})
	public void companySearch(String searchData)
	{
		searchSetup();
		search.companySearch().click();
		search.searchData().sendKeys(searchData , Keys.ENTER);
		search.companySelect().click();
		search.globalCategory().click();
		search.addCard().click();
		search.companySearchedCardAdd().click();
		
		driver.close();
		
	}
	
	
	Settings setting;
	@Test(enabled = false , groups = {"LogOut"})
	public void logout()
	{
		browserSetup();
		login();
		setting = new Settings(driver);
		toasterMsg();
		setting.user().click();
		setting.logout().click();
		contact = new Contact(driver);
//		contact.C_block_Accept().click();
		contact.C_block_Reject().click();
		
		driver.close();
	}
	
	public void settingSetup()
	{
		browserSetup();
		login();
		setting = new Settings(driver);
		toasterMsg();
		setting.user().click();
		setting.setting().click();
	}
	
	@Test(enabled = false , dataProvider = "profileUpdate" , groups = {"Settings"})
	public void profile(String f_name , String l_name)
	{
		settingSetup();
		
		setting.profile().click();
		setting.firstName().sendKeys(f_name);
		setting.lastName().clear();
		setting.lastName().sendKeys(l_name);
//		setting.profileClose().click();
		setting.profileUpdate().click();
		
		driver.close();
	}
	
	@Test(enabled = false , groups = {"Settings"})
	public void privacy()
	{
		settingSetup();
		
		setting.privacyPage().click();
		setting.addMutual().click();
		setting.addNone().click();
		setting.addEvery().click();
		setting.introNone().click();
		setting.introContact().click();
//		setting.privacyCloseBtn().click();
		setting.privacyBackBtn().click();
		
		driver.close();
	}
	
	@Test(enabled = false , groups = {"Settings"})
	public void notificationSettings()
	{
		settingSetup();
		setting.notificationSetting().click();
		setting.notNotifyme().click();
		setting.notifyme().click();
		setting.notRecommended().click();
		setting.recommended().click();
		setting.notificationSettingCloseBtn().click();
//		setting.notificationSettingBackBtn().click();
		
		driver.close();
	}
	
	@Test(enabled = false , groups = {"Settings"})
	public void myPlans()
	{
		settingSetup();
		
		setting.planPage().click();
		setting.planPageBack().click();
//		setting.planPageClose().click();
		
		driver.close();
	}
	
	@Test(enabled = false , groups = {"Settings"})
	public void referAndEarn()
	{
		settingSetup();
		
		setting.RE().click();
		setting.user().click();
		setting.setting().click();
		setting.help().click();
		setting.user().click();
		setting.setting().click();
		setting.about().click();
		
		driver.close();
	}
	
	@Test(enabled = false , dataProvider =  "feedbackComment" , groups = {"Settings"})
	public void feedback(String comment)
	{
		settingSetup();
		
		setting.feedback().click();
		setting.feedbackCategory().click();
		setting.feedbackSelect().click();
		setting.comments().sendKeys(comment);
		setting.submit().click();
		setting.feedbackBackBtn().click();
//		setting.feedbackCloseBtn().click();
		
		driver.close();
	}
	
	Notifications notification;
	@Test
	public void notification()
	{
		browserSetup();
		login();
		notification = new Notifications(driver);
		toasterMsg();
		notification.notificationList().click();
		notification.notificationDetailsList().click();
		notification.closeCard().click();
		
	}
}
