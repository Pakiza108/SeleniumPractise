package com.guru99.ProjectObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","D:\\Users\\outcast\\Desktop\\Driver\\geckodriver.exe");
	      WebDriver driver = new FirefoxDriver();
	      driver.get("http://demo.guru99.com/v4/");
	      driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		 LoginPage loginpage = new LoginPage(driver);
		 loginpage.setUserId("mgr123");
		 loginpage.setPassword("mgr!23");
		 loginpage.ClickonBtnLogin();
		 
			 
		 HomPage homepage=new HomPage(driver);
		 homepage.clickOnNewCustmerLink();
		
		
		NewCustomerPage newCustomerpage=new NewCustomerPage(driver);
		newCustomerpage.setCustomerName("pakiza munawar");
		newCustomerpage.setGender("female");
		newCustomerpage.setDOB("12/01/1998");
		newCustomerpage.setAddress("Block 11 ");
		newCustomerpage.setCity("Karachi");
		newCustomerpage.setState("Sindh");
		newCustomerpage.setPin("12345");
		newCustomerpage.setMobnum("0321581484");
		newCustomerpage.setEmail("pakiza12@gmail.com");
		newCustomerpage.setPass("1234567");
		
		 
		 homepage.clickOnNewAccountLink();
	    NewAccount newaccount= new NewAccount(driver);
	    newaccount.setCustID("101");
	    newaccount.selectAccount(1,driver);
	    newaccount.setInitialDeposit("500");
	    newaccount.onClickSubmitBtn();
	    
		 
}

}
