package com.infofactors;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Frames_W3schools
{
	public static void main(String[] args) throws InterruptedException 
	{
		//https://www.youtube.com/watch?v=YjDmsG7vqkA
		
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_button_formtarget");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		List<WebElement> totalframes = driver.findElements(By.tagName("iframe"));
	    System.out.println("Number of frames in a page :" + totalframes.size());
		
		for(WebElement ele:totalframes) 
		{
			//Returns id of the Frame
			System.out.println("Frame id : "  +ele.getAttribute("id"));
			//Returns name of the Frame
			System.out.println("Frame Name :" +ele.getAttribute("name"));	
		}
		driver.close();
	}

}    //Output =>0
