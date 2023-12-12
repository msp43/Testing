public class TypeCastingExample {
    public static void main(String[] args) {
        // Implicit Typecasting (Widening)
        int intValue = 10;
        long longValue = intValue; // Automatically converted from int to long

        System.out.println("Implicit Typecasting:");
        System.out.println("intValue: " + intValue);
        System.out.println("longValue: " + longValue);
        System.out.println();

        // Explicit Typecasting (Narrowing)
        double doubleValue = 10.5;
        int intValueFromDouble = (int) doubleValue; // Explicitly converted from double to int

        System.out.println("Explicit Typecasting:");
        System.out.println("doubleValue: " + doubleValue);
        System.out.println("intValueFromDouble: " + intValueFromDouble);
    }
}
