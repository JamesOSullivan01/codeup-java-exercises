public class Person {


//    public Person(String john) {
//    }

    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Bill");

        person.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());



    }

//            System.out.println("name = " + name);

//            Person rick = new Person();
//
//            rick.firstName = "Rick";
//
//            rick.lastName = "Sanchez";
//
//            System.out.println(rick.sayHello());
//            // prints "Hello from Rick Sanchez!"
//
//            Person ada = new Person();
//            ada.firstName = "Ada";
//            ada.lastName = "Lovelace";
//
//            Person grace = new Person();
//            grace.firstName = "Grace";
//            grace.lastName = "Hopper";
//
//            System.out.println(ada.sayHello());   // "Hello from Ada Lovelace!"
//            System.out.println(grace.sayHello()); // "Hello from Grace Hopper!"



//    private static String name;
//        public String firstName;
//        public String lastName;
//
//    public static long worldPopulation = 7_500_000_000L; // class property
//
//    public Person() {
//        System.out.println("A Person is being created!");
//    }
//
//
//    public String sayHello() {
//            return String.format("Hello from %s %s!", firstName, lastName);
//        }


    /*    Create Person class inside of src that has a private name field that is a string, and the following methods:*/


    private String name;


    public String getName() {
////TODO: return the person's name
        return name;
    }

    public void setName(String name) {
////TODO: change the name field to the passed value
        this.name = name;
        System.out.println("name = " + name);
    }

    public void sayHello() {
////TODO: print a message to the console using the person's name
        System.out.println("Hello " + name);
    }



}











