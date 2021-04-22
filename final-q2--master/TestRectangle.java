import java.util.Arrays;

/**
 *
 * @author 6210612617@cn103
 */
public class TestRectangle {

    static final int MAX_OBJS = 4;
    static final int MAX_LENGTH = 10;

    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[MAX_OBJS];
        Rectangle r1, r2, r3;

        System.out.print("Created default triangle: ");
        r1 = new Rectangle();
        System.out.println(r1);
        System.out.print("Create rectangle with 2 parameters: ");
        r2 = new Rectangle(3, 4);
        System.out.println(r2);

        int i = 0;
        int w = 1, h = 1;
        do {
            rectangles[i] = new Rectangle(w, h);
            i++;
            w += 2;
            h += 2;
        } while (i < MAX_OBJS);

        System.out.println("\nStarting objects:");
        i = 0;
        for (Rectangle r : rectangles) {
            System.out.print(i++ + ": " + r);
            System.out.format(" | area: %.2f\n", r.getArea());
        }

        Arrays.sort(rectangles);

        System.out.println("\nAfter sorting:");
        i = 0;
        for (Rectangle r : rectangles) {
            System.out.print(i++ + ": " + r);
            System.out.format(" | area: %.2f\n", r.getArea());
        }

        r1 = new Rectangle(1, 4);
        r2 = new Rectangle(1, 4);
        r3 = new Rectangle(4, 4);

        r1.setLength(4);
        r2.setLength(4, 4);
        r3.setLength(2, 3);
        System.out.format("\nR1: w = %.1f, h = %.1f | area = %.2f", r1.getW(), r1.getH(), r1.getArea());
        System.out.format(" | perimeter = %.2f\n", r1.getPerimeter());
        System.out.format("R2: w = %.1f, h = %.1f | area = %.2f", r2.getW(), r2.getH(), r2.getArea());
        System.out.format(" | perimeter = %.2f\n", r2.getPerimeter());
        System.out.format("R3: w = %.1f, h = %.1f | area = %.2f", r3.getW(), r3.getH(), r3.getArea());
        System.out.format(" | perimeter = %.2f\n\n", r3.getPerimeter());

        String s12 = r1.equals(r2) ? "" : "NOT ";
        String s13 = r1.equals(r3) ? "" : "NOT ";
        String s23 = r2.equals(r3) ? "" : "NOT ";
        System.out.println("R1: " + s12 + "equal R2");
        System.out.println("R1: " + s13 + "equal R3");
        System.out.println("R2: " + s23 + "equal R3");

        System.out.println("\nR1: " + r1);
        r1.setLength(8);
        System.out.println("R1: " + r1);
        r1.setLength(4, 8);
        System.out.println("R1: " + r1);
        r1.setLength(8, 4);
        System.out.println("R1: " + r1);
        r1.setLength(8, 8);
        System.out.println("R1: " + r1);
    }
}
