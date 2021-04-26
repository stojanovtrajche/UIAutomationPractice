package mk.qa.automationpractices.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProceedToCheckoutPage {

    public WebDriver driver;
    public WebDriverWait wait;

    public ProceedToCheckoutPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }


    By yourshoppingcart = By.xpath("//*[@id=\"columns\"]/div[1]/span[2]");
    By trash = By.className("icon-trash");
    By twoproductsincart = By.xpath("//span[@id='summary_products_quantity']");
    By oneproductincart = By.xpath("//span[@id='summary_products_quantity']");
    By plusbutton = By.className("icon-plus");
    By proceedtocheckoutbutton = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");
    By addressesstitle = By.className("page-heading");
    By proceedtocheckoutbuttonsecondtime = By.xpath("//*[@id=\"center_column\"]/form/p/button/span");
    By shippingtitle = By.className("navigation_page");
    By proceedtocheckoutbuttonthirdtime = By.xpath("//*[@id=\"form\"]/p/button/span");
    By errormessageshown = By.className("fancybox-error");
    By closebutton = By.xpath("//*[@id=\"order\"]/div[2]/div/div/a");
    By iagreetheterms = By.xpath("//*[@id=\"form\"]/div/p[2]/label");
    By proceedtocheckoutbuttonfourthtime = By.xpath("//*[@id=\"form\"]/p/button/span");
    By yourpaymentmethodtitle = By.xpath("//*[@id=\"columns\"]/div[1]/span[2]");
    By paybycheckbutton = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a");
    By checkpaymenttitle = By.className("navigation_page");
    By iconfirmmyorder = By.xpath("//*[@id=\"cart_navigation\"]/button");
    By orderconfirmation = By.className("navigation_page");


    public String yourShoppingCartIsShown() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(yourshoppingcart)).getText();
    }


    public String twoProductsInCartIsShown() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(twoproductsincart)).getText();
    }

    public void clickTrash() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(trash)).click();
    }

    public String oneProductInCartIsShown() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(oneproductincart)).getText();
    }

    public void clickPlusBotton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(plusbutton)).click();
    }

    public void clickProceedToCheckOut() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceedtocheckoutbutton)).click();
    }

    public String titleAddressesIsShown() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(addressesstitle)).getText();
    }

    public void clickProceedToCheckOutSecondTime() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceedtocheckoutbuttonsecondtime)).click();
    }

    public String titleShippingIsShown() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(shippingtitle)).getText();
    }

    public void clickProceedToCheckOutThirdTime() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceedtocheckoutbuttonthirdtime)).click();
    }

    public String agreeToTheTermsOfService() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(errormessageshown)).getText();
    }

    public void clickCloseButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(closebutton)).click();
    }

    public void clickAgreeTerms() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(iagreetheterms)).click();
    }

    public void clickProceedToCheckoutFourthTime() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceedtocheckoutbuttonfourthtime)).click();
    }

    public String yourPaymentMethodIsShown() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(yourpaymentmethodtitle)).getText();
    }

    public void clickPayByCheckButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(paybycheckbutton)).click();
    }

    public String checkPaymentTitleIsShown() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(checkpaymenttitle)).getText();
    }

    public void clickIConfirmMyOrder() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(iconfirmmyorder)).click();
    }

    public String thankYOuMessageIsShown() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(orderconfirmation)).getText();
    }
}