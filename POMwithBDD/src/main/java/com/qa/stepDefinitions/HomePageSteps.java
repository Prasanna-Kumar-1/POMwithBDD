package com.qa.stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps extends TestBase{
	
	LoginPage      loginpage;
	HomePage       homepage;
	
	
	@Given("^user operns browser$")
	public void user_operns_browser() throws Throwable {
		TestBase.initialization();
	}

	@Then("^user is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
		loginpage = new LoginPage();
		String title = loginpage.validateLoginPageTitle();
		assertEquals("Cogmento CRM", title);

	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		homepage = new HomePage();
		homepage = loginpage.login(property.getProperty("Username"), property.getProperty("Password"));
	}

	@Then("^validate Home Page Title$")
	public void validate_Home_Page_Title() throws Throwable {
		homepage = new HomePage();
		String homeTitle = homepage.verifyHomePageTitle();
		assertEquals("Cogmento CRM",homeTitle);
	}

	@Then("^validate logged in username$")
	public void validate_logged_in_username() throws Throwable {
		homepage = new HomePage();
		boolean flag = homepage.verifyCorrectUserName();
		assertTrue(flag);
	}
	
	
}
