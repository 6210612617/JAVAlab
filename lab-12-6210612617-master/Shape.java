/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public abstract class Shape extends Object {

    private String color = "white";
    private boolean filled;

    protected void Shape() {
    }

    protected void Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        String s;
        s = "color: " + color;
        s += " filled: " + filled;
        return s;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}

