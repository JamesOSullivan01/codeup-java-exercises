import java.util.Scanner;

public class MethodsExercises {
    public static Scanner scanner = new Scanner(System.in);

    // Create four separate methods. Each will perform an arithmetic operation:
    public static int addThis (int n1, int n2) {
        int result;
        result = n1 + n2;
        return result;
    }

    public static int subtractThis (int n1, int n2) {
        int result;
        result = n1 - n2;
        return result;
    }

    public static int multiplyThis (int n1, int n2) {
        int result;
        result = n1 * n2;
        return result;
    }

    public static int divideThis (int n1, int n2) {
        int result;
        result = n1 / n2;
        return result;
    }

    public static int remainderOf (int n1, int n2) {
        int result;
        result = n1 % n2;
        return result;
    }

    // Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range. If not, prompt the user to input their number again until the input is within range.

    public static int getInteger(int min, int max) {
        int userInt;
        do {
            System.out.println("Please enter a number between 1 and 10.");
            userInt = scanner.nextInt();

            if (userInt <= 0 || userInt >= 11) {
                System.out.println("You entered an invalid number.");
            }
        } while (userInt <= 0 || userInt >= 11);

        return userInt;
    }




    public static void main(String[] args) {
        System.out.println("addThis(2,4) = " + addThis(2, 4));
        System.out.println("subtractThis(20,13) = " + subtractThis(20, 13));
        System.out.println("multiplyThis(3,4) = " + multiplyThis(3, 4));
        System.out.println("divideThis(12,3) = " + divideThis(12, 3));
        System.out.println("remainderOf(40,3) = " + remainderOf(40, 9));


        int userInput = getInteger(1, 10);

        System.out.println("You entered: " + userInput);
    }
}
