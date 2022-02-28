package com.google.POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\Users\\outcast\\Desktop\\PAKIZA\\Learning\\Driver\\geckodriver.exe");
	      WebDriver driver = new FirefoxDriver();
	      driver.get("https://www.google.com/");
	      Tesst test=new Tesst(driver);
	      test.searching("test");
	      

	     

	}

}
