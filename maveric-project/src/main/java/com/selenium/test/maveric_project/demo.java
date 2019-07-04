package com.selenium.test.maveric_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\desktop\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://connect.maveric-systems.com");
		driver.findElement(By.xpath("//input[@id='LoginForm_username']")).sendKeys("vinodjacksonc");;
		driver.findElement(By.xpath("//input[@id='LoginForm_password']")).sendKeys("1lyw@yjesus");;
		driver.findElement(By.xpath("//input[@name='yt0']")).click();
		
	}

}
