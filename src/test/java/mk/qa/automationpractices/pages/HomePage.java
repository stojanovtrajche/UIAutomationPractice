package mk.qa.automationpractices.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;


    By singin = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
    By bestsellersbutton = By.xpath("//*[@id=\"home-page-tabs\"]/li[2]/a");
    By fadedshortsleevetshirt = By.xpath("//*[@id=\"blockbestsellers\"]/li[2]/div/div[1]");
    By bigpicture = By.xpath("//*[@id=\"bigpic\"]");
    By addtocart = By.xpath("//*[@id=\"add_to_cart\"]/button");
    By card = By.xpath("//*[contains(text(),'Cart')]");


    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }


    public void clickSingIn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(singin)).click();
    }

    public void clickCart() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(card)).click();
    }
}
