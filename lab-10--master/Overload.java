/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class Overload {

    public static void main(String[] args) {
        Parent2 p = new Parent2();
        Child2 c = new Child2();

        p.print();
        c.print();

        p.print("Hello");
        c.print("Hello");
    }

}

class Parent2 {

    void print() {
        System.out.println("Parent2: " + this);
    }

    void print(String s) {
        System.out.println("Parent2: " + s);
    }
}

class Child2 {

    void print() {
        System.out.println("Child2 : " + this);
    }

    void print(String s) {
        System.out.println("Child2 : " + s);
    }
}

