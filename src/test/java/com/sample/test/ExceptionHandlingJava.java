package com.sample.test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandlingJava {

	
	static WebDriver driver;
	static int counter = 0;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		
		get_YT_details("Naveen AutomationLabs");
		get_YT_details("Automation step by step");
		get_YT_details("SDET- QA Automation");
		get_YT_details("RD Automation Learning");
		get_YT_details("SoftwaretestingbyMKT");
		get_YT_details("Mukesh otwani");
		get_YT_details("Madan Gowri");
		get_YT_details("KP TROLL");
		get_YT_details("T-Series");		
		get_YT_details("Madras Samayal");
		driver.close();
		
		
		
	/*	Naveen AutomationLabs
		Automation step by step
		SDET- QA Automation
		RD Automation Learning
		SoftwaretestingbyMKT
		Mukesh otwani
		Madan Gowri
		KP TROLL
		T-Series
		Madras Samayal */

	}

	public static void get_YT_details(String channel_name) throws InterruptedException {
		
		try {
		System.out.println(channel_name);
		WebElement search_field = driver.findElement(By.xpath(".//input[@id='search']"));
		search_field.sendKeys(channel_name);
		Boolean searchFieldDisplay = search_field.isDisplayed();
		//System.out.println(Assert.assertTrue(searchFieldDisplay, true));
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//button[@id='search-icon-legacy']")).click();
		//Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath(".//span[@id='subscribers']")).getText());
		System.out.println(driver.findElement(By.xpath(".//span[@id='video-count']")).getText());
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//div[@id='avatar']")).click();
		//Thread.sleep(5000);
		//System.out.println(driver.findElement(By.id("subscriber-count")).getText());
		//Thread.sleep(5000);
		//System.out.println(driver.findElement(By.xpath(".//yt-formatted-string[@id='subscriber-count']")).getText());
		//driver.findElement(By.xpath(".//*[@id='tabsContent']/tp-yt-paper-tab[2]/div[@style-target='tab-content']")).click();
		driver.findElement(By.xpath(".//*[@id='tabsContent']/tp-yt-paper-tab[6]/div[@style-target='tab-content']")).click(); 
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath(".//yt-formatted-string[@class='style-scope ytd-channel-about-metadata-renderer'][contains(text(),'viewsxy')]")).getText());
		driver.findElement(By.xpath(".//input[@id='search']")).clear();	
		
		}
		
		catch (Exception exp) {
			
			
					counter++;
					System.out.println("-------");	
			System.out.println("counter is "+counter);
			System.out.println("Message is "+exp.getMessage());
			System.out.println("Cause is "+exp.getCause());
			System.out.println("Exception is "+exp.getStackTrace());
			System.out.println("-------");
		}
		
	}

}
