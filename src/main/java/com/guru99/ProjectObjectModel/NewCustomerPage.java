package com.guru99.ProjectObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerPage {
	 ///////////--------- NEW CUSTOMER AUTOMATION ------------------
	
	@FindBy( name ="name")
	private WebElement txtCustomerName;
	@FindBys(@FindBy (name="rad1"))
	private List<WebElement> radioBtnGender;
	@FindBys(@FindBy(name="dob"))
	private WebElement txtdob;
	@FindBys(@FindBy(name="addr"))
	private WebElement txtAddress;
	@FindBys(@FindBy(name="city"))
	private WebElement txtCity;
	@FindBys(@FindBy(name="state"))
	private WebElement txtState;
	@FindBys(@FindBy(name="pinno"))
	private WebElement txtPin;
	@FindBys(@FindBy(name="telephoneno"))
	private WebElement txtMobnum;
	@FindBys(@FindBy(name="emailid"))
	private WebElement txtEmail;
	@FindBys(@FindBy(name="password"))
	private WebElement txtpass;
	@FindBy(name = "sub")
	private WebElement btnLogin;
	@FindBy(name = "res")
	private WebElement btnreset;
	
	
	
	//page constructor -------- First step 
				public NewCustomerPage(WebDriver driver) {
			     PageFactory.initElements(driver, this);
				}
					
				public void setCustomerName(String name) {
					
					this.txtCustomerName.sendKeys(name);						
				}
				
				public void setGender(String gender) {
					
					if(gender.equals("male")) {
						
						this.radioBtnGender.get(0).click();
					}	else
					{
						this.radioBtnGender.get(1).click();
					}
					}
					public void setDOB(String DOB) {
						this.txtdob.sendKeys(DOB);
											
					}
					public void setAddress(String addres) {
						this.txtAddress .sendKeys(addres);
						
					}
					public void setCity(String city) {
						this.txtCity.sendKeys(city);
						
					}
					public void setState(String state_) {
						this.txtCity.sendKeys(state_);
							
						}
					public void setPin(String pin) {
						
						this.txtPin.sendKeys(pin);
					}
					public void setMobnum(String mobnum) {
						this.txtMobnum.sendKeys(mobnum);
							
						}
					public void setEmail(String email) {
						
						this.txtEmail.sendKeys(email);
					}
					public void setPass(String pass) {
						
						this.txtpass.sendKeys(pass);
					}
					public void btnLogin() {
						this.btnLogin.click();
											
					}
											
					public void btnReset() {
						
						this.btnreset.click();
					}
	
						
					
			}
	
