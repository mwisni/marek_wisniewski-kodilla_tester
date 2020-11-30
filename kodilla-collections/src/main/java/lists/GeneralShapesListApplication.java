package lists;

import interfaces.Circle;
import interfaces.Shape;
import interfaces.Square;
import interfaces.Triangle;

import java.util.LinkedList;
import java.util.List;

public class GeneralShapesListApplication {

    public static void main(String[] args) {

        List<Shape> shapes = new LinkedList<>();
        Square square = new Square(10.0);
        shapes.add(square);
        shapes.add(new Circle(7.0));
        shapes.add(new Triangle(10.0, 4.0, 10.77));

        shapes.remove(1);
        shapes.remove(square);

        Triangle triangle = new Triangle(10.0, 4.0, 10.77);
        shapes.remove(triangle);

        System.out.println(shapes.size());

        for (Shape shape: shapes) {
            System.out.println(shape + " area: " + shape.getArea() + " perimeter: " + shape.getPerimeter());

        }

    }
}
