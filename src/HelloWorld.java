public class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello, World!");

            int theAnswer = 42;
            String question = "What is your favorite color?";

            int myFavoriteNumber = 25;
            System.out.println("myFavoriteNumber = " + myFavoriteNumber);

// Change your code to assign a character value to myString. What do you notice?
            //If I changed out String to char I got an error
            String myString = "This is a simple string.";
            System.out.println("myString = " + myString);

            // Change your code to assign the value 3.14159 to myString. What happens?
            // If I do this it throws an error.

//            String myString = 3.14159;
//            System.out.println("myString = " + myString);

            //Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?

            // I get an error saying that myNumber has not been initialized
//            long myNumber;
//            System.out.println("myNumber = " + myNumber);


            // Change your code to assign the value 3.14 to myNumber. What do you notice?
// I get an error saying incompatible types
//            long myNumber = 3.14;
//            System.out.println("myNumber = " + myNumber);

//            Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
            // It ran without error but it did not print the "L" at the end
//            long myNumber = 123L;
//            System.out.println("myNumber = " + myNumber);

// Change your code to assign the value 123 to myNumber.
// It ran as intended
//            long myNumber = 123;
//            System.out.println("myNumber = " + myNumber);
//Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
      // Because 3.14 has a floating decimal point.

//Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?

            // get an incompatible types error
            // In Java, by default, decimal numbers without a suffix are treated as double values, which have a larger range and precision compared to float values.
            // So I need to change to float or assign a suffix of 'f' to the end of 3.14 when using float

            double myNumber = 3.14;
            System.out.println("myNumber = " + myNumber);

            // Copy and paste the following code blocks one at a time and execute them

//            int x = 5;
//            System.out.println(x++);
//            System.out.println(x);

//            int x = 5;
//            System.out.println(++x);
//            System.out.println(x);

//            What is the difference between the above code blocks? Explain why the code outputs what it does.
//            x is incremented afterward in the first one so that the first print out is still 5. in the second code block it increments first so that 6 is printed on the first printIN

//            int x = 5;
//            System.out.println(++x);
//            System.out.println(x);

//         Try to create a variable named class. What happens?
            // Not a statement error
//            int class;

//            Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?

//            String theNumberThree = "three";
//            Object o = theNumberThree;
//            int three = (int) o;
            // java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
            //	at HelloWorld.main(HelloWorld.java:80)



//            int three = (int) "three";
            // java: incompatible types: java.lang.String cannot be converted to int

//            Rewrite the following expressions using the relevant shorthand assignment operators:

            int x = 4;
            // x = x + 5
            x += 5;
            System.out.println("x = " + x);

//            int x = 3;
//            int y = 4;
//            y = y * x;
//            y *= x;
//            System.out.println("y = " + y);

//            int x = 10;
//            int y = 2;
//            x /= y;
//            y -= x;
//            System.out.println("x = " + x);
//            System.out.println("y = " + y);

//            What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
//
//            Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.

            int myInt = Integer.MAX_VALUE;
            System.out.println("myInt = " + myInt);
            myInt = myInt + 1;
            System.out.println(myInt);







        }


}
