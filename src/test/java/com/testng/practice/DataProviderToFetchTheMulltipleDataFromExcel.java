package com.testng.practice;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sdet34l1.genericutility.Excelutility;
import com.sdet34l1.genericutility.Iconstutility;

public class DataProviderToFetchTheMulltipleDataFromExcel {

	
		@Test(dataProvider = "loginData")
		public void practiceTest(String userName,String password) {
			Reporter.log(userName+" -->"+password,true);
			
		}
		
		@DataProvider
		public Object[][] loginData() throws IOException{
			Excelutility.openExcel(Iconstutility.EXCELFILEPATH);
			
		
			return Excelutility.getMultipleDataFromExcel("Multiple");
		}

	}



