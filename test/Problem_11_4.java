import java.util.Scanner;
public class Problem_11_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        final int ROW = n, COLUMN = n;
        int sqare[][] = new int [ROW][COLUMN];
        for(int i = 0; i< ROW; i++){
            for (int j = 0; j < COLUMN; j++) {
                sqare[i][j] = input.nextInt(); 
                
            }

        }
        
}