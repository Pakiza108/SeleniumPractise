package com.guru99.ProjectObjectModel;

import java.util.List;
///////////--------- NEW ACCOUNT  AUTOMATION ------------------
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewAccount {
	
	@FindBy(name ="cusid") 
	private WebElement txtCusId;
	
	@FindBys(@FindBy(name ="selaccount"))
	private  List<WebElement> DropdownAcctype;
	@FindBy(name ="inideposit") 
	private WebElement txtIntDept;
	@FindBy(name ="button2")
	private WebElement btnSubmit;
	

	
	//page constructor -------- First step 
			public NewAccount(WebDriver driver) {
		     PageFactory.initElements(driver, this);
			}
			
			public void setCustID(String cusID) {
				
				this.txtCusId.sendKeys(cusID);
				
			}
			public void selectAccount(int acc,WebDriver driver) {
				WebElement myDynamicElement = (new WebDriverWait(driver, 10))
						  .until(ExpectedConditions.presenceOfElementLocated(By.name("selaccount")));  
						          Select drop = new Select(myDynamicElement );
						          drop.selectByIndex(acc);
				
				
			}
			public void setInitialDeposit(String InitDeposit) {
			
				this.txtIntDept.sendKeys(InitDeposit);
				
			}
			
			public void onClickSubmitBtn() {
				
				this.btnSubmit.click();
				
				
			}
}
