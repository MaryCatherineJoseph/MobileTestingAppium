package com.pack.startFile;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class StartUpFile {
	
	public static RemoteWebDriver driver;
	
	public void setUp() {
		//Set up desired capabilities and pass the Android app-activity and app-package to Appium
				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability("platformVersion", "7.1.1");
				capabilities.setCapability("deviceName","ZY224KXK8L");
				capabilities.setCapability("platformName","Android");
				
				// This package name of your app (you can get it from apk info app)
			   capabilities.setCapability("appPackage", "com.bsb.hike");
			   
			// This is Launcher activity of your app (you can get it from apk info app)
				capabilities.setCapability("appActivity","com.bsb.hike.ui.ComposeChatActivity"); 
				
				
			//Create RemoteWebDriver instance and connect to the Appium server
			 //It will launch the Hike App in Android Device using the configurations specified in Desired Capabilities
			   try {
				driver = new RemoteWebDriver(new URL("http://127.0.0.1:4744/wd/hub"), capabilities);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}

	
}
