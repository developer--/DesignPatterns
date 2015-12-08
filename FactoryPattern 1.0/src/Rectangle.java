import interfaces.Shape;

/**
 * Created by Jemo on 08.12.15.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw from Rectangle");
    }
}
