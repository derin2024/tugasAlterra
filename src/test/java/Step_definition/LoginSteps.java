package Step_definition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {

    private WebDriver webDriver;

    public LoginSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("user open the web page")
    public void verifyLoginPageIsDisplayed() {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.isDisplayed());
    }


    @When("User input \"(.*)\" as userName and input \"(.*)\" as password")
    public void inputCredential(String userName, String password) throws InterruptedException {
        LoginPage LoginPage = new LoginPage(webDriver);
        LoginPage.setUserName(userName);
        LoginPage.setPassword(password);
        LoginPage.clickLogin();
        Thread.sleep(3000);
    }

    @Given("User already on website sauce demo")
    public void verifyLandingPage() {
        LoginPage LoginPage = new LoginPage(webDriver);
        Assert.assertTrue(LoginPage.verifyLandingPage());
    }
    @Then("User see error \"(.*)\" on login page")
    public void verifyErrorText(String errorText) {
        LoginPage LoginPage = new LoginPage(webDriver);
        Assert.assertEquals(errorText, LoginPage.verifyErrorText());
    }


}