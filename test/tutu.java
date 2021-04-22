import java.util.Scanner;
import java.util.ArrayList;
public class tutu {
    int k = 0;
    int n = 1;
    int count=0;
    int ans = 0;
    while(k < list.size()){
        n = 0;
        count = 0;
        while (n<= list.size()){
            if(list.get(k) < list.get(n)){
                break;
            }
            count++;
            n++;
        }
        
        if (count == (list.size()-1)){
            ans = list.get(k);
            break;
        }
        k++;
    }
    return ans;