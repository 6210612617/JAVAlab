import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class MultipleCatches {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter a: ");
			a = sc.nextInt();
			System.out.print("Enter b: ");
			b = sc.nextInt();
			System.out.println(a + " / " + b + " = " + a / b);

		} catch (InputMismatchException ex) {
			System.out.println("Incorrect input: an integer is required");
			sc.nextLine();  // discard input
		} catch (ArithmeticException ex) {
				System.out.println("Exception: An integer cannot be divided by zero");
		}

		System.out.println("Method contines ...");
	}
}

