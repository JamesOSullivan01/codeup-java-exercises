package shapes;

public class Square extends Rectangle {
    public Square(int width) {
        super(width, width);
    }

    public int getPerimeter() {
        return 4 * length; // Perimeter = 4 x side
    }

    public int getArea() {
        return length * length; // Area = side^2
    }

}
