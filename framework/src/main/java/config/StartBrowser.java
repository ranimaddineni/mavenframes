package config;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartBrowser {
public static WebDriver driver;
ExtentHtmlReporter htmlreporter;
public static ExtentReports extent;
public static ExtentTest parentTest;
public static ExtentTest childTest;
@BeforeTest
public void report()
{
htmlreporter=new ExtentHtmlReporter("Reporter/MyResult.html");
extent =new ExtentReports();
extent.attachReporter( htmlreporter);
}
@BeforeMethod
public void method(Method method)
{

	parentTest=extent.createTest(method.getName());
}
  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
@AfterClass
public void afterclass()

{
 driver.quit();
	
}

}