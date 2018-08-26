package com.infofactors;




import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingTextbox_Erail_Suggestion {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://erail.in/");
		driver.findElement(By.id("txtStationFrom")).clear();
		
		driver.findElement(By.id("txtStationFrom")).sendKeys("che");
		
		List<WebElement> trainnames=driver.findElements(By.xpath("html/body/div[2]/div/div/div"));
		System.out.println(trainnames.size());
		
		for (int i = 0; i < trainnames.size(); i++) 
		{
			System.out.println(trainnames.get(i).getText());
			
		}
		
		driver.close();
	}

}
