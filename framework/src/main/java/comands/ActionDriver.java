package comands;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.MediaEntityBuilder;

import config.StartBrowser;

public class ActionDriver {

	WebDriver driver;
	
	public ActionDriver() {
	
		
		driver=StartBrowser.driver;
		
	}
	
	public void navigateToApplication(String url) throws Exception {
		try
		{
	
	driver.get(url);
	StartBrowser.childTest.pass("suceesafully find:"+url);
	}
		catch(Exception e)
		{ StartBrowser.childTest.fail("unable to find"+url,
				MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
    	StartBrowser.childTest.info(e);
    	throw e;
		}
		}
    public void click(By locator, String element) throws Exception{
    try
    {
    	driver.findElement(locator).click();
    	StartBrowser.childTest.pass("locatorfind:"+element);
}
    catch(Exception e)
    {
    	StartBrowser.childTest.fail("unable to find:"+element, 
    			MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
    	StartBrowser.childTest.info(e);
    	throw e;
    }
    }
    public void type( By locator,String text,String element) throws Exception
    {
    	
		try
    	{driver.findElement(locator).sendKeys(text);
    		StartBrowser.childTest.pass("able to type:"+element+"withdatd:"+text);
    	}
    	catch(Exception e)
    	{
    		
    		StartBrowser.childTest.fail("unable to type:"+element+"withdatd:"+text,
    				MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
    		StartBrowser.childTest.info(e);
    		throw e;
        }
    	}
    public String screenShot()
    {
    return((TakesScreenshot) driver) . getScreenshotAs(OutputType.BASE64);
}
}