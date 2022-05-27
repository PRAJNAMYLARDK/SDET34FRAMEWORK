package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage{
	
	@FindBy(xpath="//a[@href='index.php?module=Contacts&action=index']")
	private WebElement contactsBtn;

	//buisness library
	
	public CreateContactPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void clickContactPage() throws InterruptedException
	{
		Thread.sleep(1000);
		contactsBtn.click();

	}
}
	
	

