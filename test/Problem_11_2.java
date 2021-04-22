import java.util.Scanner;
import java.util.ArrayList;

public class Problem_11_2 {
    public  static double acos(double a) {
        return  Math.acos(a);
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double u = Math.sqrt((Math.pow(x1,2) + Math.pow(y1, 2)));
        double v = Math.sqrt((Math.pow(x2,2) + Math.pow(y2, 2)));
        double total = ((x1*x2)+(y1*y2))/(u*v);
        double ans = acos(total);
        
        System.out.printf("%.2f" ,Math.toDegrees(ans));
    }
}
    
 
