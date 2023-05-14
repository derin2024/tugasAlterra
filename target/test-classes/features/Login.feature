@Login
  Feature: Login
    As a User i want to login website sauce demo

  Scenario: Normal login
    Given User already on website sauce demo
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on sales page


