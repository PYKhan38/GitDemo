package com.yousuf.drivermanager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.yousuf.constants.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	private static final Logger logger = LogManager.getLogger("Practice");

	private static WebDriver driver = null;

	public static void launchBrowser() {

		switch (Constants.BROWSER) {

		case "chrome":

			WebDriverManager.chromedriver().setup();

			logger.info("Launching" + Constants.BROWSER);

			driver = new ChromeDriver();

			break;

		case "edge":

			WebDriverManager.edgedriver().setup();

			logger.info("Launching" + Constants.BROWSER);

			driver = new EdgeDriver();

			break;

		default:

			WebDriverManager.chromedriver().setup();

			logger.info("Launching" + Constants.BROWSER);

			driver = new ChromeDriver();

			break;
		}

	}

	public static WebDriver getDriver() {
		
		return driver;
	}

}
