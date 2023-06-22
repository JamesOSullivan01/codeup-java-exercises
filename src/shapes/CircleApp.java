package shapes;
//Imports the util package with the input class
import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();


        System.out.println("What is the radius of your circle?");
        double userInput = input.getDouble();

        Circle circle = new Circle(userInput);
        System.out.printf("Circle Area: %.4f, Circle circumference %.4f", circle.getArea(), circle.getCircumference());


    }


}
////