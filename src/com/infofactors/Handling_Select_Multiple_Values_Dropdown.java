package com.infofactors;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Select_Multiple_Values_Dropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/admin/Desktop/my.html");
		
		Select sele=new Select(driver.findElement(By.id("cars")));
		
		Thread.sleep(2000);
		sele.selectByVisibleText("scorpio");
		WebElement option=sele.getFirstSelectedOption();
		String carname= option.getText();
		System.out.println("First selected Car Name is "+ carname);
		
		
		Thread.sleep(2000);
		sele.selectByVisibleText("Audi");
		WebElement option1=sele.getFirstSelectedOption();
		String carname1= option1.getText();
		System.out.println("First selected Car Name is "+ carname1);
		
		
		
		Thread.sleep(2000);
		sele.selectByVisibleText("volvo");
		WebElement option2=sele.getFirstSelectedOption();
		String carname2= option2.getText();
		System.out.println("First selected Car Name is "+ carname2);
		
		driver.close();
	}

}
