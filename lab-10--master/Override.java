/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class Override {

    public static void main(String[] args) {
        Parent1 p = new Parent1();
        Child1 c = new Child1();

        p.print();
        c.print();
    }

}

class Parent1 {
    void print() {
        System.out.println("Parent1: " + this);
    }
}

class Child1 extends Parent1 {
    void print() {
        System.out.println("Child1 : " + this);
    }
}

