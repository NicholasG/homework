import shape.Circle;
import shape.Shape;
import shape.Triangle;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(2.5);
        Shape triangle = new Triangle(1, 2, 3);

        double perimeterOfCircle = circle.perimeter();
        double squareOfCircle = circle.square();

        double perimeterOfTriangle = triangle.perimeter();
        double squareOfTriangle = triangle.square();

        System.out.println("perimeterOfCircle = " + perimeterOfCircle);
        System.out.println("squareOfCircle = " + squareOfCircle);
        System.out.println("perimeterOfTriangle = " + perimeterOfTriangle);
        System.out.println("squareOfTriangle = " + squareOfTriangle);
    }
}
