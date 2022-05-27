package com.vtiger.CampaignsTest;


	
	import org.testng.annotations.Test;

import com.sdet34l1.genericutility.BaseClass;
import com.sdet34l1.genericutility.Excelutility;
import com.vtigerObjectRepository.CampaignInformationPage;
	import com.vtigerObjectRepository.CampaignPage;
	import com.vtigerObjectRepository.CreateNewCampaignPage;
	public class CreateCampaignTest extends BaseClass {

		String Campaignname;
			CampaignPage campaignpage;
			CreateNewCampaignPage createNewCampaignPage;
			CampaignInformationPage campaignInformationPage;
		
			@Test(groups="regression")
			public void createCampaignTest() {
				Campaignname=Excelutility.getDataFromExcel("Campaign", 1, 1);
				homepage.clickCampaign(driver);
				createNewCampaignPage=new CreateNewCampaignPage(driver);
				createNewCampaignPage.clickonnewcampaign();
				
}
	}
