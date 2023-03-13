package areaOfFigures;

public class Square implements Area {
    private double side;

    public Square(double sdie) {
        this.side = sdie;
    }

    @Override
    public double getAreaOfFigure() {
        return side * side;
    }
}
