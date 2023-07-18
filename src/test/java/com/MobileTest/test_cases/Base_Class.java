package com.MobileTest.test_cases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;

public class Base_Class {
	
	static AppiumDriver driver;
	
	public static void main (String [] args) throws MalformedURLException {
	DesiredCapabilities dc = new DesiredCapabilities ();
	System.out.println ("Execution Started");
	dc.setCapability("deviceName", "Moto G Plus");
	dc.setCapability("udid", "ZY2238H8RQ");
	dc.setCapability("platformName", "Android");
	dc.setCapability("platformVersion", "7.0");
	dc.setCapability("appPackage", "com.android.calculator2");
	dc.setCapability("appActivity", "com.android.calculator2.Calculator");
	System.out.println ("Caps identified");
	
	URL url = new URL ("http://127.0.0.1:4723/wd/hub");
	System.out.println ("URL opened");
	
	driver = new AppiumDriver (url, dc);
	
	System.out.println ("Application Started");
	
	
	
	
	}

}
