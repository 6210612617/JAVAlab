import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class TestCircles{

    static final int MAX_OBJS = 10;
    static final int MAX_RADIUS = 100;

    public static void main(String[] args) {
        Random rnd = new Random();
        Circle[] circles = new Circle[MAX_OBJS];

        for (int i = 0; i < MAX_OBJS; i++) {
            circles[i] = new Circle( rnd.nextDouble() * MAX_RADIUS );
        }

        Arrays.sort(circles);

        // use enhanced loop
        for (Circle circle : circles) {
            System.out.print(circle + " ");
            System.out.println();
        }
    }
}

