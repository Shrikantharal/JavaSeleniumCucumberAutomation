Feature: ContactUsFeature

  Background: 
    Given User Logged in to AutomationExercise Application

  Scenario: Verify ContactUs Functionality
    Given User clicks on ContactUs Menu
    When User inputs all own contact details
    Then Alert popup should display to accept
   	 And Verify message for successfull submission
