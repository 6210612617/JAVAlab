import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem_12_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> excepList = new ArrayList<Integer>();
        int[] except = { 1, 2, 3, 4, 5, 7, 8, 10, 11, 13, 14, 16, 17, 19, 22, 23, 25, 28, 31, 34, 37, 43 };
        int check = 0;

        for (int i = 0; i < except.length; i++) {
            if (n != except[i]) {
                check += 1;
            }
        }

        if ((0 <= n && n <= 100) && check >= 22) {

            for (int x = 6; x < 43; x += 3) {
                excepList.add(x);
            }
            for (int x = 26; x < 43; x += 3) {
                excepList.add(x);
            }
            for (int x = 44; x <= 100; x += 1) {
                excepList.add(x);
            }

            excepList.add(20);
            excepList.add(40);
            Collections.sort(excepList);

        } else {
            System.out.println("NO");
        }

        for (int i = 0; i <= excepList.indexOf(n); i++) {
            System.out.println(excepList.get(i));
        }

    }
}