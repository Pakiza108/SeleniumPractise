package com.driver.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverfactory {
	

	public static WebDriver getBroser(String browserType)
	{
		
		/////// Create Thread safe driver ( Web Driver Object ) 
		WebDriver driver=null;
		if(browserType.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Users\\outcast\\Desktop\\PAKIZA\\Learning\\Driver\\geckodriver.exe");
			  WebDriverManager.chromedriver().setup();
			  
			  driver=new FirefoxDriver();	
		}
		else if (browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Users\\outcast\\Desktop\\PAKIZA\\Learning\\Driver\\chromedriver.exe");
			  WebDriverManager.firefoxdriver().setup();
			driver=new ChromeDriver();	
	
		}
		driver.manage().window().maximize();	
		return driver;
	}
		
	}


