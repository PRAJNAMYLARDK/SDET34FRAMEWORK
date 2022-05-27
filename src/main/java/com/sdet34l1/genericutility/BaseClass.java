package com.sdet34l1.genericutility;

	
	import java.io.IOException;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.vtigerObjectRepository.HomePage;
	import com.vtigerObjectRepository.LoginPage;

	import io.github.bonigarcia.wdm.WebDriverManager;
	/**
	 * 
	 * @author Admin
	 *
	 */
	public class BaseClass
	{

		public int randomNumber;
		public String password;
		public String username;
		public long longTimeout;
		public WebDriver driver;
		public LoginPage loginpage;
		public HomePage homepage;
		public Javautility ju;
		public String browser;
		public String url;
		public String timeout;
		@BeforeSuite(groups="BaseClass")
		public void beforesuite1Test() throws IOException {
			//open the database if it is required
			Fileutility.openPropertyFile(Iconstutility.PROPERTYFILEPATH);
			Excelutility.openExcel(Iconstutility.EXCELFILEPATH);
		}
		
		/**
		 * @param loginPage 
		 * @param homePage 
		 * @throws IOException 
		 * 
		 * 
		 */
		@Parameters("browser")
		@BeforeClass(groups="BaseClass")
		public void beforeClass1Test() throws IOException {
			ju=new Javautility();
			  url = Fileutility.getDataFromPropertyFile("url");
			 timeout=Fileutility.getDataFromPropertyFile("timeout");
			 username=Fileutility.getDataFromPropertyFile("username");
			 password=Fileutility.getDataFromPropertyFile("password");
			 browser=Fileutility.getDataFromPropertyFile("browser");
			 longTimeout=ju.stringToLong(timeout);
			 randomNumber=ju.getRandomNumber(1000);
			 switch(browser) {
			 case "firefox":
				 WebDriverManager.firefoxdriver().setup();
				 driver=new FirefoxDriver();
				 break;
			 case "chrome":
			 WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			 break;
			 default:
				 ju.printStatement("please specify proper browserkey");
				 WebDriverManager.chromedriver().setup();
				 driver=new ChromeDriver();
				 break;
				
			 }
			 loginpage=new LoginPage(driver);
			 homepage= new HomePage(driver);
			 WebbdriverUtility.navigateApp(url, driver);
			 WebbdriverUtility.browserSetting(longTimeout, driver);
			 WebbdriverUtility.initializeActions(driver);
			 
		}
		
		/**
		 * 
		 * in this annotation login action is performed
		 * @param loginPage 
		 * @param loginPage 
		 * 
		 */
		@BeforeMethod(groups="BaseClass")
		public void beforeMethod1Test()
		{
			 loginpage.loginAction(username, password);
		
		}
		 /**
		  * 
		  * in this annotation signout action is performed
		 * @throws InterruptedException 
		  * 
		  * 
		  * 
		  */
		
	@AfterMethod(groups="BaseClass")
	public void afterMethod1Test() throws InterruptedException
	{
		homepage.signOut(driver);
	}
	/**
	 * 
	 * in this annotation we will perform the close browser
	 */
	@AfterClass(groups="BaseClass")
	public void afterClass1()
	{
		WebbdriverUtility.quitBrowser(driver);
	}
	
	/**
	 * this method is used to close the excel
	 */
	@AfterSuite(groups="regression")
	public void aftersuite1Test() 
	{
		//Excelutility.closeExcel();
	}

	}


