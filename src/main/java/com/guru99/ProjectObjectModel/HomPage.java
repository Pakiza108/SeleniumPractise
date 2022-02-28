package com.guru99.ProjectObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomPage {
	 ///////////---------HOME AUTOMATION ------------------

	@FindBy( linkText ="New Customer")
	private WebElement newCustomerLink;
	@FindBy( linkText ="Edit Customer")
	private WebElement editCustomerlink;
	@FindBy( linkText ="New Account")
	private WebElement newAccountLink;
	
	
	//page constructor -------- First step 
		public HomPage(WebDriver driver) {
	     PageFactory.initElements(driver, this);
		}
		
		public void clickOnNewCustmerLink() {
			this.newCustomerLink.click();
				
		}
		public void clickOnEditCustmerLink() {
			this.editCustomerlink.click();
				
		}
		public void clickOnNewAccountLink() {
			this.newAccountLink.click();
				
		}
}
