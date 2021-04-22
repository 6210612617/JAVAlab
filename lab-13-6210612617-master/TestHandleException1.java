/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class TestHandleException1 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		try {
			int[] a = new int[10];
			System.out.println("a[] " + a[10]);
		} catch (ArithmeticException ex) {
			System.out.println("Exception: ArithmeticException");
		} catch (RuntimeException ex) {
			System.out.println("Exception: RuntimeException");
		} catch (Exception ex) {
			System.out.println("Exception: Exception");
		}
	}
}

/*
 What is the output of this program?
 Ans:
	Exception: RuntimeException

 */
