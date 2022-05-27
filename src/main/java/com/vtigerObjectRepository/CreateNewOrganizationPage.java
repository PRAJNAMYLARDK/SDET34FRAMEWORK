package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sdet34l1.genericutility.WebbdriverUtility;

public class CreateNewOrganizationPage {
	
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement  createNewOrganizationBtn;
	
	@FindBy(name="accountname")
	private WebElement createOrganizationName;
	
	@FindBy(xpath="//input[@type='radio' and @name='assigntype' and @value='T']")
	private WebElement radioBtn;
	
	@FindBy(xpath="//input[@name='industry']")
	private WebElement industrydrp;
	
	@FindBy(xpath="//input[@class='crmbutton small save']")
	private WebElement saveBtn;
	
	@FindBy(xpath="//select[@name='industry']")
	private WebElement industrydropdown;
	
	@FindBy(xpath="//select[@name='assigned_group_id']")
			private WebElement groupid;
	
	//buisness lib
	
	public  CreateNewOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnRadioButton()
	{	
		radioBtn.click();
	}
	
public void CreateNewOrganizationbtn(WebDriver driver)
{
	
	 createNewOrganizationBtn.click();
		
}
public void CreateNewOrganization(String OrganizationName)
{
	createOrganizationName.sendKeys(OrganizationName);
}

public void clickSavebutton()
{
	saveBtn.click();
}
	public void groupid(String visible )
	{
		WebbdriverUtility.initializeSelect(groupid);
		WebbdriverUtility.dropDownHandlebyVisibleText(visible);
	}	
	public void industrydrp(String visible)
	{
		WebbdriverUtility.initializeSelect(industrydropdown);
		WebbdriverUtility.dropDownHandlebyVisibleText(visible);
	}
}


