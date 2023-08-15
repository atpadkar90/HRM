package Listener;



import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseLayerPack.BaseClasss;

public class ExtentReportClass extends BaseClasss {
	
	public static ExtentReports extentreports;
	public static String path=System.getProperty("user.dir")+"\\Report\\abc.html";
	public static  ExtentReports setUp() {
	ExtentSparkReporter extentsparkRepoter = new ExtentSparkReporter(path);
	extentreports = new ExtentReports();
	extentreports.attachReporter(extentsparkRepoter);
	return extentreports;
}
}