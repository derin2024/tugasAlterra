$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "As a User i want to login website sauce demo",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.before({
  "duration": 25057841900,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Normal login",
  "description": "",
  "id": "login;normal-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User already on website sauce demo",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User input \"standard_user\" as userName and input \"secret_sauce\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User already on sales page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyLandingPage()"
});
formatter.result({
  "duration": 2285597600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 12
    },
    {
      "val": "secret_sauce",
      "offset": 50
    }
  ],
  "location": "LoginSteps.inputCredential(String,String)"
});
formatter.result({
  "duration": 4801167100,
  "status": "passed"
});
formatter.match({
  "location": "SalesSteps.verifySalesPage()"
});
formatter.result({
  "duration": 107877300,
  "status": "passed"
});
formatter.after({
  "duration": 4794599700,
  "status": "passed"
});
formatter.uri("features/Sales.feature");
formatter.feature({
  "line": 3,
  "name": "Sales",
  "description": "As a User i want to checkout in website sauce demo",
  "id": "sales",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Sales"
    }
  ]
});
formatter.before({
  "duration": 8061870600,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Normal Sales",
  "description": "",
  "id": "sales;normal-sales",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I succes login with username \"standard_user\" and  \"secret_sauce\" password and add cart",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User already on sales page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User sort product list by name Z to A",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Add Sauce Lab Onesie",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Add Test.allTheThings T-Shirt Red",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User click cart icon",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User remove Test.allTheThings T-Shirt Red",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User checkOut",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User input \"Derin\" as first name and input \"Malsa\" as last name and \"123456\" as postal code",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User click Finish",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User verify checkout order",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 30
    },
    {
      "val": "secret_sauce",
      "offset": 51
    }
  ],
  "location": "SalesSteps.loginAndAddCart(String,String)"
});
formatter.result({
  "duration": 10229788600,
  "status": "passed"
});
formatter.match({
  "location": "SalesSteps.verifySalesPage()"
});
formatter.result({
  "duration": 97604700,
  "status": "passed"
});
formatter.match({
  "location": "SalesSteps.sortProduct()"
});
formatter.result({
  "duration": 264314700,
  "status": "passed"
});
formatter.match({
  "location": "SalesSteps.addingItem1()"
});
formatter.result({
  "duration": 161310000,
  "status": "passed"
});
formatter.match({
  "location": "SalesSteps.addingItem2()"
});
formatter.result({
  "duration": 120787900,
  "status": "passed"
});
formatter.match({
  "location": "SalesSteps.clickCart()"
});
formatter.result({
  "duration": 222125600,
  "status": "passed"
});
formatter.match({
  "location": "SalesSteps.removeTest()"
});
formatter.result({
  "duration": 165795900,
  "status": "passed"
});
formatter.match({
  "location": "SalesSteps.clickCheckOut()"
});
formatter.result({
  "duration": 235755100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Derin",
      "offset": 12
    },
    {
      "val": "Malsa",
      "offset": 44
    },
    {
      "val": "123456",
      "offset": 69
    }
  ],
  "location": "SalesSteps.clickContinue(String,String,String)"
});
formatter.result({
  "duration": 964536700,
  "status": "passed"
});
formatter.match({
  "location": "SalesSteps.clickFinish()"
});
formatter.result({
  "duration": 174812400,
  "status": "passed"
});
formatter.match({
  "location": "SalesSteps.verifyCheckOutOrder()"
});
formatter.result({
  "duration": 69902000,
  "status": "passed"
});
formatter.after({
  "duration": 1778939100,
  "status": "passed"
});
});