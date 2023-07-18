package com.yt.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig () {
		
		File src = new File ("./Configuration/config.properties");
		
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
			
		
	}
	
	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		System.out.println(url);
		return url;
	}
	
	public String getChannelName() {
		
		String channelname = pro.getProperty("channel_name");		
		return channelname;
	}
	
}
