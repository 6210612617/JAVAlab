/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class ArrayCompare {

    public static void main(String[] args) {
        final int SIZE = 2;
        int[] a = new int[SIZE];
        int[] b = new int[SIZE];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            b[i] = i;
        }
        System.out.println(a == b);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] == b[%d] : ", i, i);
            System.out.printf("%d == %d is ", a[i], b[i]);
            System.out.println(a[i] == b[i]);
        }

        String s[] = new String[SIZE];
        String t[] = new String[SIZE];

        for (int i = 0; i < s.length; i++) {
            s[i] = Integer.toString(i);
            t[i] = Integer.toString(i);
        }
        System.out.println(s == t);
        for (int i = 0; i < t.length; i++) {
            System.out.printf("s[%d] == t[%d] : ", i, i);
            System.out.printf("%s == %s is ", s[i], t[i]);
            System.out.println(s[i] == t[i]);
        }

    }
}

/* Write output of this program.

false
a[0] == b[0] : 0 == 0 is true
a[1] == b[1] : 1 == 1 is true
false
s[0] == t[0] : 0 == 0 is false
s[1] == t[1] : 1 == 1 is false

*/

/* Answer the following questions.
1.What is the value of expression?
    a == b
Ans: a = 


2.What is the value of expression?
    a[0] == b[0]
Ans: 0 == 0


3.What is the value of expression?
    s == t
Ans:

4.What is the value of expression?
    s[1] == t[1]
Ans: 1 == 1


*/

