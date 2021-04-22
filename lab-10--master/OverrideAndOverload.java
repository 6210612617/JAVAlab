/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class OverrideAndOverload {
    public static void main(String[] args) {
        Parent3 p = new Parent3();
        Child3 c = new Child3();

        p.print();
        c.print();

        p.print("Hello");
        c.print("Hello");
    }
}

class Parent3 {

    void print() {
        System.out.println("Parent3: " + this);
    }

    void print(String s) {
        System.out.println("Parent3: " + s);
    }
}

class Child3 extends Parent3 {

    void print() {
        System.out.println("Child3 : " + this);
    }

    void print(String s) {
        System.out.println("Child3 : " + s);
    }
}

