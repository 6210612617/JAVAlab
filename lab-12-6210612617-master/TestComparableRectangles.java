import java.util.Arrays;

/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class TestComparableRectangles {

    public static void main(String[] args) {
        ComparableRectangle[] rectangles = {
            new ComparableRectangle(5, 6),
            new ComparableRectangle(3, 4),
            new ComparableRectangle(1, 2),
            new ComparableRectangle(7, 8)
        };

        Arrays.sort(rectangles);

        // use enhanced loop
        for (Rectangle rectangle : rectangles) {
            System.out.print(rectangle + " ");
            System.out.println();
        }
    }
}

/* Write output of the progam.

color: white filled: false Area: 2.0 
color: white filled: false Area: 12.0
color: white filled: false Area: 30.0
color: white filled: false Area: 56.0


 */


/* Answer the following question.
1. Why method Arrays.sort can sort the array rectangles?
Ans.
    because rectangles class can comparable



*/
