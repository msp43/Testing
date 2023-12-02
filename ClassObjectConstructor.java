// Define the Dog class
class Dog {
    // Attributes or fields
    private String name;
    private int age;

    // Constructor
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to print a message
    public void bark() {
        System.out.println(name + " says Woof!");
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Main class to demonstrate the program
public class ClassObjectConstructor {
    public static void main(String[] args) {
        // Creating an instance of the Dog class using the constructor
        Dog myDog = new Dog("Buddy", 3);

        // Accessing the attributes of the object
        System.out.println("My dog's name is " + myDog.getName() + ".");
        System.out.println("My dog is " + myDog.getAge() + " years old.");

        // Calling a method of the object
        myDog.bark();
    }
}
