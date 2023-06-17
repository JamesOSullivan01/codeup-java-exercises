import java.util.Scanner;

public class HighLow {
    public static Scanner scanner = new Scanner(System.in);

    public static void guessingGame() {
        int randomNumber = (int) (Math.random() * 100 + 1);
        System.out.println("Pick your difficulty (Hard/Medium/Easy)");
        String userDiff = scanner.nextLine().toLowerCase();

        if (userDiff.equalsIgnoreCase("easy")) {

            System.out.println("Please pick a number between 1 and 100.");

            boolean guessedCorrectly = false;
            int count = 16;
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
                if (count == 0) {
                    System.out.println("You lost!");
                    guessedCorrectly = true;
                }
            } while (!guessedCorrectly);

        } else if (userDiff.equalsIgnoreCase("medium")) {

            System.out.println("Please pick a number between 1 and 100.");

            boolean guessedCorrectly = false;
            int countMed = 12;
            int numOfGuessesMed = 0;

            do {
                int userInput = scanner.nextInt();

                if (userInput < randomNumber) {
                    System.out.println("Your number is too low, guess again.");
                    countMed--;
                    numOfGuessesMed++;
                } else if (userInput > randomNumber) {
                    System.out.println("Your number is too high, guess again.");
                    countMed--;
                    numOfGuessesMed++;
                } else {
                    System.out.println("Congratulations, you won!");
                    System.out.println("It took you " + numOfGuessesMed + " guesses to win");
                    guessedCorrectly = true;
                }
                System.out.println("You have " + countMed + " guesses remaining");

                if (countMed == 0) {
                    System.out.println("You lost!");
                    guessedCorrectly = true;
                }

            } while (!guessedCorrectly);

        } else if (userDiff.equalsIgnoreCase("hard")) {
            System.out.println("Please pick a number between 1 and 100.");

            boolean guessedCorrectly = false;
            int countHard = 7;
            int numOfGuessesHard = 0;

            do {
                int userInput = scanner.nextInt();

                if (userInput < randomNumber) {
                    System.out.println("Your number is too low, guess again.");
                    countHard--;
                    numOfGuessesHard++;
                } else if (userInput > randomNumber) {
                    System.out.println("Your number is too high, guess again.");
                    countHard--;
                    numOfGuessesHard++;
                } else {
                    System.out.println("Congratulations, you won!");
                    System.out.println("It took you " + numOfGuessesHard + " guesses to win");
                    guessedCorrectly = true;
                }

                System.out.println("You have " + countHard + " guesses remaining");

                if (countHard == 0) {
                    System.out.println("You lost!");
                    guessedCorrectly = true;
                }

            } while (!guessedCorrectly);
        }
    }
        public static void main (String[]args){
            guessingGame();
        }
    }


