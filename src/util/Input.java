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
            String input = getString();
            try {
                num = Integer.valueOf(input);
            } catch (NumberFormatException e) {
                num = Integer.MIN_VALUE;
            }
        } while (num < min || num > max);
        return num;
    }

    public int getInt() {
        System.out.println("Please enter an integer");
        String input = getString();
        try {
            return Integer.valueOf(input);
        } catch (NumberFormatException e) {
            return Integer.MIN_VALUE;
        }
    }

    public double getDouble(double min, double max) {
        double num;
        do {
            System.out.println("Enter a number between " + min + " and " + max);
            String input = getString();
            try {
                num = Double.valueOf(input);
            } catch (NumberFormatException e) {
                num = Double.NaN;
            }
        } while (num < min || num > max);
        return num;
    }

    public double getDouble() {
        String input = getString();
        try {
            return Double.valueOf(input);
        } catch (NumberFormatException e) {
            return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Input newInput = new Input();
        System.out.println(newInput.getInt(1, 100));

        System.out.println(newInput.getDouble(1, 100));
        System.out.println(newInput.getDouble());

        newInput.close();
    }

    public void close() {
        scanner.close();
    }
}
