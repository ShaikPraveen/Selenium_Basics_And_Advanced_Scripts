package com.infofactors;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Fileupload_Orangehrm {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://orangehrm.qedgetech.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		
		
		driver.findElement(By.linkText("PIM")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Add Employee")).click();
		
		
		driver.findElement(By.id("firstName")).sendKeys("praveen12");
		driver.findElement(By.id("lastName")).sendKeys("praveen1234");
		driver.findElement(By.id("photofile")).click();
		
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\Praveen_Automation\\Autoit_Programs\\orangehrmfile.exe");
		System.out.println("File Uploaded Successfully");
		
		Thread.sleep(2000);
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		driver.close();
	}

}
