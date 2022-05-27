package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignPage {
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createcampaignLookupImg;
	
	public CampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void clickCreateCampignLookUpImg() {
		createcampaignLookupImg.click();
		
	}
	


}
