import org.testng.annotations.Test;

public class GroupingTestCases {

    @Test(groups = {"Regression"})
    void testcase1(){
        System.out.println("test case 1");
    }

    @Test(groups = {"Sanity"})
    void testcase2(){
        System.out.println("test case 2");
    }

    @Test(groups = {"Smoke"})
    void testcase3(){
        System.out.println("test case 3");
    }

    @Test(groups = {"Regression", "Smoke"})
    void testcase4(){
        System.out.println("test case 4");
    }

    @Test(groups = {"Sanity","Smoke"})
    void testcase5(){
        System.out.println("test case 5");
    }
    @Test(groups = {"Regression"})
    void testcase6(){
        System.out.println("test case 6");
    }

}