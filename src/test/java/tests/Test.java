package tests;

import org.openqa.selenium.WebDriver;

import pages.Loginpage;
import utility.Utilities;

public class Test
{
	public static void main(String[] args) throws Exception
	{
		Utilities ut=new Utilities();
		WebDriver driver;
		driver=ut.openBrowser();
		Loginpage lp=new Loginpage(driver);
		ut.launchSite("https://www.flipkart.com");
		Thread.sleep(5000);
		lp.uidFill("9603634253");
		lp.pwdFill("harsha@5304");
		lp.click();
		ut.closeSite();
		}
		
		

	}


