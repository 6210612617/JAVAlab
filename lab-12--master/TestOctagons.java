import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class TestOctagons {

    static final int MAX_OBJS = 10;
    static final int MAX_SIDE = 100;

    public static void main(String[] args) {
        Random rnd = new Random();
        Octagon[] octagons = new Octagon[MAX_OBJS];

        for (int i = 0; i < MAX_OBJS; i++) {
            octagons[i] = new Octagon( rnd.nextDouble() * MAX_SIDE );
        }

        Arrays.sort(octagons);

        // use enhanced loop
        for (Octagon octagon : octagons) {
            System.out.print(octagon + " ");
            System.out.println();
        }
    }
}

