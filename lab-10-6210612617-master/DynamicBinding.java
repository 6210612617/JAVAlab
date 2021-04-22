/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class DynamicBinding {
    static void printClass(AAA aaa) {
        aaa.print();
    }

    public static void main(String[] args) {
        AAA aaa = new AAA();
        BBB bbb = new BBB();
        CCC ccc = new CCC();

        printClass(aaa);
        printClass(bbb);
        printClass(ccc);
    }
}

class AAA {
    void print() {
        System.out.println("AAA");
    }
}

class BBB extends AAA {
    void print() {
        System.out.println("BBB");
    }
}

class CCC extends BBB {
    void print() {
        System.out.println("CCC");
    }
}

