package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage {
	@FindBy(xpath="//a[@href='index.php?module=Accounts&action=index']")
	private WebElement CreateOrganizationlink;
	
	public  CreateOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickcreateOrganization()
	{
		CreateOrganizationlink.click();
	
	
	

}
}
