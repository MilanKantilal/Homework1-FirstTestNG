import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParametersInTestNG {

    WebDriver driver;

    @BeforeMethod
    void OpenBrowser(){
        System.setProperty("webdriver.chrome.driver","C:/Software/Driver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
    }

    @Test
    void WebLogo(){
        WebElement Logo = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
        //  Assert.assertFalse(Logo.isDisplayed(),"Logo is not displayed on the page"); // to check its' working or no
        Assert.assertTrue(Logo.isDisplayed(),"Logo is not displayed on the page");
    }

    @Test
    void HomePageTitle(){
        String Title = driver.getTitle();
        Assert.assertEquals("nopCommerce demo store",Title,"Page title not matched");
    }

    @AfterMethod
    void CloseBrowser() throws InterruptedException {
        Thread.sleep(8000);
        driver.quit();
    }

}
