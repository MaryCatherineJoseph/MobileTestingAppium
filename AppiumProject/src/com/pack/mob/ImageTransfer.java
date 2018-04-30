package com.pack.mob;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ImageTransfer {
	RemoteWebDriver driver;
	public void setUp() throws MalformedURLException{
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
			   driver = new RemoteWebDriver(new URL("http://127.0.0.1:4744/wd/hub"), capabilities);
			   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}

			public void sendImage() throws Exception
			{
			   //locate the Text on the calculator by using By.name()
				
				setUp();
			   WebElement next=driver.findElement(By.id("com.bsb.hike:id/validate_btn"));
			   next.click();
			   
			   // If the user wants to restore the backup he uncomment this code 
			   
			   /* WebElement restore=driver.findElement(By.id("com.bsb.hike:id/btn_restore"));
			   restore.click();*/
			   
			   // use this code to skip the backup restore
			   WebElement skip=driver.findElement(By.id("com.bsb.hike:id/restore_skip"));
			   skip.click();
			   
			   WebElement confirmSkip=driver.findElement(By.id("com.bsb.hike:id/confirm_text_view"));
			   confirmSkip.click();
			   
			   WebElement menuSkip=driver.findElement(By.id("com.bsb.hike:id/menu_skip"));
			   menuSkip.click();
			   
			   WebElement overFlow=driver.findElement(By.id("com.bsb.hike:id/overflow_icon_image"));
			   overFlow.click();
			   
			   // Click on the chat to whom you want to send a message
			   WebElement chat1=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.LinearLayout"));
			   chat1.click();
	
	
	//Click on the attach icon to select an image
WebElement attachBt=driver.findElement(By.id("com.bsb.hike:id/attach_wa_inside_btn"));
attachBt.click();

//click on the gallery icon
WebElement gallery=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.ImageView"));
gallery.click();

//Navigate and click the folder where images are present
WebElement folder=driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='FOLDER']"));
folder.click();

WebElement clickrFolder=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.ImageView"));
clickrFolder.click();

// select the image which u want to send and click the send button
WebElement image=driver.findElement(By.xpath("	/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[9]/android.widget.ImageView"));
image.click();

WebElement sendImage=driver.findElement(By.id("com.bsb.hike:id/send"));
sendImage.click();
	
		}
		
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ImageTransfer imageTransfer=new ImageTransfer();
		imageTransfer.sendImage();
	}

}
