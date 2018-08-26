package com.infofactors;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_File_Upload {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/admin/Desktop/fileupload.html");
		driver.findElement(By.name("resumeupload")).click();
		
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("D:\\Praveen_Automation\\Autoit_Programs\\samplefile1.exe");
		System.out.println("Successfully Uploaded");
		driver.close();
		
	}

}
