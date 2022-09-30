import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestNG_TestCase {

    WebDriver driver;
    @Test(priority = 1)
    void OpenBrowser(){
        System.out.println("Open Browser");
        System.setProperty("webdriver.chrome.driver","C:/Software/Driver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

        }
    @Test(priority = 2)
    void LoginUser(){
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("milan1@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Milan@123");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
    }
    @Test(priority = 3)
    void CloseBrowser() throws InterruptedException {
        System.out.println("Close Browser");
        Thread.sleep(8000);
        driver.quit();
    }

}
