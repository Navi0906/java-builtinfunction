import java.util.Scanner;

public class FactorialRecursion{

    public static void main(String[] args) {
        int number = getInput(); 
        long factorial = calculateFactorial(number); 
        displayOutput(number, factorial); 
    }

    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        return scanner.nextInt();
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1; 
        }
        return n * calculateFactorial(n - 1); 
    }

    private static void displayOutput(int number, long factorial) {
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}