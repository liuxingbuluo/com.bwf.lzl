package com.bwf.util;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.service.DriverService;

public class ServiceUtil {
	public static DriverService  service; 
	public static String Browser;

	static {
		Browser = System.getProperty("bwf.test.browser", "firefox");
		if("firefox".equalsIgnoreCase(Browser)) {
				service = new GeckoDriverService.Builder()
						.usingFirefoxBinary(new FirefoxBinary(new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe")))
						.usingAnyFreePort()
						.usingDriverExecutable(new File("E:\\TOOL\\GeckoDriver\\geckodriver.exe"))
						.build();
				
		}else if("chrome".equalsIgnoreCase(Browser)) {
			//chromedriverµÄ¹¹Ôì
		}
			try {	
				service.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static WebDriver getDriver() {
		WebDriver driver=null;
		DesiredCapabilities caps=null;
		if("firefox".equalsIgnoreCase(Browser)) {
			caps=DesiredCapabilities.firefox();
		}
		driver =new RemoteWebDriver(service.getUrl(),caps);
		return driver;
	}
	public static void stopService() {
		service.stop();
	}
}
