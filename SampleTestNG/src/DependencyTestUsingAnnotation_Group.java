// Example for TestNG - Dependency lesson
// Using dependsOnGroups

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestUsingAnnotation_Group {
    String message = "Manisha";
    MessageUtil4 messageUtil4 = new MessageUtil4(message);

    @Test(groups = {"init"})
    public void testPrintMessage(){
        System.out.println("Inside testPrintMessage()");
        message = "Manisha";
        Assert.assertEquals(message,messageUtil4.printMessage());
    }

    @Test(dependsOnGroups = {"init.*"})
    public void testSalutationMessage(){
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Manisha";
        Assert.assertEquals(message,messageUtil4.salutationMessage());
    }

    @Test(groups = {"init"})
    public void initEnvironmentTest() {
        System.out.println("This is initEnvironmentTest");
    }
}
