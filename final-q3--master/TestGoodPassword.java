import java.util.Scanner;

/**
 *
 * @author 6210612617@cn103
 */
public class TestGoodPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = sc.next();

        MyGoodPassword goodPw = new MyGoodPassword();

        boolean res = goodPw.isGoodPassword(password);

        System.out.print("\n" + password);
        if (res) {
            System.out.println(" is a good password");
        } else {
            System.out.println(" is NOT a good password");
        }
    }

}
