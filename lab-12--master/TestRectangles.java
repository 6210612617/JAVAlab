/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
import java.util.Arrays;
import java.util.Random;

public class TestRectangles{

    static final int MAX_OBJS = 10;
    static final int MAX_WIDTH = 100;
    static final int MAX_HEIGHT = 100;

    public static void main(String[] args) {
        Random rnd = new Random();
        Rectangle[] rectangles = new Rectangle[MAX_OBJS];
        double w, h;
        for (int i = 0; i < MAX_OBJS; i++) {
            w = rnd.nextDouble() * MAX_WIDTH;
            h = rnd.nextDouble() * MAX_HEIGHT;
            rectangles[i] = new Rectangle(w, h);
        }

        Arrays.sort(rectangles);

        // use enhanced loop
        for (Rectangle rectangle : rectangles) {
            System.out.print(rectangle + " ");
            System.out.println();
        }
    }
}

