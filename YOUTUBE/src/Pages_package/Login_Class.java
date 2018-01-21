package Pages_package;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Class 
{
	
	public ChromeDriver driver;
	public Properties pr;
	public Login_Class (ChromeDriver driver,Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void enter_details(String email,String password) throws InterruptedException
	{
		WebElement SIGNIN=driver.findElement(By.id(pr.getProperty("text")));
		SIGNIN.click(); 
		  WebElement EmailorPhone=driver.findElement(By.id(pr.getProperty("identifierId" )));
		  EmailorPhone.sendKeys("kuldeepsikka92@gmail.com");
		  WebElement Next=driver.findElementByXPath(pr.getProperty(".//*[@id='identifierNext']"));
		  Next.click();
		  WebElement Enteryourpassword=driver.findElement(By.name(pr.getProperty("password")));
			 Enteryourpassword.sendKeys("kul@902637411");
			 Thread.sleep(3000);
			 WebElement next=driver.findElement(By.xpath(pr.getProperty(".//span[text()='Next']")));
			 next.click();
			 
	}

}
