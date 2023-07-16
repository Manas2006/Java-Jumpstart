package test;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
    	
    	
			   	
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Guess the Number!");

        int secretNumber = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        boolean hasGuessed = false;

        while (!hasGuessed) {
            System.out.print("Enter your guess (between 1 and 100): ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                hasGuessed = true;
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        scanner.close();
    	
    	
    	
    	
    	
    	
    }
}
