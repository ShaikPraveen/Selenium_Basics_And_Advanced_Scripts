package com.selenium.advanced.concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ZoomInandZoomOut {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://softmindinformatics.com");
		
		//One Way
		//((JavascriptExecutor)driver).executeScript("document.body.style.zoom='20%'");
		
		//Second Way
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		js.executeScript("document.body.style.zoom='20%'");
		
		Thread.sleep(3000);
		js.executeScript("document.body.style.zoom='100%'");
		driver.close();
	}

}
