/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class InvalidRadiusException extends Exception {

	private final double radius;

	/** Construct an exception with specified radius */
	public InvalidRadiusException(double radius) {
		super("Invalid radius: " + radius);
		this.radius = radius;
	}

	/** Return the radius */
	public double getRadius() {
		return radius;
	}
}

