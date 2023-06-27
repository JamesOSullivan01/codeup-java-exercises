package shapes;

public class ShapesTest {




    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(4,5);
        System.out.println("Area of box1: " + box1.getArea());
        System.out.println("Perimeter of box1: " + box1.getPerimeter());

        Rectangle box2 = new Square(5);
        System.out.println("Area of square1: " + box2.getArea());
        System.out.println("Perimeter of square1: " + box2.getPerimeter());


    }
}
