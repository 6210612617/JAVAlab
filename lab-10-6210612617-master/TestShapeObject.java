/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class TestShapeObject {
    public static void main(String[] args) {
        Object o = new Object();
        Shape s = new Shape();
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        System.out.println(o.getClass() + " ==> " + o);
        System.out.println(s.getClass() + " ==> " + s);
        System.out.println(c.getClass() + " ==> " + c);
        System.out.println(r.getClass() + " ==> " + r);
        System.out.println();

        System.out.println(o.toString());
        System.out.println(s.toString());
        System.out.println(c.toString());
        System.out.println(r.toString());
        System.out.println();

        System.out.println(c.getString());
    }

}

/* Write output of the program

class java.lang.Object ==> java.lang.Object@762efe5d
class Shape ==> color: white filled: false
class Circle ==> color: white filled: false area: 0.0
class Rectangle ==> color: white filled: false

java.lang.Object@762efe5d
color: white filled: false
color: white filled: false area: 0.0
color: white filled: false

color: white filled: false


*/


/* Answer the following questions
1. How many Object objects are created?
Ans: 4


2. How many Shape objects are created?
Ans: 1


3. How many Circle objects are craeted?
Ans: 1


4. How many Rectangle objects are craeted?
Ans: 1


6. For "s" object, from which class is method "toString" called?
Ans: Sahpe


7. For "c" object, from which class is method "toString" called?
Ans: Circle


8. For "r" object, from which class is method "toString" called?
Ans: Rectangle

9. In method "getString" from class "Circle",
   if you uncomment the commented line (line 48),
   can you still compile this program?
Ans: 
    can not complie


*/

