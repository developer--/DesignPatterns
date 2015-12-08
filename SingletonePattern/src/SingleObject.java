/**
 * Created by Jemo on 08.12.15.
 */
public class SingleObject {
    //create an object of SingleObject
    private static SingleObject singleObjectInstance = new SingleObject();

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject(){ }

    //Get the only object available
    public static SingleObject getInstance(){
        return singleObjectInstance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
