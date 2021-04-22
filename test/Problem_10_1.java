import java.util.Scanner;

public class Problem_10_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        int i = 1;
        double total = 1;
        double denominator = 1;
        int count = 1;

        if (num >=1 && num <= 100){
          
            if(num > 1){
                while (i < num){
                
                    if (count % 2 == 0 ){
                        denominator += +2;
                        double x = (1/denominator);  
                        total += x;
                        count ++;
                    }
                    else{
                        denominator += 2;
                        double y = (1/denominator);  
                        total -= y;
                        count ++;
                    }
                    i ++;
                }
            }
            
            double ans = total*4;

            System.out.printf("%.10f",ans);
            
        }
        else{
            System.out.println("INVALID");
        } 
        input.close();
    }
}