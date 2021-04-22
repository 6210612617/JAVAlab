/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class TestOverrideAndOverload {
    public static void main(String[] args) {
        AA aa = new AA();
        BB bb = new BB();
        CC cc = new CC();
        DD dd = new DD();

        aa.print();
        bb.print();
        cc.print();
        dd.print();
        System.out.println();

        aa.print("Hello");
        bb.print("Hello");
        cc.print("Hello");
        dd.print("Hello");
    }

}

class AA {
    void print() {
        System.out.println(this.getClass());
    }

    void print(String s) {
        System.out.println(this.getClass() + " " + s);
    }
}

class BB {
    void print() {
        System.out.println(this.getClass());
    }

    void print(String s) {
        System.out.println(this.getClass() + " " + s);
    }
}

class CC extends AA {
    void print() {
        System.out.println("C1");
    }

    void print(String s) {
        System.out.println("C1 " + s);
    }
}

class DD extends BB {
    void print() {
        System.out.println(this.getClass());
    }
}

/* Write output of the program

class AA
class BB
C1
class DD

class AA Hello
class BB Hello
C1 Hello
class DD Hello


*/


/* Answer the following questions.
1. How many Object objects are created?
Ans: 4


2. In class "AA",  is method "print" overloaded?
Ans: bo


3. In class "BB",  is method "print" overloaded?
Ans: no


4. In class "CC",  is method "print" overloaded?
Ans: yes


5. In class "DD",  is method "print" overloaded?
Ans: no


6. In class "BB",  does method "print()" override method print in class "AA"?
Ans: no


7. In class "CC",  does method "print()" override method print in class "AA"?
Ans: yes


8. In class "DD",  does method "print()" override method print in class "AA"?
Ans: no


9. In class "CC",  does method "print()" override method print in class "BB"?
Ans: no


10. In class "DD",  does method "print()" override method print in class "BB"?
Ans: no


11. In class "DD",  does method "print()" override method print in class "CC"?
Ans: no


*/

