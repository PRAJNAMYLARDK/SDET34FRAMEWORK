package com.OrganizationTest;


import org.testng.annotations.Test;

import com.sdet34l1.genericutility.BaseClass;
import com.sdet34l1.genericutility.Excelutility;
import com.vtigerObjectRepository.CreateNewOrganizationPage;
import com.vtigerObjectRepository.CreateSearchOrgNumberPage;


public class CreateSearchOrganizationByOrgNumber extends BaseClass {
	@Test
	
	public void SearchOrganizationByOrgNumber1()
	{
		String OrganizationName = Excelutility.getDataFromExcel("organization", 2, 1);
		homepage.HomepageOrganizationlink();
	
	CreateNewOrganizationPage CreateNewOrganizationPage = new CreateNewOrganizationPage(driver);
	CreateNewOrganizationPage.CreateNewOrganizationbtn(driver);
	 CreateNewOrganizationPage.CreateNewOrganization(OrganizationName);
	 CreateSearchOrgNumberPage CreateSearchOrgNumberPage = new CreateSearchOrgNumberPage(driver);
	 CreateSearchOrgNumberPage.search(OrganizationName);
	 CreateSearchOrgNumberPage.searchnow();
		 
		 
		 
		 
		 
}
}



		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	
	
	
	
	
	


