package com.yt.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.yt.utilities.ReadConfig;

public class Base_Class_for_YT {
	
	ReadConfig readConfig = new ReadConfig();
	public String baseURL=readConfig.getApplicationURL();
	String channel_name = "Naveen AutomationLabs";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("opened chrome - next open url");
		driver.get(baseURL);
		System.out.println("url opened");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//PropertyConfigurator.configure("log4j.properties");		
	}
		

}
