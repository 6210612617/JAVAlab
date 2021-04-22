import java.util.ArrayList;
public class hex {
    public static void main(String[] args) {
        ArrayList <Integer> num = new ArrayList<Integer>();
        ArrayList <Integer> prime = new ArrayList<Integer>();
        int ans = 0;
        int x = 10000000;
        int y = 10;
        int count =0;
        int k =0;
        int m = 1;
        for(int i =0; i <= x  ; i++ ){  
            num.add(i);   
        }
        while ( k < (num.size()) ){
            m =1;
            count = 0;
            while( m <=x){
                if (num.get(k) % m == 0){
                    count ++;
                }               
                m++;
            }
            if (count == 2){
                prime.add(num.get(k));
            }
            
            k++;
        }
        for( int h = 0; h < prime.size(); h++){
             if( prime.get(h) > y){
                  ans += prime.get(h);
                
                 break;
             }
             
        }
        
        System.out.println(ans);
        // System.out.println(num);
        // System.out.println(ans);
      
    }

}