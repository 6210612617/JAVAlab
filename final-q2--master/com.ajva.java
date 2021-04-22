public class com  extends Rectangle
implements Comparable<com> {
    public ComparableRectangle(double w, double h) {
        super(w,h);
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
