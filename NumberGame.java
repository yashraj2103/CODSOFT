import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    private int lowerBound;
    private int upperBound;
    private int targetNumber;
    private Scanner scanner;

    public NumberGame(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.targetNumber = generateRandomNumber();
        this.scanner = new Scanner(System.in);
    }

    private int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }

    public void startGame() {
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound + ".");
        System.out.println("Can you guess the number?");

        int guess = 0;
        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
            }
        }
    }

    public static void main(String[] args) {
        NumberGame game = new NumberGame(1, 40);
        game.startGame();
    }
}
