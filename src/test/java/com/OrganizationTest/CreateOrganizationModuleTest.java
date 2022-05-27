package com.OrganizationTest;

import org.testng.annotations.Test;

import com.sdet34l1.genericutility.BaseClass;
import com.sdet34l1.genericutility.Excelutility;
import com.vtigerObjectRepository.CreateNewOrganizationPage;

public class CreateOrganizationModuleTest extends  BaseClass{
	@Test
	
	public  void  OrganizationModuleTest1() {
		homepage.HomepageOrganizationlink();
		String OrganizationName = Excelutility.getDataFromExcel("organization", 0, 1)+randomNumber;
		CreateNewOrganizationPage CreateNewOrganizationPage = new CreateNewOrganizationPage(driver);
		CreateNewOrganizationPage.CreateNewOrganizationbtn(driver);
		 CreateNewOrganizationPage.CreateNewOrganization(OrganizationName);
		 CreateNewOrganizationPage.clickSavebutton();
	}
	

}
