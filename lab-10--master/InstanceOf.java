/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class InstanceOf {

    public static void main(String[] args) {
        Object obj1 = new Circle();    // implicit casting (upcasting)
        Object obj2 = new Rectangle(); // implicit casting (upcasting)

        if (obj1 instanceof Circle) {
            System.out.println("Circle: ");

            // explit casting on obj1 (downcasting)
            System.out.println("  radius " + ((Circle) (obj1)).getRadius());
        }

        if (obj2 instanceof Rectangle) {
            System.out.println("Rectangle: ");

            // explit casting on obj2 (downcasting)
            System.out.println("  width  " + ((Rectangle) (obj2)).getWidth());
            System.out.println("  height " + ((Rectangle) (obj2)).getHeight());
        }
    }
}

