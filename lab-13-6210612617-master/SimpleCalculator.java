import java.util.Scanner;
public class SimpleCalculator {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter input: ");
        String [] line = input.nextLine().split(" ");

        boolean m = true;
        boolean n = true;
        double x = 0;
        double y = 0;
        double ans = 0;

        // try{
            x = Double.parseDouble(line[0]);
        // }
        // catch (NumberFormatException ex){
            n = false;
            System.out.printf("Incorrect input: %s",line[0]);

        // try{
            y = Double.parseDouble(line[2]);
        // }
        // catch (NumberFormatException ex){
            n = false;   
            System.out.printf("Incorrect input: %s ",line[2]);
        // }

        if(n){
            switch (line[1]){
                case "+":
                    ans += x +y;
                    break;
                case "-":
                    ans += x - y; 
                    break;
                case "*":
                    ans += x * y;
                    break;
                case "/":
                    if (y == 0) {
                        System.out.println("Divider cannot be 0");
                        m = false;
                    }else{
                        ans = x / y;
                    }
                    break;
            
                default:
                    System.out.print("Unimplemented operation: " + line[1]);
                    m = false;
                    break;
    
            }
            if(m){
                if (ans % 1 == 0){
                    System.out.print("Result: " + ans);
                }
                else{
                    System.out.printf("Result: %.2f",ans);
                }
            }
        }
    }
}
