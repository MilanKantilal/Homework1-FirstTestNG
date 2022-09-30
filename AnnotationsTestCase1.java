import org.testng.annotations.*;

public class AnnotationsTestCase1 {

    @BeforeTest
    void beforeTests(){
        System.out.println("Execute before tests");

    }
    @AfterTest
    void afterTests(){
        System.out.println("Execute after tests");
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
    void test1 (){
        System.out.println("Test case 1");
    }
    @Test
    void test2 () {
        System.out.println("Test case 2");
    }

}
