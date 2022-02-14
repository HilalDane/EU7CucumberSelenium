

@navigationmenu
Feature: Navigation Menu

  @sd
  Scenario: Login as a driver
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigates Fleet and Vehicles
    Then the title should be Vehicles

  @db
  Scenario: Login as sales manager
    Given the user is on the login page
    When the user enters the sales manager information
    When the user navigates to Marketing and Campaigns
    Then the title should be  Campaigns


  @sd
  Scenario:  Login as store manager
    Given the user is on the login page
    When the user enters the sales manager information
    When the user navigates to Activities and Calendar Pages
    Then the title should be  Calendar