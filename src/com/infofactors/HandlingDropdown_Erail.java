package com.infofactors;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown_Erail {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
   driver.get("https://erail.in/");
   Select sele=new Select(driver.findElement(By.id("cmbQuota")));
   sele.selectByVisibleText("Defence");
   Thread.sleep(2000);
   sele.selectByIndex(3);//Pre.tatkal
   Thread.sleep(2000);
   //sele.selectByValue("13");//Ladies
   
	}

}
