/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class TestPolymorphism {
    public static void main(String[] args) {

        Object o = new Object();
        Person p = new Person();
        Student s = new Student();
        GraduateStudent g = new GraduateStudent();

        printClass(o);
        printClass(p);
        printClass(s);
        printClass(g);
    }

    static void printClass(Object x) {
        System.out.println( x );
        //System.out.println( x.toString() );
    }
}

class Person {
    public String toString() {
        return "Person";
    }
}

class Student extends Person {
    public String toString() {
        return "Student";
    }
}

class GraduateStudent extends Student {
}


/* Write output of the program

java.lang.Object@762efe5d
Person
Student
Student


*/


/* Answer the following questions
1. How many Object objects are created?
Ans: 4


2. How many Person objects are created?
Ans: 1


3. How many Student objects are created?
Ans: 1


4. How many GraduateStudent objects are created?
Ans: 1


5. On line 13, calling printClass(o), "toString" method from which class will be called?
Ans: Object


6. On line 14, calling printClass(p), "toString" method from which class will be called?
Ans: Person


7. On line 15, calling printClass(s), "toString" method from which class will be called?
Ans: Student


8. On line 16, calling printClass(g), "toString" method from which class will be called?
Ans: Student


*/

