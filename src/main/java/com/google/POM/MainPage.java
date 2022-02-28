package com.google.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

	@FindBy(xpath ="//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div/div[1]/a/h3")
	private WebElement heading;
	
	public  MainPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void selectinglink() {
		this.heading.click();

	}

}
