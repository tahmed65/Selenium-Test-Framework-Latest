package com.facebook.pageObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasePage {
public static WebDriver driver;
	
	public static Properties prop;
	
	
	public BasePage() {
		prop=new Properties();
		try {
			FileInputStream file = new FileInputStream("config.properties");
			try {
				prop.load(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
	}
	
	
	
	
	
	
	
	public static WebDriver initBrowser() {
		
		String browser=prop.getProperty("Browser");
		
		
		if(browser.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
			    driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			 System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver.exe");
			    driver=new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			 System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
			    driver=new InternetExplorerDriver();
		}else {
			System.out.println("Sorry browser not recognized");
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  //This is an example of implicit wait
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		return driver;
		
		
		
		
		
		
	}
	
	
}