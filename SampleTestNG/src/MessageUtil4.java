// Example for TestNG - Dependency lesson
// Using dependsOnGroups

public class MessageUtil4 {
    private String message;

    // Constructor
    // @param message to be printed
    public MessageUtil4(String message){
        this.message = message;
    }

    // print the message
    public String printMessage(){
        System.out.println(message);
        return message;
    }

    // add "Hi!" to the message
    public String salutationMessage(){
        message = "Hi!" + message;
        System.out.println(message);
        return message;
    }
}
