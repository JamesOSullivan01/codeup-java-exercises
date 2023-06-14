import java.util.Scanner;


public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.format("The value of pi is %s%n", pi);

/// Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String userInput = String.valueOf(s.nextInt());
        System.out.println("You Entered: " + userInput);

        // Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.

        //        What happens if you enter less than 3 words? ***It waits until the user enters a third word
//        What happens if you enter more than 3 words? ***It only stores the first three

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three words: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();

        System.out.println("You entered:");
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

        // Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.








            }
        }







