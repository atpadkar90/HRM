package Listener;



import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayerPack.BaseClasss;


public class TakeScreenshot extends BaseClasss {
	
	public static void screenShot(String methodname)
	{
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File f=ts.getScreenshotAs(OutputType.FILE);
	String date=new SimpleDateFormat("ddMMyy-HHmmss").format(new Date());
	File dist=new File(System.getProperty("user.dir")+"\\PassScreenshot\\"+methodname+date+".png");
	try {
		FileUtils.copyFile(f, dist);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	}
}
