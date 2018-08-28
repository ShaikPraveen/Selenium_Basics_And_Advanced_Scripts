package com.selenium.advanced.concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyCollapsedAndVerifiedObject 
{
	
	public void verifyCollapsedAndVerifiedObject()
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.hdfcbank.com/htdocs/nri_banking/payments/BillPay/BillPay.htm");
	}

}
