
import java.util.Random;
import java.util.Scanner;

public class task1_codecasa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between " + lowerBound + " and " + upperBound + ". Try to guess it.");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess == randomNumber) {
                hasGuessedCorrectly = true;
            } else if (userGuess < randomNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }

        System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries.");
        scanner.close();
    }
}