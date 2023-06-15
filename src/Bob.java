import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner thisScanner = new Scanner(System.in);

        String choice = "";
        do {
            System.out.println("Please ask a question or make a statement and prepare for a thoughtful and insightful reply!");
            String userInput = thisScanner.nextLine();

            if (userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.trim().isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else System.out.println("Whatever");

            System.out.println("Would you like to ask another question? (yes/no)");
            choice = thisScanner.next();
            thisScanner.nextLine();
        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Exiting Program");

    }
}
