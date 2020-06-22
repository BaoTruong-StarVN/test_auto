import org.testng.annotations.Test;

// TestSuite --> Test Cases --> Test Steps
// Package --> Classes --> Methods
public class FirstTestCase {
    @Test
    void setup(){
        System.out.println("This is setup test");
    }

    @Test
    void login(){
        System.out.println("This is login test");
    }

    @Test
    void tearDown(){
        System.out.println("Closing browser");
    }
}
