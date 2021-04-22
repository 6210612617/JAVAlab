import java.io.IOException;

/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class CheckedException {

	public static void main(String[] args) throws IOException {
		m1();
		m2();
	}

	public static void p1() throws IOException {
		throw new IOException();
	}

	// p1 throws checked exception, use try-catch to handle exception
	public static void m1() {
		try {
			p1();
		} catch (IOException ex) {

		}
	}

	// p1 throws checked exception, declare throws exception
	public static void m2() throws IOException {
		p1();
	}
}

