package com.sdet34l1.genericutility;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

import org.openqa.selenium.WebElement;

/**
 * 
 * 
 * @author Admin
 *
 */

public class Javautility
{
	/**
	 * 
	 * 
	 * @param value
	 * @return
	 */


	public long stringToLong(String value)
	{
		return (Long.parseLong(value));
	}
	/**
	 * 
	 * @param limit
	 * @return
	 */
	public int getRandomNumber(int limit)
	{
		Random ran=new Random();
		return  ran.nextInt(limit);


	}
	/**
	 * 
	 * 
	 * 
	 * @param message
	 */
	public void printStatement(String message)
	{
		System.out.println(message);
	}
	public void assertionThroughIfCondition(String actualResult, String expectedResult,String test)
	{
		if((actualResult.equalsIgnoreCase(expectedResult)))
		{
			System.out.println("testCaseName+created succesfully");
			System.out.println("tc is pass");
		}

	}
	
	/**
	 * 
	 * @param element
	 * @param polling_time
	 * @param duration
	 * @throws InterruptedException
	 */
	public void customWait(WebElement element, long polling_time, int duration ) throws InterruptedException
	{
		int count=0;
		while(count<=duration)
		{
			try {
				element.click();
				break;
				
			}
			catch (Exception e) {
				
					Thread.sleep(polling_time);
				
				count++;
				
			}
		}
	}
		
		
			
		public String dateTimeInFormat() {
			return new SimpleDateFormat("yyyy_MM_dd_HH_mm_sss").format(new Date(0));
		}
		
			
		
	}
	
	











































































































