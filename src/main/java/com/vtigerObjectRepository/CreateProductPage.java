package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CreateProductPage {
	@FindBy(xpath="//a[@href='index.php?module=Products&action=index']")
	private WebElement createProductlink;
	
	/////
	
	
	
	public CreateProductPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void  CreateProductlink()
	{
	createProductlink.click();
	}
}

