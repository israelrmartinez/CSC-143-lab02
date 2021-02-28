package shapes;

public class Rectangle implements Shape {
    private double height;
    private double width;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return height * width;
    }

    public boolean equals(Object obj) {
        return false;
    }

    public double height() {
        return height;
    }

    public double perimeter() {
        return height * 2 + width * 2;
    }

    public double width() {
        return width;
    }

    public String toString() {
        return "";
    }
}