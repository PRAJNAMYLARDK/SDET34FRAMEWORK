package com.vtiger.Organization;

import org.testng.annotations.Test;

import com.sdet34l1.genericutility.BaseClass;
import com.sdet34l1.genericutility.Excelutility;
import com.vtigerObjectRepository.CreateNewOrganizationPage;

public class Organizationwithindustry  extends BaseClass{
	CreateNewOrganizationPage CreateNewOrganizationPage;
	String organaizationname;
	@Test(groups="regression")
	

	public void Organizationwithindustry1() throws InterruptedException
	{
		
		organaizationname=Excelutility.getDataFromExcel("organization", 1, 1)+randomNumber;
		CreateNewOrganizationPage =new CreateNewOrganizationPage(driver);
		homepage.HomepageOrganizationlink();
		
		CreateNewOrganizationPage.CreateNewOrganizationbtn(driver);
		CreateNewOrganizationPage.CreateNewOrganization(organaizationname);
		CreateNewOrganizationPage.industrydrp("Education");
		
		
}
}