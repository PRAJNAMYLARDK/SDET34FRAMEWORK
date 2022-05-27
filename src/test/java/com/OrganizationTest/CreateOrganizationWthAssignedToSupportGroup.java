package com.OrganizationTest;

import org.testng.annotations.Test;

import com.sdet34l1.genericutility.BaseClass;
import com.sdet34l1.genericutility.Excelutility;
import com.vtigerObjectRepository.CreateNewOrganizationPage;

public class CreateOrganizationWthAssignedToSupportGroup  extends BaseClass{ 
	@Test
	
	public void CreateOrganizationWthAssignedToSupportGroup1()
	{
	
		String OrganizationName = Excelutility.getDataFromExcel("organization", 2, 1);
		homepage.HomepageOrganizationlink();
	
	 CreateNewOrganizationPage CreateNewOrganizationPage = new CreateNewOrganizationPage(driver);
	 CreateNewOrganizationPage.CreateNewOrganizationbtn(driver);
	 CreateNewOrganizationPage.CreateNewOrganization(OrganizationName);
	 CreateNewOrganizationPage.clickOnRadioButton();
	 CreateNewOrganizationPage.groupid("Team Selling");
	 CreateNewOrganizationPage.clickSavebutton();
	
	}
}

	
	 
	 
	
	
	
	
	
	
	
	
	
	


