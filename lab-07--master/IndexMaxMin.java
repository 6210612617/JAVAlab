/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
import java.util.Scanner;

public class IndexMaxMin {
    public static void main(String[] args) {
        double[] num = new double[10];
        Scanner input = new Scanner(System.in);
        int countmin =0;
        int countmax = 0 ;
        int k = 1;
        int j = 0;
        System.out.print("Enter 10 numbers => ");
        for (int i =0;i<10;i++){
            num[i] = input.nextDouble();
        }
        double min = num[0];
        double max = num[0];
        while(k< (num.length)){
            if (min > num[k]){
                min = num[k];
            }
            if ( max < num[k]){
                max = num[k];
            }
            
            k++;
        }
        while(j< (num.length)){
            if (min == num[j]){
                countmin = j;
            }
            if ( max == num[j]){
                countmax = j;
            }
            
            j++;
        }
        System.out.printf("Minimum          => %d" , countmin);
        System.out.printf("\nMaximum          => %d" ,countmax);
        


    }
}

