/*
TASK: A12_P01
LANG: JAVA
*/
/* Complete definition of method nextPrime */
import java.util.ArrayList;
import java.util.Scanner;

public class Problem_12_1 {
    static int nextPrime(int x) {
        ArrayList <Integer> num = new ArrayList<Integer>();
        ArrayList <Integer> prime = new ArrayList<Integer>();

        int ans = 0;
        int n = x+100;;
        int count =0;
        int k =0;
        int m = 1;
 
        while ( k < (n)){
            m = 1;
            count = 0;
            while( m <=n){
                if (k % m == 0){
                    count ++;
                }               
                m++;
            }
            if (count == 2){
                prime.add(k);
            }
            k++;
        }
        for( int h = 0; h < prime.size(); h++){
             if( prime.get(h) > x){
                ans += prime.get(h);
                break;
            }
        }
        return ans;
    }
        public static void main(String[] args) {
        final int MIN_N = 1;
        final int MAX_N = 1000000000;
        int n, np;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n < MIN_N || n > MAX_N) {
        System.out.printf("0");
        return;
        }
        np = nextPrime(n);
        System.out.printf("%d", np);
    }

}