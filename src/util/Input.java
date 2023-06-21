package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String input = scanner.nextLine();
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
        return getInt();
    }

    public double getDouble(double min, double max) {
        double num;
        do {
            System.out.println("Enter a number between " + min + " and " + max);
            num = scanner.nextDouble();
        } while (num < min || num > max);
        return num;
    }

    public static double getDouble() {
        return getDouble();
    }

    public class InputTest {
        public static void main(String[] args) {
            Input newInput = new Input();
            newInput.getInt(1, 100);
            newInput.getDouble(1,100);

        }
    }
}

