import java.util.Arrays;

/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class CopyArray {

    public static void printArray(int[] x, String name) {
        System.out.print(name + "[] =");
        for (int i = 0; i < x.length; i++) {
            System.out.print(" " + x[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        final int SIZE = 5;

        int[] a = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] b = new int[]{0};
        int[] c = new int[SIZE];
        int[] d = new int[SIZE];
        int[] e = new int[SIZE];
        int[] f = new int[SIZE];

        System.arraycopy(a, 7, c, 0, 3);
        d = a.clone();
        e = Arrays.copyOf(a, SIZE);
        f = Arrays.copyOfRange(a, 4, 9);

        printArray(a, "a");
        printArray(b, "b");
        printArray(c, "c");
        printArray(d, "d");
        printArray(e, "e");
        printArray(f, "f");
    }
}

/* Write output of this program.

a[] = 0 1 2 3 4 5 6 7 8 9 10 11 12
b[] = 0
c[] = 7 8 9 0 0
d[] = 0 1 2 3 4 5 6 7 8 9 10 11 12
e[] = 0 1 2 3 4
f[] = 4 5 6 7 8

*/

/* Answer the following question.
1. How many array objects are created in this program?
Ans: 6


*/

