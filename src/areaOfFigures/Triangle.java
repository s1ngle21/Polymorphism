package areaOfFigures;

public class Triangle implements Area {
    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    public double getAreaOfFigure() {
        return 0.5 * side * height;
    }
}
