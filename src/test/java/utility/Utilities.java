package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utilities 
{
	WebDriver driver;
	public WebDriver openBrowser()
	{
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	   // driver.manage().window().maximize();
	    return(driver);
	}
	public void launchSite(String url)
	{
		driver.get(url);
	}
	public void closeSite()
	{
		driver.quit();
	}

	

	

}
