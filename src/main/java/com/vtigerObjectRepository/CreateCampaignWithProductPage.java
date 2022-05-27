package com.vtigerObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  CreateCampaignWithProductPage {
	@FindBy(xpath="//input[@id='search_txt']")
	private WebElement searchTxt;

	//@FindBy(xpath="//a[@id='1']")
	//private WebElement productlist;

	@FindBy(xpath="//input[@name='search']")
	private WebElement searchNowBtn;

	//buisness lib
	public CreateCampaignWithProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void sendtoSearch(String productName)
	{
		searchTxt.sendKeys(productName);
	}
	public void clickOnProductLink(WebDriver driver,String productname)
	{
		
		driver.findElement(By.linkText(productname)).click();;
	}
	
	public void searchNow() throws InterruptedException
	{
		searchNowBtn.click();
   
	}
}


