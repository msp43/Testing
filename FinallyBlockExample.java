import java.util.Scanner;

public class FinallyBlockExample {

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
            // The code in the finally block will always be executed.
            System.out.println("Finally block executed.");

            // It is a good practice to close resources in the finally block.
            scanner.close();
        }
    }
}
