package Pages_package;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class Video_play {
	public ChromeDriver driver;
	public Properties pr;
	public Video_play (ChromeDriver driver,Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void video()
	{
		List<WebElement> ls=(List<WebElement>) driver.findElement(By.id("video-title"));
	   ls.get(0).click();
}
}