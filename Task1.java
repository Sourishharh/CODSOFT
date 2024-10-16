// NUMBER GAME(Task-1)

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attemptsLimit = 5; 
        int score = 0;
        
        System.out.println("Welcome to Guess the Number game!");
        System.out.println("I have selected a number between " + minRange + " and " + maxRange + ". Try to guess it!");
        
        boolean playAgain = true;
        while (playAgain) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("New round! Guess the number.");
            int attempts = 0;
            while (attempts < attemptsLimit) {
                System.out.print("Attempt " + (attempts + 1) + "/" + attemptsLimit + ": Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;
                
                if (guess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (guess < targetNumber) {
                    System.out.println("Too low! Try a higher number.");
                } else {
                    System.out.println("Too high! Try a lower number.");
                }
                
                if (attempts == attemptsLimit) {
                    System.out.println("Sorry, you've run out of attempts. The correct number was " + targetNumber + ".");
                }
            }
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainChoice = scanner.next();
            if (!playAgainChoice.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }
        
        System.out.println("Game over! Your total score is: " + score);
        scanner.close();
    }
}

