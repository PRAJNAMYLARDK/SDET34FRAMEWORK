package com.vtiger.Organization;

import org.testng.annotations.Test;

import com.sdet34l1.genericutility.BaseClass;
import com.sdet34l1.genericutility.Excelutility;
import com.vtigerObjectRepository.CreateNewOrganizationPage;
import com.vtigerObjectRepository.CreateOrganizationDropPage;

public class CreateOrganizationIndustryTest extends BaseClass {
	@Test(groups="regression")
	public void CreateOrganizationIndustryTest1()
	{
		
		String organaizationname = Excelutility.getDataFromExcel("organization", 1, 0)+randomNumber;
		
		CreateNewOrganizationPage CreateNewOrganizationPage = new CreateNewOrganizationPage(driver);
		CreateOrganizationDropPage CreateOrganizationDropPage = new CreateOrganizationDropPage();
		homepage.HomepageOrganizationlink();
		CreateNewOrganizationPage.CreateNewOrganizationbtn(driver);
		CreateNewOrganizationPage.CreateNewOrganization(organaizationname);
		CreateNewOrganizationPage.industrydrp("Education");
		// CreateOrganizationDropPage.selectType("Press");
	}		
	
}
