import java.util.Scanner;

public class HighLow {
    public static Scanner scanner = new Scanner(System.in);

    public static void guessingGame() {
        int randomNumber = (int) (Math.random() * 100 + 1);

        System.out.println("Please pick a number between 1 and 100.");

        boolean guessedCorrectly = false;
        int count = 20;
        int numOfGuesses = 0;

        do {
            int userInput = scanner.nextInt();

            if (userInput < randomNumber) {
                System.out.println("Your number is too low, guess again.");
                count--;
                numOfGuesses++;
            } else if (userInput > randomNumber) {
                System.out.println("Your number is too high, guess again.");
                count--;
                numOfGuesses++;
            } else {
                System.out.println("Congratulations, you won!");
                System.out.println("It took you " + numOfGuesses + " guesses to win");
                guessedCorrectly = true;
            }
            System.out.println("You have " + count + " guesses remaining");
        } while (!guessedCorrectly);
    }
    public static void main(String[] args) {
        guessingGame();
    }
}

