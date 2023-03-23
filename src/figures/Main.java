package figures;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10.5, 6.5);
        Square square = new Square(3.56);
        Circle circle = new Circle(4.78);

        Shape[] shapes = {triangle, square, circle};
        double totalArea = getTotalArea(shapes);

        System.out.printf("Total area is: %.2f", totalArea);
    }

    public static double getTotalArea(Shape[] shapes) {
        double totalArea = 0.0;

        for (Shape shape : shapes) {
            totalArea = totalArea + shape.getArea();
        }
        return totalArea;
    }
}
