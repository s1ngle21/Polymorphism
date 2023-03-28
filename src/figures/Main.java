package figures;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10.5, 6.5);
        Square square = new Square(3.56);
        Circle circle = new Circle(4.78);

        Shape[] shapes = {triangle, square, circle};
        double totalArea = Shape.getTotalArea(shapes);

        System.out.printf("Total area is: %.2f", totalArea);
    }
}
