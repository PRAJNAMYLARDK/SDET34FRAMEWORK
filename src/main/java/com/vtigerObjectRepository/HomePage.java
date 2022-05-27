package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sdet34l1.genericutility.Javautility;
import com.sdet34l1.genericutility.WebbdriverUtility;

public class HomePage {
   Javautility jutil = new Javautility();
	
	@FindBy(xpath="//img[@src='themes/softed/images/menuDnArrow.gif']")
	private WebElement moreDropdown;
	
	@FindBy(xpath="//a[@href='index.php?module=Accounts&action=index']")
	private WebElement organizationLink;
	
	@FindBy(xpath="//a[@href='index.php?module=Contacts&action=index']")
	private WebElement contactlink;

	@FindBy(linkText="Campaigns")
	private WebElement campaignsTab;
	
	@FindBy(xpath="//a[@href='index.php?module=Products&action=index']")
	private WebElement productionlink;
	
	@FindBy(xpath="//a[@href='index.php?module=Documents&action=index']")
	private WebElement Documentlink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement  administratorIcon;
	
	
	@FindBy(xpath="//a[.='Sign Out']")
	private WebElement signOutlink;
	
	//initialize the driver address to all the elements through constructors and make it as public
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	public void contactlink()
	{
		contactlink.click();
	}
	
	public void HomepageOrganizationlink()
	{
		organizationLink.click();
	}
	public void moredropdown() throws InterruptedException
	{
		Thread.sleep(1000);
		moreDropdown.click();
	}
	public void clickproductionlink()
	{
		 productionlink.click();
	}
	public void clickDocumentlink()
	{
		 Documentlink.click();
	}
	public void clickCampaign(WebDriver driver) {
		WebbdriverUtility.mouseHoverOntheElement(moreDropdown, driver);
		campaignsTab.click();
	}
	
	public void signOut(WebDriver driver) throws InterruptedException
	{
		WebbdriverUtility.initializeActions(driver);
		WebbdriverUtility.mouseHoverOntheElement(administratorIcon, driver);
		signOutlink.click();
	}
	

}
