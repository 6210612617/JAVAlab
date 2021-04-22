
public class Octagon extends Shape  
    implements Comparable<ComparableCircle>{

    private double side ;
    public Octagon(){
        this.side = 1;
    }
    public Octagon(double  x){
        this.side = x;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public boolean equals(Octagon y) {
        return this.getSide() == y.getSide();
    }
    public double getArea(){
        double area = (2 + 4*Math.sqrt(2))* side * side;
        return  area;
    }
    public double perimeter(){
        double perimeter = 8 * side;
        return perimeter;
    }
    public int compareTo(ComparableCircle x) {
        if (x.getArea() <getArea()) {
            return 1;
        } else if (x.getArea() > getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
    public String toString() {
        return super.toString() + " Area: "+ String.format("%.1f",getArea());
    }

}