
public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(){
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }
    
    public double getArea(){
        double s = ((side1+side2+side3)/2);
        return Math.sqrt((s*(s-side1))*((s-side2))*((s-side3)));
       
    }
    
    public String toString(){
        return "Triangle: sides = " + side1 + " " + side2 + " " + side3  ;
    }
    
}