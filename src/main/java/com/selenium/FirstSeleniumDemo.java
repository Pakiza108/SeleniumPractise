package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\outcast\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("D:\\Users\\outcast\\Desktop\\PAKIZA\\Learning\\Selenium\\web.html");
          //driver.findElement(By.id("name")).sendKeys("pakiza");
          List<WebElement> el=driver.findElements(By.tagName("input"));
	     System.out.println("How many input tags available : " +el.size());
	     driver.findElement(By.xpath("//*[@id='name']")).sendKeys("testing the application" + Keys.ENTER);
	     

	}

}
