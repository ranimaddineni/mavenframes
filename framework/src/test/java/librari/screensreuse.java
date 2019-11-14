package librari;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screensreuse
{
	

	public  static void utility(WebDriver driver,String raniresult) 
	{
		try
		{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	
		FileUtils.copyFile(src,new File("./ScreenShotResult/"+raniresult+".png" ));

	
		System.out.println("ScreenShotCapturedSucessfully");
	}
	catch (Exception e) {
		System.out.println("showing exception:"+e.getMessage());

}}

	
		// TODO Auto-generated method stub
		
	}

