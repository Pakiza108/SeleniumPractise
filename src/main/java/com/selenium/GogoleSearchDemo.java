package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GogoleSearchDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 //FirfoxDriver
	  	//System.setProperty("webdriver.gecko.driver","D:\\Users\\outcast\\Desktop\\Driver\\geckodriver.exe");
	      //WebDriver driver = new FirefoxDriver();
	      //
		//chromeDriver
		//System.setProperty("webdriver.chrome.driver","D:\\Users\\outcast\\Desktop\\Driver\\new\\chromedriver.exe");
	      //WebDriver driver = new ChromeDriver();
	    System.setProperty("webdriver.gecko.driver","D:\\Users\\outcast\\Desktop\\Driver\\geckodriver.exe");
	      WebDriver driver = new FirefoxDriver();
	      //driver.get("D:\\Users\\outcast\\Desktop\\PAKIZA\\Learning\\Selenium\\web.html");
	      driver.get("https://www.wikipedia.org/");
	      driver.manage().window().maximize();
	      driver.findElement(By.id("searchInput")).sendKeys("automation");
	      
	      //dropdown

	      Select select= new Select(driver.findElement(By.id("searchLanguage")));
	     
	      select.selectByIndex(7);
	      //select.deselectByValue("la");
	      driver.findElement(By.className("pure-button")).submit();
	      
	      //screenshorts
	    File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(file, new File("D:\\Users\\outcast\\Desktop\\Driver\\wiki.jpg"));
	    
		      }

}
