package com.yt.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.yt.pageObjects.YT_Channel_Page;
import com.yt.pageObjects.YT_homePage;

public class YT_testcase001 extends Base_Class_for_YT {
	
	@Test
	public void YT_sub_views_count () throws InterruptedException {
		
		YT_homePage yt_homepage = new YT_homePage(driver);
		YT_Channel_Page channel_page = new YT_Channel_Page(driver);
		
		yt_homepage.enterSearchText(channel_name);
		Thread.sleep(5000);
		yt_homepage.clickSearch();
		Thread.sleep(5000);
		//Assert.assertEquals(driver.getTitle(),"");
		channel_page.clickAvatar();
		Thread.sleep(5000);
		channel_page.getSubscriberCount();
		Thread.sleep(5000);
		channel_page.click_Videos_About();
		Thread.sleep(5000);
		channel_page.getViewsCount();
		channel_page.clearSearchBox();
		
		
	}

	
	
}
