package figures;

public class Square implements Shape {
    private double side;

    public Square(double sdie) {
        this.side = sdie;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
