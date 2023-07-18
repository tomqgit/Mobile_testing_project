package com.yt.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YT_Channel_Page {

	WebDriver ldriver;
	
	public YT_Channel_Page (WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	@FindBy(xpath=".//div[@id='avatar']")
	@CacheLookup
	WebElement avatar;
	
	@FindBy(id="subscriber-count")
	@CacheLookup
	WebElement subscriber_count;
	
	@FindBy(xpath=".//*[@id='tabsContent']/tp-yt-paper-tab[2]/div[@style-target='tab-content']")
	@CacheLookup
	WebElement videos;
	
	@FindBy(xpath=".//*[@id='tabsContent']/tp-yt-paper-tab[6]/div[@style-target='tab-content']")
	@CacheLookup
	WebElement about;
	
	@FindBy(xpath=".//yt-formatted-string[@class='style-scope ytd-channel-about-metadata-renderer'][contains(text(),'views')]")
	@CacheLookup
	WebElement views;
	
	@FindBy(xpath=".//input[@id='search']")
	@CacheLookup
	WebElement clear;
	
	public void clickAvatar () {
		avatar.click();
	}
	
	public void getSubscriberCount() {
		subscriber_count.getText();
	}
	
	public void click_Videos_About () {
		videos.click();
		about.click();
	}
	
	public void getViewsCount() {
		views.getText();
	}
	
	public void clearSearchBox () {
		
		clear.clear();
	}
}
