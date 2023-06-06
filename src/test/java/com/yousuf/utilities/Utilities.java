package com.yousuf.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.yousuf.constants.Constants;
import com.yousuf.drivermanager.DriverManager;
import com.yousuf.pageobject.DirectoryPage;
import com.yousuf.pageobject.HomePage;
import com.yousuf.pageobject.LoginPage;

public class Utilities {
	
	String path="C:\\Users\\YOUSUF\\Desktop\\Practice\\Practice\\src\\test\\resources\\config.properties";
	
	public void loadProperties() throws Exception {
		
		FileInputStream fis= new FileInputStream(path);		
		
		Properties pro= new Properties();		
		
		pro.load(fis);
		
		Constants.APP_URL=pro.getProperty("APP_URL");
		
		Constants.BROWSER=pro.getProperty("BROWSER");
		
		Constants.UserName=pro.getProperty("UserName");
		
		Constants.Password=pro.getProperty("Password");
		
		Constants.CHORME_DRIVER_LOCATION=pro.getProperty("CHORME_DRIVER_LOCATION");
		
		Constants.EDGE_DRIVER_LOCATION=pro.getProperty("EDGE_DRIVER_LOCATION");
	}
	
	public void initWebElements() {
		
		PageFactory.initElements(DriverManager.getDriver(), LoginPage.getInstance());
		
		PageFactory.initElements(DriverManager.getDriver(), HomePage.getInstance());
		
		PageFactory.initElements(DriverManager.getDriver(), DirectoryPage.getInstance());
		
		
	}
	
	
	
	

}
