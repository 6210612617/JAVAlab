/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class TestCircleWithException {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		CircleWithException c1, c2, c3;

		try {
			c1 = new CircleWithException(10);
			c2 = new CircleWithException(-10);
			c3 = new CircleWithException(0);
		} catch (InvalidRadiusException ex) {
			System.out.println(ex);
		}

		System.out.println("Number of objects created: "
				+ CircleWithException.getNumberOfObjects());
	}

}

/*
What is the output of this program?
Ans:
InvalidRadiusException: Invalid radius: -10.0
Number of objects created: 1

*/

