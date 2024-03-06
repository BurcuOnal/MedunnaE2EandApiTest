@ui @e2e
Feature: Create Medunna Room

  Background: User login
    Given Go to Medunna website
    When Click on user dropdown button
    And Click on sign in button
    And Enter username
    And Enter password
    And Click on sign in button again

  Scenario Outline: Create Room
    When Click on Items&Titles option
    And Click on Room option
    And Click on Create a New Room button
    And Enter a oda_no into room number box
    And Chose room type as SUITE
    And Click on status control
    And Enter "<price>" into price box
    And Enter "<description>" into description box
    And Click on save button
    Then Close the site
    Examples:
      | price | description                 |
      | 123   | Created for End To End Test |