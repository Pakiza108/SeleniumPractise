package com.guru99.basic;

import java.util.List;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class guru99LoginDemo {

	private static final String TimeSpan = null;

	public static <IWebDriver> void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\Users\\outcast\\Desktop\\Driver\\geckodriver.exe");
	      WebDriver driver = new FirefoxDriver();
//	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.get("http://demo.guru99.com/v4/");
	      //verify we are on right page or not?
	   if(driver.getTitle().equals( "Guru99 Bank Home Page")) {
		   System.out.println(driver.getTitle()); //Guro99 Bank Home page
		   System.out.println(driver.getCurrentUrl());
		  //------- TEST CASE 1---------
		   //Invalid Credentials
		   driver.findElement(By.name("uid")).sendKeys("abc");
		   driver.findElement(By.name("password")).sendKeys("1234");
		   driver.findElement(By.name("btnLogin")).click();
		   //to handle popup 
		   Alert alert =driver.switchTo().alert();
		   System.out.println(alert.getText());
		   if(alert.getText().equals("User or Password is not valid")) {
			   alert.accept();
			  }
		
		   
		
		   //------ TEST CASE2 -------------
		   //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		     driver.get("http://demo.guru99.com/v4/manager/addcustomerpage.php");
		   //Valid Case
		   driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mgr123");
		   driver.findElement(By.name("password")).sendKeys("mgr!23");
		   driver.findElement(By.name("btnLogin")).click();
		   if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			   
			   System.out.println("Manager Home Page");
	
			   //----------TEST CASE 3-----------
			   // Customer page link
	
			   driver.findElement(By.linkText("New Customer")).click();		
			   driver.findElement(By.name("name")).sendKeys("pakiza");
			   driver.findElements(By.name("rad1")).get(1).click();  
		   // DOB not done
			    driver.findElement(By.name("dob")).sendKeys("02081998");
			   driver.findElement(By.name("addr")).sendKeys("Johar Block 11");
			   driver.findElement(By.name("city")).sendKeys("Karachi");
			   driver.findElement(By.name("state")).sendKeys("123458");
			   driver.findElement(By.name("pinno")).sendKeys("12345");
			   driver.findElement(By.name("telephoneno")).sendKeys("03215478545");
			   driver.findElement(By.name("emailid")).sendKeys("pakiza12@gmail.com");
			   driver.findElement(By.name("password")).sendKeys("pakiza123@");
			  driver.findElement(By.name("res")).click();
			   
				   
			   
			  
//			   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			   
			   // ----------TEST CASE 4----------------
			   //---- new customer form -------------
			   //if(driver.getTitle().equals("  Guru99 Bank New Customer Entry Page ")) {
			        
			
				 
				   
			   //}
	
		   //}
		 
		
	   //}else
		   //System.out.println("Invalid URL");
	   
	      
}
	   }
	   }
	   }
	   
