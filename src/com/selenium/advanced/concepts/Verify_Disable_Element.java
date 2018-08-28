package com.selenium.advanced.concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verify_Disable_Element {

	@Test
	public void verifyobject() 
	{
	
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.olx.in/bangalore/cars/q-shift/?parser[q]=swift");
		String classNmae=driver.findElement(By.xpath(".//*[@id='param_model']")).getAttribute("class");
		Assert.assertEquals(classNmae, "param paramSelect disabled");

		driver.close();
		
	}
}
