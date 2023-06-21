public class StudentTest {

    public static void main(String[] args) {
        Student bob = new Student("Bob Smith", 82.4);

        System.out.println("bob.name = " + bob.name);

        // grade is private visibulity, can't access

//        System.out.println("bob.grade = " + bob.grade);

        System.out.println("bob.getInfo() = " + bob.getInfo());

    }
}
