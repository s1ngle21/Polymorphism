package areaOfFigures;

public class Circle implements Area {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getAreaOfFigure() {
        return Math.PI * radius * radius;
    }
}
