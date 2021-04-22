/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class Polymorphism {
    static void printColor(Shape shape) {
        System.out.println(shape.getClass() + " " + shape.getColor());
    }

    public static void main(String[] args) {
        Shape shape = new Shape("Red", true);
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(3, 4);

        printColor(shape);
        printColor(circle);
        printColor(rectangle);
    }

}

