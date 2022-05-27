package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignwthProdWindow {
	@FindBy(xpath="//input[@id='search_txt']")
	private WebElement searchTxt;
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement searchnowBtn;
	
	
	@FindBy(xpath="//tr[2]/td[1]/a")
	private WebElement searchLink;
	
//buis
	public CampaignwthProdWindow(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void sendtextToSearch(String productName) throws InterruptedException
	{
		
		searchTxt.sendKeys(productName);
	}
	public void searchNow() throws InterruptedException
	{
		Thread.sleep(5000);
		searchnowBtn.click();
	}
	public void clickOnLink()
	{
		searchLink.click();
	}
	
	
}

