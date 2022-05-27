package com.sdet34l1.genericutility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyserImplementation implements IRetryAnalyzer{

	@Override
	public boolean retry(ITestResult result) {
		int count=0;
		int maxRetry=4;
		while(count<maxRetry)
		{
			count++;
			return true;
		}
		return  false;
	}
}
		
		
		
		