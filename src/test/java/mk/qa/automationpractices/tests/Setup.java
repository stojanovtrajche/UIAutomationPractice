package mk.qa.automationpractices.tests;

import mk.qa.automationpractices.pages.ProceedToCheckoutPage;
import mk.qa.automationpractices.pages.DressesPage;
import mk.qa.automationpractices.pages.HomePage;
import mk.qa.automationpractices.pages.RegistrationPage;
import mk.qa.automationpractices.utilities.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Setup {

    public WebDriver driver;
    public String brs = "chrome";

    public WebDriverWait wait;
    public HomePage homePage;
    public RegistrationPage registrationPage;
    public DressesPage dressesPage;
    public ProceedToCheckoutPage proceedToCheckoutPage;
    public static final String URL = "http://automationpractice.com/index.php";
    Browser browser = new Browser();

    @BeforeMethod
    public void set_up() {
        driver = browser.open(this.brs);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 60);
        homePage = new HomePage(driver, wait);
        registrationPage = new RegistrationPage(driver, wait);
        dressesPage = new DressesPage(driver, wait);
        proceedToCheckoutPage = new ProceedToCheckoutPage(driver, wait);
        driver.get(URL);
    }

    @AfterMethod
    public void tear_down() {
        driver.quit();
    }


}