package shapes;

public class Rectangle {

    protected int length;
    protected int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getPerimeter() {
        System.out.println("Square method was used");
        return (2 * length) + (2 * width);
    }

    public int getArea() {
        System.out.println("Square method was used");
        return length * width;
    }
}

