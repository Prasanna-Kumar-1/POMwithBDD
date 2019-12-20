package com.qa.stepDefinitions;

import static org.junit.Assert.assertEquals;

import com.qa.pages.CalenderPage;
import com.qa.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CalenderPageSteps {
	
	HomePage       homepage;
	CalenderPage   calpage;
	
	@Given("^user is on the Home Page$")
	public void user_is_on_the_Home_Page() throws Throwable {
		homepage = new HomePage();
		String homeTitle = homepage.verifyHomePageTitle();
		assertEquals("Cogmento CRM",homeTitle);
	}

	@Then("^user clicks on Calender Link$")
	public void user_clicks_on_Calender_Link() throws Throwable {
		Thread.sleep(5000);
		calpage = new CalenderPage();
		homepage.clickOnCalenderLink();

	}

	@Then("^validate Calender Page URL$")
	public void validate_Calender_Page_URL() throws Throwable {
		
		calpage = new CalenderPage();
		String calURL = calpage.CalenderPageURL();
		assertEquals("https://ui.freecrm.com/calendar",calURL);
	
	}
}
