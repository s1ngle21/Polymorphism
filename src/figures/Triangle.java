package figures;

public class Triangle implements Shape {
    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * side * height;
    }
}
