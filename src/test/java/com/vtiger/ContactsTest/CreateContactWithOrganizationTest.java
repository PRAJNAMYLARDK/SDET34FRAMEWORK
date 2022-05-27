package com.vtiger.ContactsTest;

	import org.testng.annotations.Test;

import com.sdet34l1.genericutility.BaseClass;
import com.sdet34l1.genericutility.Excelutility;

import com.sdet34l1.genericutility.WebbdriverUtility;
import com.vtigerObjectRepository.CreateNewContactPage;
import com.vtigerObjectRepository.OrganizationPage;


	public class CreateContactWithOrganizationTest  extends BaseClass{
		
	@Test()
		public  void CreateContactWithOrganizationTest1() throws InterruptedException
		{
		homepage.contactlink();
		String contactsName = Excelutility.getDataFromExcel("contacts", 1, 1)+randomNumber;
		 String organizationName=Excelutility.getDataFromExcel("organization", 1, 0);
		CreateNewContactPage CreateNewContactPage = new CreateNewContactPage(driver);
		OrganizationPage OrganizationPage=new OrganizationPage(driver);
		CreateNewContactPage.clickcontactBtn();
		CreateNewContactPage.enterFirstName(contactsName);
		CreateNewContactPage.enterLastName(contactsName);
		
		CreateNewContactPage.clickonorgBtn();
		WebbdriverUtility.switchToWindowBasedonTitle(driver, "Organizations");
		OrganizationPage.clickOnSearch();
		OrganizationPage.sendToSearch(organizationName);
		OrganizationPage.clickOnSearch();
		WebbdriverUtility.switchToWindowBasedonTitle(driver, "Contacts");
		CreateNewContactPage.contactSave();
		
	}
	}


