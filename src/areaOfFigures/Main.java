package areaOfFigures;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10.5, 6.5);
        Square square = new Square(3.56);
        Circle circle = new Circle(4.78);

        Area[] areas = {triangle, square, circle};
        double totalArea = getTotalArea(areas);

        System.out.printf("Total area is: %.2f", totalArea);
    }

    public static double getTotalArea(Area[] areas) {
        double totalArea = 0.0;

        for (Area area : areas) {
            totalArea = totalArea + area.getAreaOfFigure();
        }
        return totalArea;
    }
}
