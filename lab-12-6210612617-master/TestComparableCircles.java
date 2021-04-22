import java.util.Arrays;

/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class TestComparableCircles {

    public static void main(String[] args) {
        ComparableCircle[] circles = {
            new ComparableCircle(7),
            new ComparableCircle(5),
            new ComparableCircle(1),
            new ComparableCircle(3)
        };

        Arrays.sort(circles);

        // use enhanced loop
        for (Circle circle : circles) {
            System.out.print(circle + " ");
            System.out.println();
        }
    }
}

/** 
color: white filled: false Area: 3.1 
color: white filled: false Area: 28.3 
color: white filled: false Area: 78.5 
color: white filled: false Area: 153.9  
*/


