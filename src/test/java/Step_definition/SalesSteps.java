package Step_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.example.pageObject.LoginPage;
import org.example.pageObject.SalesPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SalesSteps {
    private WebDriver webDriver;

    public SalesSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("I succes login with username \"(.*)\" and  \"(.*)\" password and add cart")
    public void loginAndAddCart(String username, String password) throws InterruptedException {
        LoginSteps loginSteps = new LoginSteps();
        Thread.sleep(3000);
        loginSteps.verifyLoginPageIsDisplayed();
        loginSteps.inputCredential(username, password);
        Thread.sleep(3000);
    }

    @Given("User already on sales page")
    public void verifySalesPage() {
        SalesPage salesPage = new SalesPage(webDriver);
        Assert.assertTrue(salesPage.verifySalesPage());

    }

    @When("User sort product list by name Z to A")
    public void sortProduct() {
        SalesPage salesPage = new SalesPage(webDriver);
        Assert.assertTrue(salesPage.sortProduct());

    }

    @Then("Add Sauce Lab Onesie")
    public void addingItem1()  {
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.addingItem1();

    }

    @Then("Add Test.allTheThings T-Shirt Red")
    public void addingItem2() {
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.addingItem2();

    }

    @When("User click cart icon")
    public void clickCart() {
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.clickCart();

    }

    @Then("User remove Test.allTheThings T-Shirt Red")
    public void removeTest()  {
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.removeTest();

    }

    @Then("User checkOut")
    public void clickCheckOut()  {
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.setClickCheckOut();
    }

    @Then("User input \"(.*)\" as first name and input \"(.*)\" as last name and \"(.*)\" as postal code")
    public void clickContinue(String FirstName, String LastName, String ZipPostalCode)  {
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.setClickContinue(FirstName, LastName, ZipPostalCode);

    }

    @Then("Verify price checkOut")
    public void verifyPriceCheckOut() {
        SalesPage salesPage = new SalesPage(webDriver);
        Assert.assertTrue(salesPage.verifyPriceCheckOut());
    }

    @Then("User click Finish")
    public void clickFinish() {
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.clickFinish();

    }

    @And("User verify checkout order")
    public void verifyCheckOutOrder() {
        SalesPage salesPage = new SalesPage(webDriver);
        Assert.assertTrue(salesPage.verifyCheckOutOrder());
    }
}