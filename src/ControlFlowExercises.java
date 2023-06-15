import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

        //Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        System.out.println();
        int j = 0;

        do {
            System.out.printf("%d%n", j);
            j += 2;
        } while (j <= 100);

        //Alter your loop to count backwards by 5's from 100 to -10.
        System.out.println();

        int k = 100;

        do {
            System.out.printf("%d%n", k);
            k -= 5;
        } while (k >= -10);

        System.out.println();

        //Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:

        long l = 2;

        do {
            System.out.printf("%d%n", l);
            l = l * l;
        } while (l <= 1000000);

//        Refactor the previous two exercises to use a for loop instead.

        System.out.println();

        for(int m = 100; m >= -10; m -= 5) {
            System.out.printf("%d%n", m);
        }
        System.out.println();

        for(long n = 2; n <=100000; n *= n) {
            System.out.printf("%d%n", n);
        }

        System.out.println();
// Fizzbuzz

        for (int o = 1; o <= 100; o++) {
            System.out.printf("%d%n", o);
            if(o % 3 == 0 && o % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (o % 3 == 0) {
                System.out.println("Fizz");
            } else if (o % 5 == 0) {
                System.out.println("Buzz");
            }
        }

        System.out.println();

        // Display a table of powers.
        //
        //Prompt the user to enter an integer.
        //Display a table of squares and cubes from 1 to the value entered.
        //Ask if the user wants to continue.
        //Assume that the user will enter valid data.
        //Only continue if the user agrees to.
        Scanner scanner = new Scanner(System.in);
        boolean continueFlag = true;
        while (continueFlag) {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.println("Number\tSquare\tCube");
            System.out.println("------\t------\t----");
            for (int i = 1; i <= number; i++) {
                int square = i * i;
                int cube = i * i * i;
                System.out.printf("%-6d\t%-6d\t%-6d%n", i, square, cube);
            }

            System.out.print("Do you want to continue? (yes/no): ");
            String choice = scanner.nextLine();
            continueFlag = choice.equalsIgnoreCase("yes");
        }

        // Convert given number grades into letter grades.
        //
        //Prompt the user for a numerical grade from 0 to 100.
        //Display the corresponding letter grade.
        //Prompt the user to continue.
        //Assume that the user will enter valid integers for the grades.
        //The application should only continue if the user agrees to.
        //Grade Ranges:
        //
        //A : 100 - 88
        //B : 87 - 80
        //C : 79 - 67
        //D : 66 - 60
        //F : 59 - 0

        String choice;
        do {
            System.out.println("please enter a numerical grade (0-100): ");
            int grade = scanner.nextInt();

            String letterGrade;
            if (grade >= 88 && grade <= 100) {
                letterGrade = "A";
            } else if (grade >= 80 && grade <= 87) {
                letterGrade = "B";
            } else if (grade >= 67 && grade <= 79) {
                letterGrade = "C";
            } else if (grade >= 60 && grade <= 66) {
                letterGrade = "D";
            } else {
                letterGrade = "F";
            }

            System.out.println("Letter grade: " + letterGrade);
            System.out.print("Do you want to continue? (yes/no): ");

            choice = scanner.next();


        } while (choice.equalsIgnoreCase("yes"));
        System.out.println("Exiting the program.");
    }
}
