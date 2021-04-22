import java.util.ArrayList;
import java.math.*;

/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class TestNumber {

    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<Number>();
        list.add(45);      // Add an integer
        list.add(3445.53); // Add a double
        list.add(new BigInteger("3432323234344343101"));
        list.add(new BigDecimal("2.0909090989091343433344343"));
        System.out.println("The largest number is " + getLargestNumber(list));
    }

    public static Number getLargestNumber(ArrayList<Number> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        Number number = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (number.doubleValue() < list.get(i).doubleValue()) {
                number = list.get(i);
            }
        }
        return number;
    }
}

