/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class BasicArray {


    public static void main(String[] args) {
        final int SIZE = 5;
        int[] aArray;
        int sum;
        int m, n, c;

        aArray = new int[SIZE];
        sum = 0;

        // normal for loop statement
        for (int i = 0; i < aArray.length; i++) {
            aArray[i] = (int)(Math.random()*10);
            System.out.printf("aArray[%d] = %d\n", i, aArray[i]);
        }

        // new for-each loop statement since Java 1.5
        for (double d: aArray) {
            sum += d;
        }

        m = n = aArray[0];

        c = 1;
        while (c < aArray.length) {
            if (aArray[c] > m) {
                m = aArray[c];
            }
            c++;
        }

        c = 1;
        do {
            if (aArray[c] < n) {
                n = aArray[c];
            }
            c++;
        } while (c < aArray.length);

        System.out.println("sum = " + sum);
        System.out.println("m   = " + m);
        System.out.println("n   = " + n);
    }
}

/* Answer the following questions.
1. How many array objects are created in this program?
Ans: 4


2. What is the maximum possible value of variable sum before the program ends?
Ans: 36


3. What is the maximum possible value of variable m before the program ends?
Ans: 9


4. What is the minimum possible value of variable n before the program ends?
Ans: 0

*/

