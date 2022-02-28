package com.google.POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tesst {

	@FindBy(name = "q")
	private WebElement  txtSearching;
	
	public Tesst(WebDriver driver) {
	     PageFactory.initElements(driver, this);

		}
	public void searching(String text) {
		this.txtSearching.sendKeys(text + Keys.ENTER);
		
	}
}
