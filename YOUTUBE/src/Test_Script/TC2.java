package Test_Script;

import java.util.concurrent.TimeUnit;

import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages_package.Login_Class;
import basepackage.baseclass;


public class TC2 extends baseclass
{
	@Test
   public  void xyz() throws InterruptedException 
{
		Login_Class l=new Login_Class(driver,pr);
		 l.enter_details("kuldeepsikka92@gmail.com","kul@902637411");
	Thread.sleep(3000);
	  WebElement Subscriptions=driver.findElement(By.xpath(pr.getProperty("Subscription")));
	  Subscriptions.click();
	
}

	
}


