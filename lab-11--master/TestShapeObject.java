/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class TestShapeObject {

    static void displayShape(Shape object) {
        System.out.println(object.getClass() + ": area is " + object.getArea());
        System.out.println(object.getClass() + ": perimeter is " + object.getPerimeter());
        System.out.println();
    }

    public static boolean equalArea(Shape object1, Shape object2) {
        return object1.getArea() == object2.getArea();
    }

    public static void main(String[] args) {
        Shape shape1 = new Circle(5);
        Shape shape2 = new Rectangle(5, 3);

        System.out.println("The two objects have the same area? "
                + equalArea(shape1, shape2));

        displayShape(shape1);
        displayShape(shape2);
    }
}

/* Write output of the program

The two objects have the same area? false
class Circle: area is 78.53981633974483
class Circle: perimeter is 31.41592653589793

class Rectangle: area is 15.0
class Rectangle: perimeter is 16.0


*/

/* Answer the following questions.
1. Shape is an abstract class but why can you create an instance of Circle or Rectangle?
Ans: create reference of abstract  use to build  instance of sub class


2. How is it possible that method getArea and getPerimeter are called correctly for both Circle and Rectangle objects?
Ans: override method getPerimeter and  getArea


*/

