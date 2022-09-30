import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Homework {

    WebDriver driver;
    @Test(priority = 1)
    void OpenBrowser() throws InterruptedException {
        System.out.println("Open Browser");
        System.setProperty("webdriver.chrome.driver", "C:/Software/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click(); // clicked on compute.
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[1]/ul/li[1]/a")).click(); //clicked on desktop
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/h2/a")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-3\"]")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("shopping cart")).click(); // this will click on shopping cart link.
        Actions actions=new Actions(driver);
        actions.click();

        driver.findElement(By.className("qty-input")).clear();// to clear the previous quantity.
        driver.findElement(By.className("qty-input")).sendKeys("3"); // typed 3 quantity.
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"updatecart\"]")).click(); // update button to update the quantity.

        driver.findElement(By.id("termsofservice")).click();// to tick the box.

        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click(); //to click on checkout button.

        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();


        // To register as guest user.
        driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Milan");
        driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Kantilal");
        driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("milan123@gmail.com");

        driver.findElement(By.id("BillingNewAddress_CountryId")).sendKeys("United Kingdom"); // to select country.
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Manchester");
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("1 Portland Street");
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("M1 3BE");
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("0161 123 4567");


        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]")).click();

        driver.findElement(By.id("shippingoption_1")).click();
        actions.click();











    }



//    @Test(priority = )
//    void CloseBrowser() throws InterruptedException {
//        System.out.println("Close Browser");
//        Thread.sleep(8000);
//        driver.quit();
//    }
}