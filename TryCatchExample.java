import java.util.Scanner;

public class TryCatchExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            int result = 10 / number;

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero. Please enter a non-zero number.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // The finally block is optional and will be executed regardless of whether an exception occurred or not.
            System.out.println("Finally block executed.");
            scanner.close(); // Close the scanner in the finally block to ensure proper resource cleanup.
        }
    }
}
