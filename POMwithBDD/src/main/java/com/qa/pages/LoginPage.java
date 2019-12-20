package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath = "//div[@class='ui fluid large blue submit button'][contains(.,'Login')]")
	WebElement loginButton;
	
	//Initialization of Page Objects
		public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	//Actions
		public String validateLoginPageTitle() {
			return driver.getTitle();
		}
		
		public HomePage login(String uname, String pword) {
			
			username.sendKeys(uname);
			password.sendKeys(pword);
			
			//Login Button Click
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", loginButton);
			
			return new HomePage();
		}
		
	}
	
