package figures;

public interface Shape {

    double getArea();

    public static double getTotalArea(Shape[] shapes) {
        double totalArea = 0.0;

        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}
