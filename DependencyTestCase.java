import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestCase {


    @Test(priority = 1)
    void Login(){
        System.out.println("User able to login");
        Assert.fail();
    }
    @Test(dependsOnMethods = "Login")
    void FindProduct(){
        System.out.println("User able to find product");
    }

    //@Test(dependsOnMethods = "FindProduct")
    @Test(dependsOnMethods = {"FindProduct"},alwaysRun = true) // "alwaysRun element will always run no matter what happens in the code"
    void AddProduct(){
        System.out.println("User able to add product");
    }
    @Test(dependsOnMethods = "AddProduct")
    void BuyProduct(){
        System.out.println("User able to buy product");

    }


}

