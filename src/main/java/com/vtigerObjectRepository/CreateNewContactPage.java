package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sdet34l1.genericutility.WebbdriverUtility;

public class CreateNewContactPage {
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createcontactBtn;
	
	@FindBy(name="firstname")
	private WebElement firstnameTxt;
	
	@FindBy(name="lastname")
	private WebElement lastNameText;
	
	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement createorgBtn;
	
	@FindBy(xpath="//input[@class='crmButton small save']")
	private WebElement saveBtn;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administrationicon;
	
	@FindBy(xpath ="//span[@id='dtlview_Last Name']")
	private WebElement createContact;
	
	
	//business lib
	public  CreateNewContactPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	public void clickcontactBtn()
	{
		createcontactBtn.click();
	}
	
	public void enterFirstName(String ContactName)
	{
		
		firstnameTxt.sendKeys("ContactName");
		
	}
	public void enterLastName(String ContactName)
	{
		lastNameText.sendKeys("ContactName");
	}
	public void contactSave()
	{
		

		 saveBtn.click();
	}
	
	public void clickonorgBtn()
	{
		createorgBtn.click();
	}
	
	public void createContact(WebDriver driver, long longtime ) {
		WebbdriverUtility.initializetheexplicitwait(driver,longtime );
		WebbdriverUtility.waitUntilElementVisible(createContact);
		
	}
}
	
