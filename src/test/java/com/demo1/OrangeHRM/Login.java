package com.demo1.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","‪C:\\drivers\\chromedriver.exe");
		
		//initializing the driver
		WebDriver driver = new ChromeDriver();

		//navigate to app
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//maximize the window
		
		driver.manage().window().maximize();
	
		Thread.sleep(4000);
		
		
		WebElement usrname = driver.findElement(By.xpath("//input[@name='username']"));
		usrname.sendKeys("Admin");
		WebElement psswrd = driver.findElement(By.xpath("//input[@type='password']"));
		psswrd.sendKeys("admin123");
		WebElement logbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		logbtn.click();
	}

}
