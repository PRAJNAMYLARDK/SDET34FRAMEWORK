package com.vtigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sdet34l1.genericutility.WebbdriverUtility;

public class  CreateOrganizationDropPage {
	@FindBy(xpath="//select[@name='industry']")
	private WebElement indDrp;
	
	@FindBy(xpath="//select[@name='accounttype']")
	private WebElement typedrop;
	//buis lib
	public void OrganizationDropPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
public void selectDrop(String visible)
{
	 WebbdriverUtility.initializeSelect(indDrp);
	 WebbdriverUtility.dropDownHandlebyValue(visible, indDrp);
}
public void selectType( String visible)
{
	WebbdriverUtility.initializeSelect(typedrop);
	WebbdriverUtility.dropDownHandlebyValue(visible, typedrop);
}
}

 