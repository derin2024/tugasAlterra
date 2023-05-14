@Sales

  Feature: Sales
    As a User i want to checkout in website sauce demo

  Scenario: Normal Sales
        Given I succes login with username "standard_user" and  "secret_sauce" password and add cart
        When User already on sales page
        Then User sort product list by name Z to A
        And Add Sauce Lab Onesie
        And Add Test.allTheThings T-Shirt Red
        When User click cart icon
        Then User remove Test.allTheThings T-Shirt Red
        Then User checkOut
        When User input "Derin" as first name and input "Malsa" as last name and "123456" as postal code
        Then User click Finish
        And User verify checkout order


