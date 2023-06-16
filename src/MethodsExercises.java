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

//    Calculate the factorial of a number.
//
//    Prompt the user to enter an integer from 1 to 10.
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.
//    A factorial is a number multiplied by each of the numbers before it.
//    Factorials are denoted by the exclamation point (n!).


    public static long factorial() {
        long factorial = 1;
        boolean continueFlag = true;

        do {
            System.out.println("Please enter a number between 1 and 10:");
            int userInt = scanner.nextInt();

            if (userInt >= 1 && userInt <= 10) {
                for (int i = 1; i <= userInt; i++) {
                    factorial *= i;
                }

                System.out.println("The factorial of " + userInt + " is: " + factorial);
            } else {
                System.out.println("Invalid number entered. Please try again.");
            }

            System.out.println("Do you want to continue? (yes/no)");
            String choice = scanner.next();

            if (!choice.equalsIgnoreCase("yes")) {
                continueFlag = false;
            }
        } while (continueFlag);

        return factorial;
    }

    //Create an application that simulates dice rolling.
    //
    //Ask the user to enter the number of sides for a pair of dice.
    //Prompt the user to roll the dice.
    //"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
    //Use static methods to implement the method(s) that generate the random numbers.
    //Use the .random method of the java.lang.Math class to generate random numbers.


    public static long diceRoll () {
        Boolean continueFlag = true;
        do {
            System.out.println("How many sides does your first die have?");
            int die1 = scanner.nextInt();
            System.out.println("How many sides does your second die have?");
            int die2 = scanner.nextInt();

            scanner.nextLine();

            int roll1=(int)(Math.random()*die1 +1);
            int roll2=(int)(Math.random()*die2 +1);
            int sum = roll1 + roll2;

            System.out.println("Roll dice: total = " + sum);

            System.out.println("Would you like to roll again? (yes/no)");
            String choice = scanner.nextLine();

            if(!choice.equalsIgnoreCase("yes")) {
                continueFlag = false;
            }

        } while (continueFlag);
        return diceRoll();
    }




    public static void main(String[] args) {
        System.out.println("addThis(2,4) = " + addThis(2, 4));
        System.out.println("subtractThis(20,13) = " + subtractThis(20, 13));
        System.out.println("multiplyThis(3,4) = " + multiplyThis(3, 4));
        System.out.println("divideThis(12,3) = " + divideThis(12, 3));
        System.out.println("remainderOf(40,3) = " + remainderOf(40, 9));


        int userInput = getInteger(1, 10);

        System.out.println("You entered: " + userInput);

        factorial();
        diceRoll();
    }
}
