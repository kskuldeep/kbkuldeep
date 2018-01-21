package basepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class baseclass {
	public ChromeDriver driver;
	public Properties pr;
	@BeforeMethod
	public void asd() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sikka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
			driver.get("https://www.youtube.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    	File f=new File(".//or.Properties");
		FileInputStream fi=new FileInputStream(f);
		pr=new Properties();
		pr.load(fi);
	}
}
