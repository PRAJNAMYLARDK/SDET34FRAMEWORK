package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignInformationPage {
	
	@FindBy(xpath="//td[@id='mouseArea_Campaign Name']")
	private WebElement campaignConfirmText;
	
	
	
	public CampaignInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		//business lib 
		public void CampaignInfoconfirm() {
			campaignConfirmText.getText();
		
 
		}
 
 
}