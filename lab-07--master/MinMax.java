import java.lang.reflect.Array;

/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        double[] num = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers => ");
        for (int i =0;i<10;i++){
            num[i] = input.nextDouble();
        }
        double min = num[0];
        double max = num[0];
        for(int k =1;k< (num.length); k++){
            if (min > num[k]){
                min = num[k];
            }
            if ( max < num[k]){
                max = num[k];
            }
        }
         min = min*100;
         max = max*100;
        if(min % 100 == 0 ){
            min = min/100;
            System.out.printf("Minimum          => %.0f" , min);
        }
        if(max % 100 == 0 ){
            max = max/100;
            System.out.printf("\nMaximum          => %.0f" , max);
        }
        else{
            min = min/100;
            max = max/100;
            System.out.print("Minimum          => " + min);
            System.out.print("\nMaximum          => " + max);
        }
        
        


    }

}

