package com.vtiger.DocumentsTest;

import org.testng.annotations.Test;

import com.sdet34l1.genericutility.BaseClass;
import com.sdet34l1.genericutility.Excelutility;
import com.sdet34l1.genericutility.WebbdriverUtility;
import com.vtigerObjectRepository.CreateNewDocumentPage;

public class CreateDocumentTest  extends BaseClass{
	
	String DocumentName;
	 CreateNewDocumentPage CreateNewDocumentPage;
	
	 @Test(groups="sanity")
	 public void  CreateDocumentTest1() throws InterruptedException 
	 { 
		 DocumentName=Excelutility.getDataFromExcel("Document", 0, 1)+randomNumber;
		 CreateNewDocumentPage CreateNewDocumentPage = new CreateNewDocumentPage(driver);
		homepage.clickDocumentlink();
		CreateNewDocumentPage.clicknewdocument();
		CreateNewDocumentPage.enterData(DocumentName);
		WebbdriverUtility.switchToFrame(driver, 0);
		CreateNewDocumentPage.textarea("smileeee");
		WebbdriverUtility.switchBackToHome(driver);
		CreateNewDocumentPage.clickOnBoldAndItalic();
		CreateNewDocumentPage.clickOnBrowserFile("C:\\Users\\Admin\\Desktop\\prajna.png");
		CreateNewDocumentPage.clickonSave();

}
}
