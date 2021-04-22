import java.util.Scanner;

/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class TestException {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a: ");
		a = sc.nextInt();
		System.out.print("Enter b: ");
		b = sc.nextInt();

		System.out.println(a + " / " + b + " = " + a / b);
	}
}

