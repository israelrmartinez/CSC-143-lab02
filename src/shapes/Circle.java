package shapes;

public class Circle implements Shape {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public boolean equals(Object obj) {
        return false;
    }

    public double perimeter() {
        return Math.PI * 2 * radius;
    }

    public double radius() {
        return 0.0;
    }

    public String toString() {
        return "";
    }
}
