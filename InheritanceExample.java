// Base class or superclass for single and multilevel inheritance
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Derived class for single and multilevel inheritance
class Mammal extends Animal {
    void breathe() {
        System.out.println("Mammal is breathing");
    }
}

// Final derived class for multilevel inheritance
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Interface 1 for multiple inheritance
interface Runner {
    void run();
}

// Interface 2 for multiple inheritance
interface Swimmer {
    void swim();
}

// Class implementing multiple interfaces
class Athlete implements Runner, Swimmer {
    public void run() {
        System.out.println("Athlete is running");
    }

    public void swim() {
        System.out.println("Athlete is swimming");
    }
}

// Main class to demonstrate all types of inheritance
public class InheritanceExample {
    public static void main(String[] args) {
        // Single Inheritance
        Dog myDog = new Dog();
        myDog.eat(); // Inherited method from Animal class
        myDog.breathe(); // Inherited method from Mammal class
        myDog.bark(); // Method from Dog class

        System.out.println();

        // Multiple Inheritance through Interfaces
        Athlete myAthlete = new Athlete();
        myAthlete.run(); // Method from Runner interface
        myAthlete.swim(); // Method from Swimmer interface
    }
}
