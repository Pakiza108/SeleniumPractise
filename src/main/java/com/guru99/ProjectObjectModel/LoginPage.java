package com.guru99.ProjectObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
 ///////////--------- LOGIN AUTOMATION ------------------
	@FindBy(name = "uid")
	private WebElement txtuserId;
	@FindBy(name = "password")
	private WebElement txtpassword;
	@FindBy(name = "btnLogin")
	private WebElement btnLogin;
	@FindBy(name = "btnReset")
	private WebElement btnreset;
	
	
	//page constructor -------- First step 
	public LoginPage(WebDriver driver) {
     PageFactory.initElements(driver, this);

	}
	
	public void setUserId(String userId) {
		
		this.txtuserId.sendKeys(userId);
		
	}
	
public void setPassword(String password) {
		
		this.txtpassword.sendKeys(password);
		
	}

   public void ClickonBtnLogin() {
	// TODO Auto-generated method stub
	this.btnLogin.click();
	}

}
