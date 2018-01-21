package Test_Script;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages_package.Login_Class;
import Pages_package.Video_play;
import basepackage.baseclass;

public class TC4 extends baseclass
{
   @Test
    public void qwe() throws InterruptedException
    {
	   Login_Class l=new Login_Class(driver,pr);
		 l.enter_details("kuldeepsikka92@gmail.com","kul@902637411");
		 Video_play V=new Video_play(driver,pr);
	      V.video();
   	 Thread.sleep(3000);
   	 WebElement Subscribe=driver.findElementByXPath(pr.getProperty("Subscribe"));
   	Subscribe.click();
   	 
 	 
    	
    }

}
