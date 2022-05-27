package com.vtiger.productsTest;
import org.testng.annotations.Test;

import com.sdet34l1.genericutility.BaseClass;
import com.sdet34l1.genericutility.Excelutility;

import com.vtigerObjectRepository.CreateNewProductPage;

public class CreateProductTest extends BaseClass
{
	String productName;
	CreateNewProductPage CreateNewProductPage ;
	@Test(groups="regression")
	
	public void createProduct()
	{
		productName=Excelutility.getDataFromExcel("products", 0, 1)+randomNumber;
		homepage.clickproductionlink();
	CreateNewProductPage=new CreateNewProductPage(driver);
	CreateNewProductPage.clickNewProctButton1();
	CreateNewProductPage.enterDataToTxtfield(productName);
	CreateNewProductPage.clickonSaveButton();
	}
}
	
	
	
