package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage 
{
	@FindBy(xpath="//img[@title='Select']")
	private WebElement orgBtn; 
	
@FindBy(name="search_text")
private WebElement searchOrgText;

@FindBy(xpath="//input[@class='crmbutton small create']")
private WebElement searchNowBtn;

@FindBy(xpath="//tr//tr[2]//tr[2]")
private WebElement pickOrgLink;

public OrganizationPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}

public void sendToSearch(String Text) throws InterruptedException 
{
	Thread.sleep(5000);
	searchOrgText.sendKeys(Text);
}

public void clickOnSearch() 
{
	
	searchNowBtn.click();
}

public void clickOnLink() throws InterruptedException
{
	
	pickOrgLink.click();
}
}
