package Test_Script;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.KeyState;

import Pages_package.Login_Class;
import Utils.Logs;
import basepackage.baseclass;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.apache.xpath.operations.Or;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TC1 extends baseclass
{
	@Test
public void asc() throws InterruptedException 
 {
	 Login_Class l=new Login_Class(driver,pr);
	 l.enter_details("kuldeepsikka92@gmail.com","kul@902637411");
	 Logs.take_log("Login Successfully","TC1");
Thread.sleep(7000);
  WebElement Trending=driver.findElement(By.xpath(pr.getProperty("Trending")));
  Trending.click();
  Logs.take_log("Clicked on Trending","TC1");
  
  			

	 
 }

}

