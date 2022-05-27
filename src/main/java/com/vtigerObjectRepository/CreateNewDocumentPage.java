package com.vtigerObjectRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class CreateNewDocumentPage {

	@FindBy(xpath="//img[@title='Create Document...']")
	private WebElement createDocumentBtn;
	
	@FindBy(xpath="//input[@name='filename']")
			private WebElement browserFileBtn;

	@FindBy(name="notes_title")
	private WebElement createDocumentName;
	
	@FindBy(xpath="//a[@title='Bold']")
	private WebElement clickBoldBtn;	
	
	
	@FindBy(xpath="//a[@title='Italic']")
	private WebElement clickItalicBtn;



	@FindBy(xpath="//input[@class='crmbutton small save']")
	private WebElement saveBtn;


	@FindBy(xpath="//body[@class='cke_show_borders']")
	private WebElement textareafield;

	//@FindBy(xpath="//textarea[@class='detailedViewTextBox']")
	//private WebElement detailtextareaField;


public void clickOnBrowserFile(String file) 
{
	browserFileBtn.sendKeys(file);
}
	public CreateNewDocumentPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void clicknewdocument()
	{
		createDocumentBtn.click();
	}
	public void enterData(String DocumentName)
	{
		createDocumentName.sendKeys(DocumentName);
		
	}
	public void clickonSave()
	{
		saveBtn.click();
	}
	public void textarea(String title ) throws InterruptedException
	{
		
		textareafield.sendKeys(title);
		textareafield.sendKeys(Keys.CONTROL+"A");
		Thread.sleep(1000);
	}
	public void clickOnBoldAndItalic() throws InterruptedException
	{
		Thread.sleep(1000);
		clickBoldBtn.click();
		Thread.sleep(1000);
		clickItalicBtn.click();
		
	}
	
	
	



}









