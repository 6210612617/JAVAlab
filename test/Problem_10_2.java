import java.util.Scanner;
public class Problem_10_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();

        int i = 1;
        double total = 0;
        double x = 4;
        double denominator = 0;
        int count = 1;
        
        if( num >= 1 && num <= 100){
            if (num >=2){
                denominator = (x*(x-1)*(x-2));
                total +=  (4/denominator);
                i++;
                            
                while (i < (num)){
                
                    if (count % 2 == 0 ){
                        x += 2;
                        denominator = (x*(x-1)*(x-2));
                        total += (4/denominator);
                        count ++;
                    }
                    else {
                        x += 2;
                        denominator = (x*(x-1)*(x-2));
                        total -= (4/denominator);
                        count ++;
                    }
                i ++;
                }
            }
            double ans =  total+3 ;

            System.out.printf("%.10f",ans);
        }
        else{
            System.out.println("INVALID");
        }
        input.close();
}}