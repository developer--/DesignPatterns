import interfaces.Shape;

/**
 * Created by Jemo on 08.12.15.
 */
public class FactoryPatternDemo {

    public static void main(String []args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("square");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("circle");
        shape3.draw();
    }

}
