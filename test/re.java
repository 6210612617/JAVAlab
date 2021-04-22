import java.util.Scanner;

public class re {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        String word = input.nextLine();
        // word = word.replace(" ", ",");
        String ans = " ";
        String[] word2 = word.split(" "); 
        int i =0 ;
        while (i<= (word2.length-1)){
            String c = word2[i];
            StringBuffer sbf = new StringBuffer(c);
            sbf = sbf.reverse();
            ans += sbf;
            ans += " ";
            i += 1;
        }
        System.out.println(ans);
    }
}