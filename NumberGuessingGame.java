import java.util.Scanner;

public class NumberGuessingGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int lowerBound = 1;
        int upperBound = 100;
        int guess;
        String feedback;

        System.out.println("Think of a number between 1 and 100, and I will try to guess it!");

        while (lowerBound <= upperBound) {
            guess = lowerBound + (upperBound - lowerBound) / 2; 
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct'):");

            feedback = sc.nextLine().toLowerCase();

            if (feedback.equals("high")) {
                lowerBound = guess + 1; 
            } else if (feedback.equals("low")) {
                upperBound = guess - 1;
            } else if (feedback.equals("correct")) {
                System.out.println("Great! I guessed your number: " + guess);
                break;
            } else {
                System.out.println("Invalid input! Please enter 'higher', 'lower', or 'correct'.");
            }
        }
    }
}