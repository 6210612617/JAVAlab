/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class ComparableRectangle
        extends Rectangle
        implements Comparable<ComparableRectangle> {

    public ComparableRectangle(double width, double height) {
        super(width, height);
    }

    @Override
    public int compareTo(ComparableRectangle o) {
        if (getArea() > o.getArea()) {
            return 1;
        } else if (getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override // Implement the toString method in Shape
    public String toString() {
        return super.toString() + " Area: " + getArea();
    }
}

