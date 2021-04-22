/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class TestInterface {

    public static void main(String[] args) {
        AA aa = new AA();
        BB bb = new BB();
        CC cc = new CC();

        aa.size();
        bb.size();
        cc.size();

        aa.shape();
        //bb.shape();
        cc.shape();

        //aa.color();
        bb.color();
        cc.color();

        System.out.println("aa is instance of Object : " + (aa instanceof Object));
        System.out.println("aa is instance of Base   : " + (aa instanceof Base));
        System.out.println("aa is instance of AA     : " + (aa instanceof AA));
        System.out.println("aa is instance of Size   : " + (aa instanceof Size));
        System.out.println("aa is instance of Color  : " + (aa instanceof Color));

        System.out.println("bb is instance of Object : " + (bb instanceof Object));
        System.out.println("bb is instance of Base   : " + (bb instanceof Base));
        System.out.println("bb is instance of BB     : " + (bb instanceof BB));
        System.out.println("bb is instance of Size   : " + (bb instanceof Size));
        System.out.println("bb is instance of Color  : " + (bb instanceof Color));

        System.out.println("cc is instance of Object : " + (cc instanceof Object));
        System.out.println("cc is instance of Base   : " + (cc instanceof Base));
        System.out.println("cc is instance of CC     : " + (cc instanceof CC));
        System.out.println("cc is instance of Size   : " + (cc instanceof Size));
        System.out.println("cc is instance of Color  : " + (cc instanceof Color));
    }

}

abstract class Base {

    protected abstract String shape();
}

interface Size {

    public abstract String size();
}

interface Color {

    public abstract String color();
}

class AA
        extends Base
        implements Size {

    @Override
    public String size() {
        return "S";
    }

    @Override
    protected String shape() {
        return "Square";
    }
}

class BB
        implements Size, Color {

    @Override
    public String size() {
        return "M";
    }

    @Override
    public String color() {
        return "Blue";
    }
}

class CC
        extends Base
        implements Size, Color {

    @Override
    protected String shape() {
        return "Circle";
    }

    @Override
    public String size() {
        return "M";
    }

    @Override
    public String color() {
        return "Cyan";
    }

}

/* Write output of the program

aa is instance of Object : true
aa is instance of Base   : true
aa is instance of AA     : true
aa is instance of Size   : true
aa is instance of Color  : false
bb is instance of Object : true
bb is instance of BB     : true
bb is instance of Size   : true
bb is instance of Color  : true
cc is instance of Object : true
cc is instance of Base   : true
cc is instance of CC     : true
cc is instance of Size   : true
cc is instance of Color  : true

 */

/* Answer the following questions.
1. On line 17, why method shape cannot be called?
Ans. BB not cub class in Base 



2. On line 20, why method color cannot be called?
Ans. AA not sub class in Colour



3. On line 31, if uncomment, what will be the compile error message?
Ans. Incompatible conditional operand types BB and Base



*/

