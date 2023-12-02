class MyClass {
    // Public member
    public String publicVar = "I'm public!";

    // Private member
    private String privateVar = "I'm private!";

    // Protected member
    protected String protectedVar = "I'm protected!";

    // Default (package-private) member
    String defaultVar = "I'm default!";
}

// Main class to demonstrate access modifiers
public class AccessModifiersExample {
    public static void main(String[] args) {
        // Create an instance of MyClass
        MyClass myObject = new MyClass();

        // Access public member
        System.out.println("Public Access: " + myObject.publicVar);

        // Access default (package-private) member
        System.out.println("Default Access: " + myObject.defaultVar);

        // Access protected member
        System.out.println("Protected Access: " + myObject.protectedVar);

        
    }
}
