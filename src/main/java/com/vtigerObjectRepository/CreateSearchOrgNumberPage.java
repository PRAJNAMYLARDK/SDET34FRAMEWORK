package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateSearchOrgNumberPage {
	@FindBy(xpath="//input[@class='searchBox']")
	private WebElement  searchBx;
	
@FindBy(xpath="//input[@name='submit']")
private WebElement searchBtn;




public CreateSearchOrgNumberPage(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
	}


public void search(String text)
{
	 searchBx.sendKeys(text);
}

public void searchnow()
{
	searchBtn.click();


}
}

