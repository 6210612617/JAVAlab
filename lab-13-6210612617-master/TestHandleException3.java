/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class TestHandleException3 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		try {
			test();
			System.out.println("Method continues...");
		} catch (RuntimeException ex) {
			System.out.println("Exception: RuntimeException in main");
		} catch (Exception ex) {
			System.out.println("Exception: Exception in main");
		}
	}

	static void test() throws Exception {
		try {
			String s = "Hello";
			System.out.println(s.charAt(5));
		} catch (RuntimeException ex) {
			System.out.println("Exception: Exception RuntimeException in method()");
		} catch (Exception ex) {
			System.out.println("Exception: Exception in method()");
		}
	}
}

/*
 What is the output of this program?
 Ans:
	Exception: Exception RuntimeException in method()
	Method continues...

 */

