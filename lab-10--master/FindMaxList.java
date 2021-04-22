import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nitcharee Khatkhanangchcanan <6210612617@cn103>
 */
public class FindMaxList {
    static Integer findMaxList(ArrayList<Integer> list) {
        int max = list.get(0);
        int i = 1;
        while(i < list.size()){
            if(max < list.get(i)){
                max = list.get(i);
            }
            i++;
        }
        return max;
    }

    static void printList(ArrayList<Integer> list) {
        int size = list.size();

        System.out.print("List: ");
        for (int i = 0; i < size; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Integer> list;
        int n, x;
        int max;

        list = new ArrayList();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter x[%d]: ", i);
            x = sc.nextInt();
            list.add(x);
        }
        max = findMaxList(list);

        printList(list);
        System.out.println("Max: " + max);
    }
}

