import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class DeclareException {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		p1();
		p2();
		p3();
	}

	public static void p1() {
		test1();
		test2();
	}

	public static void p2() {
		try {
			test3();
        } catch (FileNotFoundException ex) {}
		test4();
	}

	public static void p3() {
		try {
			test5();
        } catch (IOException ex) {}
		try {
			test6();
        } catch (Exception ex) {}
	}
	

	public static void test1() throws ArithmeticException {
		try {
			throw new ArithmeticException();
		} 
		catch (ArithmeticException ex) {}
	}

	public static void test2() throws NullPointerException {
		try {
			throw new NullPointerException();
		}
		catch (NullPointerException ex) {}
	}

	public static void test3() throws FileNotFoundException {
		throw new FileNotFoundException();
	}

	public static void test4() throws RuntimeException {
		try {
			throw new RuntimeException();
		}
		catch (RuntimeException ex) {}
	}

	public static void test5() throws IOException {
		throw new IOException();
	}

	public static void test6() throws Exception {
		throw new Exception();
	}
}
