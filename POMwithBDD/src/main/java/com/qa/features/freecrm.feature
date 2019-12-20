Feature: FreeCRM Applicatoin Test

@login
Scenario: Validate FreeCRM Home Page Test

    Given user operns browser
    Then user is on the login page
    Then user enters username and password
    Then validate Home Page Title
    Then validate logged in username
  
@Calender
Scenario: Validate Calender Link Test

    Given user is on the Home Page
    Then user clicks on Calender Link
    Then validate Calender Page URL
    
    