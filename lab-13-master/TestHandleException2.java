/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class TestHandleException2 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		try {
			test();
			System.out.println("Method continues...");
		} catch (ArithmeticException ex) {
			System.out.println("Exception: ArithmeticException");
		} catch (RuntimeException ex) {
			System.out.println("Exception: RuntimeException");
		} catch (Exception e) {
			System.out.println("Exception: Exception");
		}
	}

	static void test() throws Exception {
		System.out.println(1 / 0);
	}

}

/*
 What is the output of this program?
 Ans:
	Exception: ArithmeticException

 */

