import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.print.DocFlavor;
import java.util.concurrent.TimeUnit;

public class Homework1 {
    WebDriver driver;
    @Test(priority = 1)
    void OpenBrowser() throws InterruptedException {
        System.out.println("Open Browser");
        System.setProperty("webdriver.chrome.driver", "C:/Software/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(1000);
    }
    @Test(priority = 2)
    void ComputerTab() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
        Thread.sleep(1000);

        // page scrolling
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebDriverWait wait =new WebDriverWait(driver,20);
        js.executeScript("window.scrollBy(0,500)");

        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[1]/ul/li[1]/a")).click();
        js.executeScript("window.scrollBy(0,300)");// page scrolling down
        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/h2/a")).click();
        js.executeScript("window.scrollBy(0,300)");// page scrolling down
        Thread.sleep(1000);
    }
   @Test(priority = 3)
   void AddToCart() throws InterruptedException {
       driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-3\"]")).click();
       Thread.sleep(1000);
       WebDriverWait wait =new WebDriverWait(driver,20);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"bar-notification\"]/div/p/a")));
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"bar-notification\"]/div/p/a")));
       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p/a")).click();
       Thread.sleep(1000);

    }
    @Test(priority = 4)
    void Updateqty() throws InterruptedException {

        driver.findElement(By.className("qty-input")).clear();
        Thread.sleep(1000);
        driver.findElement(By.className("qty-input")).sendKeys("3");
        Thread.sleep(1000);
        driver.findElement(By.id("updatecart")).click();
        driver.findElement(By.xpath("//*[@id=\"termsofservice\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
    }
    @Test(priority = 5)
    void Checkout() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();
        driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Milan");
        driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Kantilal");
        driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("milan123@gmail.com");
        driver.findElement(By.id("BillingNewAddress_CountryId")).sendKeys("United Kingdom");
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Leicester");
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("1 Portland Street");
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("Le15 5EF");
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("1234 456 7890");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]")).click();
    }
    @Test(priority = 6)
    void Shippingmethod() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"opc-shipping_method\"]/div[1]")).click();//to clicked on continue button to go to shipping address page.

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement radio = driver.findElement(By.xpath("//*[@id=\"shippingoption_2\"]")); // to select radio button.
        radio.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button")).click(); // to clicked on continue button.
    }

    @Test(priority = 7)
    void Payment(){
        driver.findElement(By.id("paymentmethod_1")).click();
        driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"CreditCardType\"]")).sendKeys("Master card");
        //driver.findElement(By.className("CreditCardType")).sendKeys("Master card");
        driver.findElement(By.id("CardholderName")).sendKeys("Milan Kantilal");
        driver.findElement(By.id("CardNumber")).sendKeys("1234 5678 9010 1112");
        driver.findElement(By.id("ExpireMonth")).sendKeys("9");
        driver.findElement(By.id("ExpireYear")).sendKeys("2022");
        driver.findElement(By.id("CardCode")).sendKeys("1314");
        driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/button")).click();

    }
    @Test(priority = 8)
    void CloseBrowser() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Close Browser");
        driver.quit();
    }
}
