package mk.qa.automationpractices.tests;

import mk.qa.automationpractices.utilities.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import mk.qa.automationpractices.pages.RegistrationPage;
import org.testng.annotations.Test;

public class Tests extends Setup {
    public WebDriver driver;
    public WebDriverWait wait;

    Browser browser = new Browser();
    public String brs = "chrome";

    public void pause() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void automationPractice() {
        homePage.clickSingIn();
        Assert.assertEquals(registrationPage.titleIsShown(), "Authentication");
        registrationPage.enterMail();
        registrationPage.clickCreateAnAccountBotton();
        registrationPage.clickMrField();
        registrationPage.enterName();
        registrationPage.enterLastName();
        registrationPage.enterPassword();
        registrationPage.selectDay();
        registrationPage.selectMonth();
        registrationPage.selectYear();
        registrationPage.clickReceiveSpecialOffers();
        registrationPage.addressFirstName();
        registrationPage.addressLastFirstName();
        registrationPage.enterAddress();
        registrationPage.enterCity();
        registrationPage.selectState();
        registrationPage.enterZipCode();
        registrationPage.enterPhoneNumber();
        registrationPage.clickRegisterButton();
        registrationPage.myAccountIsShown();
        registrationPage.clickDresses();
        dressesPage.clickEveningDresses();
        dressesPage.clickQuickView();
        dressesPage.clickClose();
        dressesPage.clickDressesCategory();
        dressesPage.clickList();
        dressesPage.clickAddToCard();
        dressesPage.clickContinueShopping();
        dressesPage.clickAddToCartPrintedDress();
        dressesPage.clickContinueShoppingPrintedDress();
        dressesPage.clickmainLogo();
        homePage.clickCart();
        Assert.assertEquals(proceedToCheckoutPage.yourShoppingCartIsShown(), "Your shopping cart");
        Assert.assertEquals(proceedToCheckoutPage.twoProductsInCartIsShown(), "2 Products");
        proceedToCheckoutPage.clickTrash();
        pause();
        Assert.assertEquals(proceedToCheckoutPage.oneProductInCartIsShown(), "1 Product");
        proceedToCheckoutPage.clickPlusBotton();
        pause();
        Assert.assertEquals(proceedToCheckoutPage.twoProductsInCartIsShown(), "2 Products");
        proceedToCheckoutPage.clickProceedToCheckOut();
        Assert.assertEquals(proceedToCheckoutPage.titleAddressesIsShown(), "ADDRESSES");
        proceedToCheckoutPage.clickProceedToCheckOutSecondTime();
        Assert.assertEquals(proceedToCheckoutPage.titleShippingIsShown(), "Shipping");
        proceedToCheckoutPage.clickProceedToCheckOutThirdTime();
        Assert.assertEquals(proceedToCheckoutPage.agreeToTheTermsOfService(), "You must agree to the terms of service before continuing.");
        proceedToCheckoutPage.clickCloseButton();
        proceedToCheckoutPage.clickAgreeTerms();
        proceedToCheckoutPage.clickProceedToCheckoutFourthTime();
        Assert.assertEquals(proceedToCheckoutPage.yourPaymentMethodIsShown(), "Your payment method");
        proceedToCheckoutPage.clickPayByCheckButton();
        Assert.assertEquals(proceedToCheckoutPage.checkPaymentTitleIsShown(), "Check payment");
        proceedToCheckoutPage.clickIConfirmMyOrder();
        Assert.assertEquals(proceedToCheckoutPage.thankYOuMessageIsShown(), "Order confirmation");
    }


}

