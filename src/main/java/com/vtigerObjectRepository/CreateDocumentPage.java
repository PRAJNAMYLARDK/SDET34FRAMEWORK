package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateDocumentPage {
	
	@FindBy(xpath="//a[@href='index.php?module=Documents&action=index']")
	private WebElement createDocumentlink;
	
	
	///bus lib
	public CreateDocumentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
public void clickdocument()
{
	 createDocumentlink.click();
}
	

}
