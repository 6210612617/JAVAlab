public class Rectangle extends Shape implements Comparable<Rectangle> {
    private double w;
    private double h;
    private double area;
    private double paramiter;
    public Rectangle(){
        this.h = 1.0;
        this.w = 1.0;
    }
    public Rectangle(double w,double h){
        this.h = h;
        this.w = w;
    }
    public void setLength(double w){
        this.w = w;
    }
    public void setLength(double w,double h){
        this.w = w;
        this.h = h;
    }
    public double getW(){
        return w;
    }
    public void setW(double w){
        this.w = w;
    }
    public double getH(){
        return h;
    }
    public void setH(double h){
        this.h = h;
    }
    @Override
    public double getArea(){
        return w*h;
    }
    public double setArea(){
        this.area =   w*h;
    }
    @Override
    public double getPerimeter(){
        return 2*(w+h);
    }
    public double setPerimeter(){
        this.paramiter = 2*(w+h);
    }
    public String toString (){
        return "R1:  w = " + w + " h = "+h;
    }
   @overload
    public int compareTo( Rectangle o){    
        if(getArea() > o.getArea())    
        return 0;    
        else if(getArea() < o.getArea())    
        return 1;    
        else    
        return -1;    
        }   
      
}