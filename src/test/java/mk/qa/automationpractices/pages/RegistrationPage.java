package mk.qa.automationpractices.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;


public class RegistrationPage {

    WebDriver driver;
    WebDriverWait wait;

    public RegistrationPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    By authentication = By.xpath("//*[@id=\"columns\"]/div[1]/span[2]");
    By email =By.id("email_create");
    By createanaccountbutton = By.id("SubmitCreate");
    By mrfield = By.id("uniform-id_gender1");
    By name =By.id("customer_firstname");
    By lastname = By.id("customer_lastname");
    By password = By.id("passwd");
    By daysfield = By.id("uniform-days");
    By monthsfield = By.id("uniform-months");
    By yearsfield = By.id("uniform-years");
    By recivespecialoffersbutton = By.id("uniform-optin");
    By addressname = By.id("firstname");
    By addresslastname = By.id("lastname");
    By address = By.id("address1");
    By cityaddress =By.id("city");
    By stateaddress =By.id("uniform-id_state");
    By zipcode = By.id("postcode");
    By mobilephone = By.id("phone_mobile");
    By registerbutton = By.id("submitAccount");
    By myaccount = By.id("my-account");
    By dressesbutton =By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]");





    protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }


    public String titleIsShown() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(authentication)).getText();
    }

    public void enterMail() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(email)).click();
        String email2 = getSaltString() + "@gmail.com";
        wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys(email2);
    }

    public void clickCreateAnAccountBotton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(createanaccountbutton)).click();
    }

    public void clickMrField() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(mrfield)).click();
    }

    public void enterName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(name)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(name)).sendKeys("Trajche");
    }

    public void enterLastName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastname)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastname)).sendKeys("Stojanov");
    }
    public void enterPassword() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(password)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys("Engl1sh!");
    }
    public void selectDay(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(daysfield)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"days\"]/option[23]"))).click();}

    public void selectMonth(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(mrfield)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"months\"]/option[8]"))).click();}

    public void selectYear(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(mrfield)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"years\"]/option[32]"))).click();}

    public void clickReceiveSpecialOffers() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(recivespecialoffersbutton)).click();
    }

    public void addressFirstName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addressname)).click();}
        //wait.until(ExpectedConditions.visibilityOfElementLocated(addressname)).sendKeys("Trajche");}

    public void addressLastFirstName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addresslastname)).click();}
    //wait.until(ExpectedConditions.visibilityOfElementLocated(addresslastname)).sendKeys("Stojanov");}


    public void enterAddress() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(address)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(address)).sendKeys("St.Skopska 99");}

    public void enterCity() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(cityaddress)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(cityaddress)).sendKeys("Skopje");
    }
    public void selectState(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(stateaddress)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"id_state\"]/option[34]"))).click();}

    public void enterZipCode() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(zipcode)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(zipcode)).sendKeys("11954");
    }
    public void enterPhoneNumber() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(mobilephone)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(mobilephone)).sendKeys("+38977123456");
    }
    public void clickRegisterButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerbutton)).click();
    }

  // public String myAccountShown() {
       //return wait.until(ExpectedConditions.visibilityOfElementLocated(authentication)).getText();
    //}

    public String myAccountIsShown() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(myaccount)).getText();
    }
    public void clickDresses() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(dressesbutton)).click();
    }

}
