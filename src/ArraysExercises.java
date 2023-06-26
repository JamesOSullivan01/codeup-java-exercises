import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson (Person[] person, Person newPerson) {
        Person[] newPersonArray = Arrays.copyOf(person, person.length + 1);
        newPersonArray[person.length] = newPerson;
        return newPersonArray;
    }

    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/how-to-create-array-of-objects-in-java/

        int[] numbers = {1, 2, 3, 4, 5};
        // Shows spot in memory
        System.out.println(numbers);
        //shows actual content
        System.out.println(Arrays.toString(numbers));


        // Declaring an array of persons
        Person [] persons;
        // allocating memory for three persons
        persons = new Person[3];
        // initialing three persons
        persons[0] = new Person("Tim");
        persons[1] = new Person("Bill");
        persons[2] = new Person("Bob");
        Person newPerson = new Person("Phil");

        persons = addPerson(persons, newPerson);

        // Using enhanced for loop to iterate through persons array.
        for (Person person : persons) {
            // accessing the current person object and calling the 'getname()' method from my person class and returning ir as a string.
            System.out.println(person.getName());
        }
        System.out.println(Arrays.toString(persons));


    }
}
