import org.testng.Assert;
import org.testng.annotations.Test;

public class ExpectedExceptionTest {
    String message = "Manisha";
    MessageUtil2 messageUtil2 = new MessageUtil2(message);

    @Test(expectedExceptions = ArithmeticException.class)
    public void testPrintMessage(){
        System.out.println("Inside testPrintMessage()");
        messageUtil2.printMessage();
    }

    @Test
    public void testSalutationMessage(){
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Manisha";
        Assert.assertEquals(message,messageUtil2.salutationMessage());
    }
}
