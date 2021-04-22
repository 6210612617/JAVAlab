/**
 *
 * @author Nitcharee Khatkhanangchcanan <6210612617@cn103>
 */
import java.util.Scanner;


public class PrintArea {

    // create array of Circle objects with random radius
    public static Circle[] createCircleArray(int n) {
        Circle[] circleArray = new Circle[n];

        for (int i = 0; i < n; i++) {
            circleArray[i] = new Circle(Math.random() * 100);
        }
        return circleArray;
    }

    // create array of Rectangle objects with random with and height
    public static Rectangle[] createRectangleArray(int n) {
        Rectangle[] rectangleArray = new Rectangle[n*2];
        double  j =0;
        double y = 0 ;
        for (int i = 0; i < n ; i++){
            j = (Math.random() * 100);
            y = (Math.random() * 100);
            rectangleArray[i] = new Rectangle(j,y);
        }
        return rectangleArray;
    }

    public static void printArea(Shape[] shapeArray) {

 
            Circle[] circle = new Circle[0];
            for (int i = 0; i < shapeArray.length; i++){
                if(circle.getClass() == shapeArray.getClass()) {
                    double redius = (((Circle)shapeArray[i]).getRadius());
                    double area = ((Circle)shapeArray[i]).getArea();
                    
                    System.out.printf("Circle [ %d ] radius : %.2f area : %.2f \n",i,redius,area);
                }
                else{
                    double weight = ((Rectangle)shapeArray[i]).getWidth();
                    double height = ((Rectangle)shapeArray[i]).getHeight();
                    double area = ((Rectangle)shapeArray[i]).getArea();
                    System.out.printf("Rectangle [ %d ] weight : %.2f  height %.2f area : %.2f\n ",i,weight,height,area);
                }
                
            }

        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter number of objects: ");
        n = sc.nextInt();

        // create no more than 50 shape objects each
        if (n > 50) {
            System.out.println("no more than 50 shape objects each");
        }

        Circle[] circleArray = createCircleArray(n);
        Rectangle[] rectangleArray = createRectangleArray(n);

        printArea(circleArray);
        printArea(rectangleArray);
    }
}

