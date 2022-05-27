package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CreateNewCampaignPage {
	
	@FindBy(xpath="//img[@title='Create Campaign...']")
	private WebElement campaignBtn;
	
	@FindBy(name="campaignname")
	private WebElement campaignTxt;
	
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;

	
	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement productBtn;
	
	
	 @FindBy(xpath="//img[@title='Select']")
	 private WebElement createproductImg;
	
	//business lib
	public CreateNewCampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickonnewcampaign()
	{
		campaignBtn.click();
	}
	
public void enterCampaignName( String CampaignName)
{
	campaignTxt.sendKeys(CampaignName);
}
public void clickSavebutton()
{
	
	saveBtn.click();
}
public void clickOnProductImg(WebDriver driver)
{
	createproductImg.click();
}

public void clickproduct()
{
	 productBtn.click();
}
}
	
