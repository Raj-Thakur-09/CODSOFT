import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int totalScore = 0;
        int round = 1;
        String playAgain;

        do {
            int randomNumber = rand.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 5;
            boolean guessedCorrectly = false;

            System.out.println("\nRound " + round);
            System.out.println("Guess the number between 1 and 100");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess == randomNumber) {
                    System.out.println("Correct! You guessed the number.");
                    totalScore += (maxAttempts - attempts + 1) * 10;
                    guessedCorrectly = true;
                    break;
                } else if (userGuess > randomNumber) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Out of attempts! The number was: " + randomNumber);
            }

            System.out.println("Current Score: " + totalScore);

            System.out.print("Do you want to play another round? (yes/no): ");
            playAgain = sc.next();

            round++;

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Game Over!");
        System.out.println("Final Score: " + totalScore);

        sc.close();
    }
}