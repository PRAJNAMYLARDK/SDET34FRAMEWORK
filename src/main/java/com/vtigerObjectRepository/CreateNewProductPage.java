package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CreateNewProductPage {
	
	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement createProductBtn;
	
	
	@FindBy(name="productname")
	private WebElement createProductName;
	
	@FindBy(xpath="//input[@class='crmbutton small save']")
	private WebElement saveBtn;
	
	//buisness lib
	
	public CreateNewProductPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
public void clickNewProctButton1()
{
	createProductBtn.click();
	
}

public void enterDataToTxtfield(String productname)
{
	createProductName.sendKeys(productname);
	
}
public void clickonSaveButton()
{
	saveBtn.click();
	
}
}
