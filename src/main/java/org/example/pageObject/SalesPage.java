package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesPage {

    public static WebDriver driver;

    public SalesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement verifySalesPage;

    public boolean verifySalesPage() {
        return verifySalesPage.isDisplayed();
    }

    @FindBy(xpath = "//option[.='Name (Z to A)']")
    private WebElement sortProduct;

    public boolean sortProduct() {
        sortProduct.click();
        return sortProduct.isDisplayed();
    }

    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement addingItem1;


    public void addingItem1() {
        addingItem1.click();
    }

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement addingItem2;

    public void addingItem2() {
        addingItem2.click();
    }

    @FindBy(xpath = "//div[@id='shopping_cart_container']/a[1]")
    private WebElement clickCart;

    public void clickCart() {
        clickCart.click();
    }

    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement removeTest;

    public void removeTest() {
        removeTest.click();
    }

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement clickCheckOut;

    public void setClickCheckOut() {
        clickCheckOut.click();
    }

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement inputFirstName;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement inputLastName;
    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement inputZipPostalCode;
    @FindBy(xpath = "//input[@id='continue']")
    private WebElement clickContinue;

    public void setClickContinue(String FirstName, String LastName, String ZipPostalCode) {
        inputFirstName.sendKeys(FirstName);
        inputLastName.sendKeys(LastName);
        inputZipPostalCode.sendKeys(ZipPostalCode);
        clickContinue.click();

    }
    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElement verifyPriceCheckOut;

    public boolean verifyPriceCheckOut() {
       return verifyPriceCheckOut.getText().equals("Total: $7.99");
    }

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement clickFinish;

    public void clickFinish(){
        clickFinish.click();
    }
    @FindBy(xpath = "//span[@class='title']")
    private WebElement verifyCheckOutOrder;

    public boolean verifyCheckOutOrder() {
        return verifyCheckOutOrder.isDisplayed();
    }

}