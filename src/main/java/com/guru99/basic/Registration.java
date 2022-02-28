package com.guru99.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Registration {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","D:\\Users\\outcast\\Desktop\\Driver\\geckodriver.exe");
	      WebDriver driver = new FirefoxDriver();
	      driver.get("http://demo.guru99.com/v4/");
		
		
		
}
}
