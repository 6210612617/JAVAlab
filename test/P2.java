import java.util.Scanner;
public class P2 {
    public static String removeNonDigit(String s) {
        
       String st = s.replace("-","");
      return st;
        
    }
    public static String markDigit (String s,int start,int len) {
        String temp = removeNonDigit(s);
        StringBuffer temp2 = new StringBuffer(temp);
        int m = start;
        while (m<=m+len){
            
        }
        String ans = temp2.toString();
        return ans;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String num = input.nextLine();
        System.out.print("Enter starting position: ");
        int start = input.nextInt();
        System.out.print("Enter number of digits to mark: ");
        int len = input.nextInt();
        System.out.println(markDigit(removeNonDigit(num), start, len));

    }
}