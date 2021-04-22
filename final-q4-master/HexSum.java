import java.util.Scanner;
import java.math.BigInteger;

public class  HexSum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string of hex digits (in pairs):");
      
        String num = input.nextLine();
        String sun ="" ;
        int i =0;
        int count = 0;
        while (i<=((num.length())-1)){
            count ++;
            sun += num.charAt(i);
            if(count % 2 == 0){
                sun += " + ";
            }
            i++;
        }
        // int c = Integer.parseInt(num);
        // String ans  = String.valueOf(Integer.parseInt(num, 16));

      
        System.out.println(sun + " = " + num);
        System.out.println("LSB: " + num);

    }
}