package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.DriverSetup;

public class TC001_LocatorLearning extends DriverSetup {

	String baseUrl = "https://rahulshettyacademy.com/locatorspractice/";

	@Test
	public void locatorLearning() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	    driver.findElement(By.id("inputUsername")).sendKeys("Sadia");
		Thread.sleep(2000);
		
		driver.findElement(By.name("inputPassword")).sendKeys("great");
		Thread.sleep(2000);

		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		//Formula:    tagname.value(if class is given)
		//            tagname#value(if id is given) 
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Siddika");
		//Formula:  //tagname[@attribute='value']
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("test@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("01688662483");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Sadia");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(2000);
		
	}

}
