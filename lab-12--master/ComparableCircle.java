
public class ComparableCircle extends Circle 
    implements Comparable<ComparableCircle> {
    
    public ComparableCircle(double radius) {
        super(radius);
    }

    public int compareTo(ComparableCircle x) {
        if (getArea() > x.getArea()) {
            return 1;
        } else if (getArea() < x.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    public String toString() {
        return super.toString() + " Area: "+ String.format("%.1f",getArea());
    }
}