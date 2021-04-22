/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class CircleWithException {

	private double radius;
	private static int numberOfObjects = 0;

	/** Construct a circle with radius 1.0 */
	public CircleWithException() throws InvalidRadiusException {
		this(1.0);
	}

	/** Construct a circle with specified radius */
	public CircleWithException(double radius) throws InvalidRadiusException {
		setRadius(radius);
		numberOfObjects++;
	}

	public void setRadius(double newRadius) throws InvalidRadiusException {
		if (newRadius > 0) {
			this.radius = newRadius;
		}
		else {
			throw new InvalidRadiusException(newRadius);
		}
	}

	public double getRadius() {
		return radius;
	}

	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}
}

