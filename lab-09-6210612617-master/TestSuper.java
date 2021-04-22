/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class TestSuper {

    public static void main(String[] args) {

        System.out.println("Create AA object:");
        AA aa = new AA();
        System.out.println();

        System.out.println("Create BB object:");
        BB bb = new BB();
        System.out.println();

        System.out.println("Create CC object:");
        CC cc = new CC();
        System.out.println();

        System.out.println("Create DD object:");
        DD dd = new DD();
        System.out.println();

        System.out.println("Create DDDD object:");
        DDDD dddd = new DDDD();
        System.out.println();
    }

}

class AA {

    AA() {
        System.out.println("In AA()");
    }
}

class BB extends AA {

    BB() {
        System.out.println("In BB()");
    }
}

class CC extends BB {

    CC() {
        System.out.println("In CC()");
    }
}

class DD extends CC {

    DD() {
        super();
        System.out.println("In DD()");
    }
}

class DDDD extends CC {

    DDDD() {
        System.out.println("In DDDD()");
    }
}
/* Write output of the program.

Create AA object:
In AA()

Create BB object:
In AA()
In BB()

Create CC object:
In AA()
In BB()
In CC()

Create DD object:
In AA()
In BB()
In CC()
In DD()

Create DDDD object:
In AA()
In BB()
In CC()
In DDDD()

 */


/* Answer the following questions.
 1. When object AA is created, which constructor(s) is (are) called? In what order?
 Ans. 
    AA


 2. When object BB is created, which constructor(s) is (are) called? In what order?
 Ans.
   BB AA

 3. When object CC is created, which constructor(s) is (are) called? In what order?
 Ans.
    CC BB AA

 4. When object DD is created, which constructor(s) is (are) called? In what order?
 Ans. 
    DD CC BB AA


 5. When object DDDD is created, which constructor(s) is (are) called? In what order?
 Ans.
    DDDD DD BB AA

 */

