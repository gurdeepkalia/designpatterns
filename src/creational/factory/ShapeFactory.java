package creational.factory;
/*
* Use the Factory pattern when you need to create an object, but you don’t know in advance what class of object you
* need to create. It is particularly useful when there are multiple concrete classes implementing the same interface
* or extending a common superclass.
* */
public class ShapeFactory {
    public static Shape getShape(String type) {
        if (type.equals("circle")) {
            return new Circle();
        } else if (type.equals("rect")) {
            return new Rectangle();
        } else {
            return null;
        }
    }
}


