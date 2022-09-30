import org.testng.annotations.*;

public class AnnotationsTestCase2 {

    @BeforeSuite
    void beforeSuite(){
        System.out.println("Execute before Suite");
    }
    @AfterSuite
    void afterSuite() {
        System.out.println("Execute after Suite");
    }
    @BeforeClass
    void beforeClass(){
        System.out.println("Execute before class");
    }

    @AfterClass
    void afterClass(){
        System.out.println("Execute after class");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("Execute before method");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("Execute after method");
    }
    @Test
    void test3 (){
        System.out.println("Test case 3");
    }
    @Test
    void test4 () {
        System.out.println("Test case 4");
    }

}
