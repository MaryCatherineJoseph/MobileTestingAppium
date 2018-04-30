package com.pack.mob;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.pack.startFile.StartUpFile;



public class SendTextMsgInHike extends StartUpFile{

	public void sendMsg() 
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
	   
	   //locate the text box and send the message using sendkeys
	   WebElement textBox=driver.findElement(By.id("com.bsb.hike:id/msg_compose"));
	   textBox.sendKeys("Hi my dear Happy to have you in my life !!! A lovable Karadi Paiyya");
	
	WebElement send=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.view.View"));
	send.click();
	
	}

	public static void main(String[] args)  {
		
		SendTextMsgInHike application=new SendTextMsgInHike();
		application.sendMsg();
	}
	
}
