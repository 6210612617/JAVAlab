/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class Circle
        extends Shape {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        String s;
        s = "color: " + getColor();
        s += " filled: " + isFilled();
        s += " area: " + getArea();
        return s;
    }

    public String getString() {
        String s1 = "";
        String s2 = "";

        s1 = super.toString();
        //s2 = super.super.toString();

        return s1 + " " + s2;
    }
}

