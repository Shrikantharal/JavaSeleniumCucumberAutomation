Feature: CartFeature

  Background: 
    Given User Logged in to AutomationExercise Application

  Scenario: Verify CheckOut Functionality
    When User clicks Checkout Menu
    Then Verify Invoice address
    
