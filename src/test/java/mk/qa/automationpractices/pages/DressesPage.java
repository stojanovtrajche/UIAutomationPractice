package mk.qa.automationpractices.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DressesPage {
    WebDriver driver;
    WebDriverWait wait;

    public DressesPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    By eveningdresses = By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[2]");
    By quickview = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img");
    By closebutton = By.xpath("//*[@id=\"category\"]/div[2]/div/div/a");
    By mainlogo = By.xpath("//*[@id=\"header_logo\"]/a/img");
    By dressescategory = By.xpath("//*[@id=\"columns\"]/div[1]/a[3]");
    By list = By.xpath("//*[@id=\"list\"]/a/i");
    By addtocard = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div/div[3]/div/div[2]/a[1]");
    By continueshoppingbutton = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span");
    By addtocartprinteddress = By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div/div[3]/div/div[2]/a[1]/span");

    public void clickEveningDresses() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(eveningdresses)).click();
    }

    public void clickQuickView() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(quickview)).click();
    }

    public void clickClose() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(closebutton)).click();
    }

    public void clickDressesCategory() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(dressescategory)).click();

    }

    public void clickList() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(list)).click();
    }


    public void clickAddToCard() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addtocard)).click();
    }

    public void clickContinueShopping() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueshoppingbutton)).click();
    }

    public void clickAddToCartPrintedDress() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addtocartprinteddress)).click();
    }

    public void clickContinueShoppingPrintedDress() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueshoppingbutton)).click();
    }

    public void clickmainLogo() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(mainlogo)).click();
    }

}
