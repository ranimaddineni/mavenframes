package sample;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import librari.screensreuse;

public class CaptureScreen {
	@Test
	public void captured() throws Exception
	{
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.demosite.center/wordpress/wp-login.php");
	driver.findElement(By.id("user_login")).sendKeys("admin");
	driver.findElement(By.id("user_pass")).sendKeys("demo123");
	driver.findElement(By.xpath("//*[@id='wp-submit']")).click();
	
	screensreuse.utility(driver, "raniresult");
	driver.quit();
		
	}

}
