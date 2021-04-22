import java.util.Scanner;

import sun.awt.www.content.audio.x_wav;

import java.util.ArrayList;
public class FindDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
    
        System.out.print("Enter a sequence of integers: ");
    
        String ans = "";
        int count = 0;
        int i = 0;
        int k = i+1 ;
      
        ArrayList <String> num = new ArrayList<String >();
        String x = input.nextLine();
        String [] a = x.split(" ");
        for (int j = 0; j < a.length ; j++){
            num.add(a[j]);
        }
        
        
      
        
        
        while  ( i < num.size()-1){
             k = i+1;
            while ( k < num.size()-2 ){
                 if (num.get(i).equals(num.get(k))){
                     ans += num.get(k);
                     count ++;
                 }
                 k++;
             }
            i++;
         }
        if(count == 0){
            System.out.println("No duplicate");
        }
        else{
            System.out.println("Duplicate " + ans );
        }
        System.out.println(num.size());
        
    }

}