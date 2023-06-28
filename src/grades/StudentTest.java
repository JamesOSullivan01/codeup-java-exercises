package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Bob");
        Student bill = new Student("Bill");

        System.out.println(student.getName());
        System.out.println(student.grades);
        student.addGrade(90);
        student.addGrade(91);
        student.addGrade(93);
        System.out.println(student.grades);
        System.out.println(student.getGradeAverage());

        System.out.println(bill.getName());

    }
}
