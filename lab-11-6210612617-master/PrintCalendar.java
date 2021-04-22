/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class PrintCalendar {

    static void printCalendar(int month, int year) {
        Calendar calendar = new GregorianCalendar(year, month - 1, 1);
        int dayofWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int daysinMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        String fisrtSpace = "";
        String[] monthInYear = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
        "October", "November", "December" };
   
        if (dayofWeek != 1){
            for (int i = 1; i < dayofWeek; i++) {
            fisrtSpace += "    ";
            }
        }
        else{
            fisrtSpace = "";
        }
        System.out.printf("%s %d\n------------\n", monthInYear[month - 1], year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        System.out.print(fisrtSpace);

        int check = 0;
        for (int day = 1; day <= daysinMonth; check++) {

            for (int j = ((check == 0) ? dayofWeek - 1 : 0); j < 7 && (day <= daysinMonth); j++) {
                System.out.printf("%2d  ", day);
                day++;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int month;
        int year;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month: ");
        month = sc.nextInt();
        System.out.print("Enter year : ");
        year = sc.nextInt();
        printCalendar(month, year);
    }
}

