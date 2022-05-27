package com.vtiger.CampaignsTest;

import org.testng.annotations.Test;

import com.sdet34l1.genericutility.BaseClass;
import com.sdet34l1.genericutility.Excelutility;
import com.sdet34l1.genericutility.Javautility;
import com.sdet34l1.genericutility.WebbdriverUtility;
import com.vtigerObjectRepository.CreateCampaignWithProductPage;
import com.vtigerObjectRepository.CreateNewCampaignPage;
import com.vtigerObjectRepository.CreateNewProductPage;

public class CreateCampaignWthProduct  extends BaseClass{


	@Test()
	public  void createcampaignProduct() throws InterruptedException
	{
		String CampaignName = Excelutility.getDataFromExcel("campaign", 0, 1)+randomNumber;
		String ProductName = Excelutility.getDataFromExcel("products", 1, 1)+randomNumber;
		CreateNewCampaignPage CreateNewCampaignPage = new CreateNewCampaignPage(driver);
		CreateCampaignWithProductPage CreateCampaignWithProductPage = new CreateCampaignWithProductPage(driver);
		CreateNewProductPage CreateNewProductPage =new CreateNewProductPage (driver);
		homepage.clickproductionlink();
		CreateNewProductPage.clickNewProctButton1();
		CreateNewProductPage.enterDataToTxtfield(ProductName);
		CreateNewProductPage.clickonSaveButton();
		homepage.moredropdown();
		homepage.clickCampaign(driver);
		CreateNewCampaignPage.clickonnewcampaign();
		CreateNewCampaignPage.enterCampaignName(CampaignName);
		CreateNewCampaignPage.clickOnProductImg(driver);
		WebbdriverUtility.switchToWindowBasedonTitle(driver, "Products");
		CreateCampaignWithProductPage.sendtoSearch(ProductName);
		CreateCampaignWithProductPage.searchNow();
		CreateCampaignWithProductPage.clickOnProductLink(driver, ProductName);
	WebbdriverUtility.switchToWindowBasedonTitle(driver, "Campaigns");
		
	}
}























