package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Yes or No?");
        String input = this.scanner.nextLine();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            return true;
        }
        return false;
    }

    public int getInt(int min, int max) {
         int num;
        do {
            System.out.println("Enter a number between " + min + " and " + max);
            num = scanner.nextInt();
        } while (num < min || num > max);
        return num;
    }

    public int getInt() {
        System.out.println("Please enter an integer");
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double num;
        do {
            System.out.println("Enter a number between " + min + " and " + max);
            num = scanner.nextDouble();
        } while (num < min || num > max);
        return num;
    }

    public double getDouble() {
        return this.scanner.nextDouble();
    }


    public static void main(String[] args) {
        Input newInput = new Input();
        System.out.println(newInput.getInt(1, 100));

        System.out.println(newInput.getDouble(1, 100));
        System.out.println(newInput.getDouble());


    }
}


