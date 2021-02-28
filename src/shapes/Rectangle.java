package shapes;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return height * width;
    }

    public boolean equals(Object obj) {
        return false;
    }

    public double height() {
        return height;
    }

    @Override
    public double perimeter() {
        return 2 * (height + width);
    }

    public double width() {
        return width;
    }

    @Override
    public String toString() {
        return "";
    }
}