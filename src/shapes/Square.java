package shapes;

public class Square extends Rectangle {
    public Square(int width) {
        super(width, width);
    }

    //Overridden methods using same name and parameters
    public int getPerimeter() {
        return 4 * length;
    }

    public int getArea() {
        return length * length;
    }

}
