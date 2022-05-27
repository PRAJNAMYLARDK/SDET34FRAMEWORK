package com.vtiger.ContactsTest;

	import org.testng.annotations.Test;

import com.sdet34l1.genericutility.BaseClass;
import com.sdet34l1.genericutility.Excelutility;
import com.vtigerObjectRepository.CreateNewContactPage;

	public class CreateContactTest  extends BaseClass
	{
		@Test(groups="regression")
	

		public  void Contact() throws InterruptedException
		{
			homepage.contactlink();
			CreateNewContactPage CreateNewContactPage = new CreateNewContactPage(driver);
		CreateNewContactPage.clickcontactBtn();
		String contactName = Excelutility.getDataFromExcel("contacts", 1, 0)+randomNumber;
		CreateNewContactPage.enterFirstName(contactName);
		CreateNewContactPage.enterLastName(contactName);
		CreateNewContactPage.contactSave();
		}
	}
		

			









		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		





