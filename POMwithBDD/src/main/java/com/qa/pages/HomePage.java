package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath = "//span[contains(@class,'user-display')]")
	WebElement UserNameLabel;
	
	@FindBy(xpath = "//span[@class='item-text'][contains(.,'Calendar')]")
	WebElement 	CalenderLabel;
	
	@FindBy(xpath = "//span[@class='item-text'][contains(.,'Contacts')]")
	WebElement ContactsLabel;
	
	@FindBy(xpath = "//span[@class='item-text'][contains(.,'Companies')]")
	WebElement CompaniesLabel;
	
	@FindBy(xpath = "//span[@class='item-text'][contains(.,'Tasks')]")
	WebElement TasksLabel;
	
	//Initialization of Page Objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Check the Home Page Title
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	//Verify whether correct user name is displayed on the HomePage
	public boolean verifyCorrectUserName(){
		return UserNameLabel.isDisplayed();
	}
	
	//Click on CalenderLink
	public CalenderPage clickOnCalenderLink()
	{
		CalenderLabel.click();
		return new CalenderPage();
	}

	//Click on Contacts Link
	public ContactsPage clickOnContactsLink()
	{
		ContactsLabel.click();
		return new ContactsPage();
	}
	
	//Click on Companies Link
	public CompaniesPage clickOnCompaniesLink()
	{
		CompaniesLabel.click();
		return new CompaniesPage();
	}
	
	//Click on Tasks Link
	public TasksPage clickOnTasksLink()
	{
		TasksLabel.click();
		return new TasksPage();
	}
			
}
