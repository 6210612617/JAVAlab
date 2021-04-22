import java.util.Scanner;
public class P4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int k = 0;
        int j = 0;
        int count1 = 0;
        // String letter = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
        int word = input.nextInt();
       
        StringBuffer word2 = new StringBuffer(word);
        int count = word2.length();
        String ans = " ";
        // System.out.println(Integer.toHexString(word));

        
        // while (i<(word.length()-1)){
        //     k = 0;
        //     while (k <(count-1)){
        //         if (word.charAt(i)==word2.charAt(k)){
        //             j = 0;
        //             while (j< (count-1)){
        //                 if (word2.charAt(k)==word2.charAt(j)){
        //                     word2.deleteCharAt(j);
        //                     count -= 1;
        //                 }
        //                 j += 1;
        //             }
                    
        //         }
                
        //         k += 1;
        //     }
            
        //     i += 1;
        // }
        //=ช้ายอันนี้
        while (i<count-1){
            k = 1;
            while (k<count-1){
                if (word2.charAt(k) == word.charAt(i)){
                     count1 += 1;

                }
                k += 1;
                if (word2.charAt(k)== word2.charAt(i) && count1 >= 2){
                    word2.deleteCharAt(k);
                    count -= 1;

                } 
                
            }   
            i += 1;
        }
  
        System.out.println(word2);
    }
}
        // while (i<count-1){
        //     k = i+1;
        //     while(k<count-1){
        //         if( word2.charAt(i) != word2.charAt(k)){
                    
        //             ans += word2.charAt(k);
        //         }
        //         k += 1;
        //         if ( word2.charAt(i) == word2.charAt(k)){
        //             j = 0;
        //             while (j<ans.length()){
                        
        //                 if (word2.charAt(i) == ans.charAt(j)){
        //                     break;
        //                 }
        //                 else {
        //                     ans += word2.charAt(i);
        //                 }
        //                 j += 1;
        //             }
        //         }
        //     }
        //     i += 1;
        // }


        // while (i<count-1){
        //     k = i+1;
        //     while(k<count-1){
        //         if( word2.charAt(i) == word2.charAt(k)){
        //             count1 += 1;
        //             ans += word2.charAt(k);
        //         }
        //         k += 1;
        //         if ( word2.charAt(i) == word2.charAt(k) && count1 >= 2){
        //             word2.deleteCharAt(k);
        //             count -= 1;
        //         }
        //     }
        //     i += 1;
        // }
       
//         import java.util.Scanner; 

// public class DecimalToBinaryConverter

// {     

// public static void main(String[] args) {           

 

// Scanner in = new Scanner(System.in);           

 

// nt decimalNumber;           

// String binaryNumber;           

 

// System.out.print("Enter a positive integer: ");           

 

// decimalNumber = in.nextInt();           

 

// if (decimalNumber

 

// System.out.println("ERROR: entered integer is nonpositive.");           

 

// else {                 

 

// binaryNumber = "";                 

// // algorithm step by step                 

// // initial: binaryNumber = "", decimalNumber = 123                 

// // step 1 : binaryNumber = "1 ", decimalNumber = 61                 

// // step 2 : binaryNumber = "11 ", decimalNumber = 30                 

// // step 3 : binaryNumber = "011 ", decimalNumber = 15                 

// // step 4 : binaryNumber = "1011 ", decimalNumber = 7                 

// // step 5 : binaryNumber = "1 1011 ", decimalNumber = 3                 

// // step 6 : binaryNumber = "11 1011 ", decimalNumber = 1                 

// // step 6 : binaryNumber = "111 1011 ", decimalNumber = 0                 

// // stop   : (decimalNumber != 0)                 

 

// while (decimalNumber != 0) {                       

// // add spaces to separate 4-digit groups                       

// if (binaryNumber.length() % 5 == 0)                             

// binaryNumber = " " + binaryNumber;                       

// // extract last digit in binary representation                       

// // and add it to binaryNumber                       

// binaryNumber = (decimalNumber % 2) + binaryNumber;                       

// // cut last digit in binary representation                       

// decimalNumber /= 2;                 

// }                 

// System.out.println("Binary: " + binaryNumber);           

// }     

// }

// }
       
//     }
// }