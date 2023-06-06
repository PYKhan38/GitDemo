package com.yousuf.step_def;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.yousuf.constants.Constants;
import com.yousuf.drivermanager.DriverManager;
import com.yousuf.pageobject.LoginPage;
import com.yousuf.utilities.Utilities;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonStepDef {	
	
	private static Logger logger =LogManager.getLogger("Practice");

	@Before
	
	public void beforeScenario() throws Exception {
		
	logger.info("Execution started");
		
	logger.info("Instantiation of the CommonUtilities");
		
		Utilities utils= new Utilities();
		
		logger.info("Loading properties file");
		
		utils.loadProperties();
		
		logger.info("Checking the Driver is null or not");
		
		if (DriverManager.getDriver()== null) {
			
			logger.info("Driver is Null. Instantiating it!");

			DriverManager.launchBrowser();			
			
		}
	}
	


//	public void launchBrowser() {
//		
//		switch (Constants.BROWSER) {
//
//		case "chrome":			
//
//			System.setProperty(Constants.CHORME_DRIVER,Constants.CHORME_DRIVER_LOCATION);	
//					
//			logger.info("Launching"+ Constants.BROWSER);
//			
//			driver = new ChromeDriver();
//
//			break;
//
//		case "edge":			
//
//			System.setProperty(Constants.EDGE_DRIVER,Constants.EDGE_DRIVER_LOCATION);
//
//			logger.info("Launching"+ Constants.BROWSER);
//			
//			driver = new EdgeDriver();
//
//			break;
//
//		default:			
//
//			System.setProperty(Constants.CHORME_DRIVER,Constants.CHORME_DRIVER_LOCATION);	
//
//			logger.info("Launching"+ Constants.BROWSER);
//			
//			driver = new ChromeDriver();
//
//			break;
//		}
//
//}

}
