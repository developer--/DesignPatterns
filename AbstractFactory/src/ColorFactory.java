import interfaces.Color;
import interfaces.Shape;

/**
 * Created by Jemo on 08.12.15.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if(color == null){
            return null;
        }

        if(color.equalsIgnoreCase("RED")){
            return new Red();

        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();

        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        return null;
    }
}
