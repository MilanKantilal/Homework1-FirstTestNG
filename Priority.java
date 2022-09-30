import org.testng.annotations.Test;

public class Priority {
    @Test(priority = 1)
    void TestOne(){
        System.out.println("Test One");
    }
    @Test(priority = 2,enabled = true)
    void TestTwo(){
        System.out.println("Test Two");
    }
    @Test(priority = 3)
    void TestThree(){
        System.out.println("Test Three");
    }
}
