import interfaces.Color;
import interfaces.Shape;

/**
 * Created by Jemo on 08.12.15.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shapeType);
}
