import java.util.Scanner;

public class HighLow {
    public static Scanner scanner = new Scanner(System.in);

    public static void guessingGame() {
        int randomNumber = (int) (Math.random() * 100 + 1);

        System.out.println("Please pick a number between 1 and 100.");

        boolean guessedCorrectly = false;

        do {
            int userInput = scanner.nextInt();

            if (userInput < randomNumber) {
                System.out.println("Your number is too low, guess again.");
            } else if (userInput > randomNumber) {
                System.out.println("Your number is too high, guess again.");
            } else {
                System.out.println("Congratulations, you won!");
                guessedCorrectly = true;
            }

        } while (!guessedCorrectly);
    }
    public static void main(String[] args) {
        guessingGame();
    }
}
