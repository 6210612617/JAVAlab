import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class HandleInputMismatch {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		boolean readAgain = true;

		do {
			try {
				System.out.print("Enter a: ");
				a = sc.nextInt();
				readAgain = false;
			} catch (InputMismatchException ex) {
				System.out.println("Incorrect input: an integer is required");
				sc.nextLine();  // discard input
			}
		} while (readAgain);

		System.out.println("Method contines ...");
	}
}

