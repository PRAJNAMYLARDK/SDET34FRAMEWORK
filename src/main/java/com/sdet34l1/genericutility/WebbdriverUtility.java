package com.sdet34l1.genericutility;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * 
 * @author Admin
 *
 */

public class WebbdriverUtility {
	static Select select ;
	static Actions act;
	static WebDriverWait wait;
	static JavascriptExecutor js;
	static Javautility ju=new Javautility();
    
	/**
	 * 
	 * @param url
	 * @param driver
	 */
	public static void navigateApp(String url, WebDriver driver){
		driver.get(url);
	}
	/**
	 * 
	 * @param longTimeOut
	 * @param driver
	 */
	public static void browserSetting(long longTimeOut,WebDriver driver) {
		maximizeBrowser(driver);
		waitTillPageLoad(longTimeOut, driver);


	}
	/**
	 * 
	 * This method is used to maximizeBrowser
	 * @param driver
	 */

	public static  void maximizeBrowser(WebDriver driver) {
		driver.manage().window().maximize();


	}

	/**
	 * 
	 * @param longTimeOut
	 * @param driver
	 */
	public static void waitTillPageLoad(long longTimeOut,WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(longTimeOut, TimeUnit.SECONDS);

	}
	/**
	 * 
	 * 
	 * @param driver
	 */



	public static  void initializeActions(WebDriver driver)
	{
		act=new Actions(driver);
	}
	/**
	 * 
	 * 
	 * 
	 * @param morelink
	 * @param driver
	 */
	public static void mouseHoverOntheElement(WebElement morelink,WebDriver driver) 
	{
		
		act.moveToElement(morelink).perform();


	}
	
	
	/**
	 * 
	 * this method is used to wait the control till the particular element is clickable
	 * @param driver
	 */
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
	/**
	 * 
	 * This method is used to  perform explicitwait
	 * 
	 * @param element
	 */

	public static void initializetheexplicitwait(WebDriver driver,long longtime)
	{
		wait= new WebDriverWait(driver,longtime);
	}
	public static  void waitUntilElementClickable(WebElement element) {

		wait.until(ExpectedConditions.elementToBeClickable(element));

	}
	/**
	 * 
	 * This method is used to perform explicit wait
	 * @param element
	 */

	public static void waitUntilElementVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}


/**
 * 
 * This method is used to switch to the window 
 * @param driver
 * @param partialText
 */
	public static void switchToWindowBasedonTitle(WebDriver driver,String partialText) {

		Set<String> sessionsIDs=driver.getWindowHandles();
		for(String id:sessionsIDs)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().contains(partialText))
			{
				break;
			}
		}
	}

/**
 * 
 * This method is used to perform dropdown
 * @param element
 */

	public static void initializeSelect(WebElement element) 
	{
		select =new Select(element);
	}
	/**
	 * 
	 * @param element
	 * @param visibletext
	 */
	public static void dropDownHandlebyVisibleText(String visibletext) {
		select.selectByVisibleText(visibletext);

	}
	/**
	 * 
	 * 
	 * @param element
	 * @param visiblevalue
	 */
	public static void dropDownHandlebyValue(String visiblevalue, WebElement element) {
		select.selectByValue(visiblevalue);
	}
	/**
	 * 
	 * @param element
	 * @param visibleindex
	 */

	public static void dropDownHandlebyVisibleIndex(WebElement element,int index)
	{
		select.selectByIndex(index);

	}
	
	/**
	 * This method is used to switch to the frame
	 * 
	 * @param driver
	 * @param index
	 */
	public static void switchToFrame(WebDriver driver, int  index)
	{
		driver.switchTo().frame(index);
	}
	/**
	 * 
	 * 
	 * @param driver
	 * @param nameorID
	 */
	public static void switchToFrame(WebDriver driver, String nameorID)
	{
		driver.switchTo().frame(nameorID);
	}
	/**
	 * 
	 * 
	 * @param driver
	 * @param element
	 */
	public static void switchToFrame(WebDriver driver,  WebElement element)
	{
		driver.switchTo().frame(element);
	}
	/**
	 * 
	 * 
	 * @param driver
	 */

	public static void switchBackToHome(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
/**
 * this method use to initialize the  java script executor
 * @param driver
 */
public static void initializejs (WebDriver driver) {
	js=(JavascriptExecutor)driver;
}
/**
 * this method use to enter the data by using jse
 * @param element
 * @param data
 */
public static void enterDataThroughJs(WebElement element,String data)
{
	js.executeScript("arguments[0].value=arguments[1]",element,data);
	
}
/**
 * This method use to click by using jse
 * @param object
 */
public static void clickThroughJs(Object object)
{
	js.executeScript("arguments[0].click",object);
}
/**
 * this method use to navigate application by using jse
 * @param url
 */
public static void navigateApplicationThroughJs(String url)
{
	js.executeScript("window.location=arguments[0]",url);
}
/**
 * This method use to scroll
 * @param height
 */
public static void scrollToSpecifiedHeight(String height) {
	js.executeScript("window.scrollBy(0,"+height+") ");
}
/**
 * this method use scrolldown
 */
public static void scrollToBottom()
{
	js.executeScript("window.scrollBy(0,document .body.scrollHeight)");
}
/**
 * this method use to scroll till element
 * @param element
 */
public static void scrollTittleElement(WebElement element) {
	js.executeScript("arguments[0].scrollIntoView()", element);
}
public static String takeScreenShot(String FileName,WebDriver driver)
{
	TakesScreenshot ts =(TakesScreenshot)driver;
	File src= ts.getScreenshotAs(OutputType.FILE);
	
	File dst= new File("./screenshot/"+FileName+"_"+ju.dateTimeInFormat()+".png");
	System.out.println(dst.getAbsolutePath());
	try {
		FileUtils.copyFile(src, dst);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return dst.getAbsolutePath();
}
}
















