package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Student anne01 = new Student("Anne");
        anne01.addGrade(99);
        anne01.addGrade(100);
        anne01.addGrade(93);
        System.out.println(anne01.getGradeAverage());

        Student janeBear = new Student("Jane");
        janeBear.addGrade(80);
        janeBear.addGrade(84);
        janeBear.addGrade(87);


        Student billCoder = new Student("Bill");
        billCoder.addGrade(60);
        billCoder.addGrade(65);
        billCoder.addGrade(66);


        Student jimHalpert85 = new Student("Jim");
        jimHalpert85.addGrade(96);
        jimHalpert85.addGrade(96);
        jimHalpert85.addGrade(90);


        HashMap<String, Student> students = new HashMap<>();
        students.put("Anne", anne01);
        students.put("Jane", janeBear);
        students.put("Bill", billCoder);
        students.put("Jim", jimHalpert85);

        studentApp(students);
    }

    public static void studentApp(HashMap<String, Student> students) {
        System.out.println("\nWelcome\n\nHere are Our Student's names. Please enter one to find their GitHub name and grade average:\n");

        StringBuilder usernames = new StringBuilder();

        for (String key : students.keySet()) {
            Student student = students.get(key);
            usernames.append("|").append(student.getName()).append("| ");
        }

        System.out.println(usernames);

        userInterface(students);
    }

    public static void userInterface(HashMap<String, Student> students) {
        boolean validName = false;
        while (!validName) {
            System.out.println("What student would you like to see more information on?");
            Scanner userInput = new Scanner(System.in);
            String username = userInput.nextLine();

            if (students.containsKey(username)) {
                Student student = students.get(username);
                System.out.println("GitHub Name: " + username);
                System.out.println("Average Grade: " + student.getGradeAverage());
                System.out.println("Would you like to see another student? (yes/no)");
                Scanner userInput2 = new Scanner(System.in);
                String yesNo = userInput2.nextLine();
                if (yesNo.equalsIgnoreCase("no")) {
                    System.exit(0);
                }
            } else {
                System.out.println("Sorry, no student found with the GitHub username: " + username);
                System.out.println("Would you like to see another student? (yes/no)");
                Scanner userInput3 = new Scanner(System.in);
                String yesNo = userInput3.nextLine();
                if (yesNo.equalsIgnoreCase("no")) {
                    System.exit(0);
                }

            }
        }
    }
}
