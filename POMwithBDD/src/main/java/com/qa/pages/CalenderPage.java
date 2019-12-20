package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class CalenderPage extends TestBase{
	
	@FindBy(xpath = "//div[@class='ui header item mb5 light-black'][contains(.,'Calendar')]")
	WebElement CalenderLabel;
	
	//Initialization of Page Objects
	public CalenderPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Verify whether we are on the Calender URL
	public String CalenderPageURL(){
		return driver.getCurrentUrl();
	}

}
