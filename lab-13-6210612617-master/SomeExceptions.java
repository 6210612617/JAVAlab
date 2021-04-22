import java.util.ArrayList;

/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class SomeExceptions {
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		//test1();
		//test2();
		//test3();
		//test4();
		//test5();
		//test6();
		//test7();
		//test8();
		//test9();
	}

	static void test1() {
		System.out.println(1 / 0);
	}

	static void test2() {
		Object obj = null;
		System.out.println(obj.toString());
	}

	static void test3() {
		ArrayList al = new ArrayList();
		al.add("Hello");
		al.add(2, "World");
	}

	static void test4() {
		int[] a = new int[5];
		System.out.println(a[5]);
	}

	static void test5() {
		ArrayList al = new ArrayList(-1);
	}

	static void test6() {
		Double d = new Double("x");
	}

	static void test7() {
		int x = -1;
		int[] a = new int[x];
		System.out.println(a[1]);
	}

	static void test8() {
		String s = "Hello";
		System.out.println(s.charAt(5));
	}

	static void test9() {
		Object obj = new Object();
		String s = (String) obj;
	}
}

/* Answer the following questions.
   FQCN - Fully Qualified Class Name

1.What is the FQCN of the exception generated with method test1().
Ans. java.lang.ArithmeticException


2.What is the FQCN of the exception generated with method test2().
Ans. java.lang.NullPointerException


3.What is the FQCN of the exception generated with method test3().
Ans. java.lang.IndexOutOfBoundsException


4.What is the FQCN of the exception generated with method test4().
Ans. java.lang.ArrayIndexOutOfBoundsException


5.What is the FQCN of the exception generated with method test5().
Ans. java.lang.IllegalArgumentException


6.What is the FQCN of the exception generated with method test6().
Ans. java.lang.NumberFormatException


7.What is the FQCN of the exception generated with method test7().
Ans. java.lang.NegativeArraySizeException


8.What is the FQCN of the exception generated with method test8().
Ans. java.lang.StringIndexOutOfBoundsException


9.What is the FQCN of the exception generated with method test9().
Ans. java.lang.ClassCastException


*/

