package com;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;	
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;		
@Listeners(com.listenerDemo.class)

public class testCases 
{				
	WebDriver driver= new ChromeDriver();					

	@Test		
	public void Login()				
	{		
		driver.get("http://www.google.com/");					
		driver.findElement(By.name("q")).sendKeys("DIKSHA");														
	}		
	
	@Test		
	public void TestToFail()				
	{		
		System.out.println("This method to test fail");					
		Assert.assertTrue(false);			
	}		
}