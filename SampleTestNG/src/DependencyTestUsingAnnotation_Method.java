// Example for TestNG - Dependency lesson
// Using dependsOnMethods

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestUsingAnnotation_Method {
    String message = "Manisha";
    MessageUtil3 messageUtil3 = new MessageUtil3(message);

    @Test
    public void testPrintMessage(){
        System.out.println("Inside testPrintMessage()");
        message = "Manisha";
        Assert.assertEquals(message,messageUtil3.printMessage());
    }

    @Test(dependsOnMethods = {"initEnvironmentTest"})
    public void testSalutationMessage(){
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Manisha";
        Assert.assertEquals(message,messageUtil3.salutationMessage());
    }

    @Test
    public void initEnvironmentTest(){
        System.out.println("This is initEnvironmentTest");
    }
}
