import org.testng.annotations.Test;

public class SecondTestNG_Testcase {

    @Test(priority = 1)
    void OpenBrowser(){
        System.out.println("Open able to open browser");
    }

    @Test(priority = 2)
    void RegisterUser(){
        System.out.println("User able to register");
    }

    @Test(priority = 3 )
    void CloseBrowser(){
        System.out.println("User to able to close browser");
    }
}
