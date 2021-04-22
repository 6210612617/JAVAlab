import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class SumArea {

    // create array of Shape objects
    public static Shape[] createShapeArray(int n) {
        Shape[] shapeArray = new Shape[n];
        
        int i =0;
        while(i<n){
            Random rnd = new Random();
            double x = rnd.nextInt(2);
            if( x == 0){
                double  j =0;
                double y = 0 ;

                j = (rnd.nextInt(11));
                y = (rnd.nextInt(11));
                 shapeArray[i] = new Rectangle(j,y);
                }
            
            else{shapeArray[i] = new Circle(rnd.nextInt(11));
            }
            i++;
        }
        return shapeArray;
    }
 


    // sum area of all objects in array
    public static double sumArea(Shape[] shapeArray) {
        double sum = 0;
        for (int k = 0 ;k < shapeArray.length; k++){
            if(Circle.class == shapeArray[k].getClass() ){
                for (int i = 0; i < shapeArray.length; i++){
                    double area = (((Circle)shapeArray[i]).getArea());
                    sum += area;
                   
                }
            }
            else{
                for(int i = 0; i < shapeArray.length; i++){
                    double area = (((Rectangle)shapeArray[i]).getArea());
                    sum += area;
                }

            }
            
        }
        return sum;
    }

    // show number of objects for each shape
    public static void printShapeArrayInfo(Shape[] shapeArray) {
        for (int k = 0 ;k < shapeArray.length; k++){
          
            if(shapeArray[k] instanceof Circle){
                for (int i = 0; i < shapeArray.length; i++){
                    double redius = (((Circle)shapeArray[i]).getRadius());
                    double area = ((Circle)shapeArray[i]).getArea();
                    System.out.printf("Rectangle [ %d ] weight : %.2f  area : %.2f \n ",i,redius,area);
                  
                }
            }
            else{
                for(int i = 0; i < shapeArray.length; i++){
                    double weight = ((Rectangle)shapeArray[i]).getWidth();
                    double height = ((Rectangle)shapeArray[i]).getHeight();
                    double area = ((Rectangle)shapeArray[i]).getArea();
                    System.out.printf("Rectangle [ %d ] weight : %.2f  height %.2f area :\n ",i,weight,height,area);
                }

        }
            
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double totalArea;

        System.out.print("Enter number of objects: ");
        n = sc.nextInt();

        // create no more than 50 shape objects each
        if (n > 50) {
            System.out.println("create no more than 50 shape objects"); 
            
        }

        Shape[] shapeArray = createShapeArray(n);

        printShapeArrayInfo(shapeArray);
        totalArea = sumArea(shapeArray);
        System.out.println("Total area: " + String.format("%.2f",totalArea));
    }
}

