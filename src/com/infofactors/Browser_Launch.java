package com.infofactors;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_Launch
{
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Automation\\Q_Edge\\Launching_Browsers\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Q_Edge\\Launching_Browsers\\chromedriver.exe");
		
		
		WebDriver driver;
		 driver=new FirefoxDriver();
		 driver.manage().deleteAllCookies();
		//driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://way2automation.com");
		String pageTitle=driver.getTitle();
		System.out.println("ProjectTitle =>"+pageTitle);
		
		String pageUrl=driver.getCurrentUrl();
		System.out.println("Project URL=> "+pageUrl);
		
		String windoid=driver.getWindowHandle();
		System.out.println("Window ID => "+windoid);
		
		
		String pagesource=driver.getPageSource();
		System.out.println("Project Source Code =>"+pagesource);
		
		driver.close();
	}

	
}
