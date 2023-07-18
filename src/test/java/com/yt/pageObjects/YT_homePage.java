package com.yt.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YT_homePage {
	
	WebDriver ldriver;
	
	public YT_homePage(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		}
	
	@FindBy(xpath=".//input[@id='search']")
	@CacheLookup
	WebElement YT_search_box;
	
	@FindBy(xpath=".//button[@id='search-icon-legacy']")
	@CacheLookup
	WebElement YT_search_click;
	
	public void enterSearchText(String channel_name) {
		YT_search_box.sendKeys(channel_name);
	}
	
	public void clickSearch () {
		YT_search_click.click();
	}

}
