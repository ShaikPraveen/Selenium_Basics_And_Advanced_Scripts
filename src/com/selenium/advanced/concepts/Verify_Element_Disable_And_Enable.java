package com.selenium.advanced.concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verify_Element_Disable_And_Enable {

	

		
		
		
		
		@Test
		public void verifielementEnable() throws InterruptedException 
		{
		
			WebDriver driver=new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("https://www.olx.in/bangalore/cars/q-shift/?parser[q]=swift");
			String classNmae=driver.findElement(By.xpath(".//*[@id='param_model']")).getAttribute("class");
			Assert.assertEquals(classNmae, "param paramSelect disabled");
			
			
			//Enable  'Mahandra'
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@class='3rd-category-choose-label header block']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//form/noindex/fieldset/ul/li[1]/ul/li[1]/div[2]/ul/li[5]/a")).click();
			
			String classNmae1=driver.findElement(By.xpath(".//*[@id='param_model']")).getAttribute("class");
			Assert.assertNotEquals(classNmae1, "param paramSelect disabled");
			driver.close();
	}
}
