import java.lang.reflect.Array;
import java.util.Collection;

/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class MyArray {
    final static int LEFT = 1;
    final static int RIGHT = 2;
    String name;
    int[] mArray;

    /**
     * Initialize name and mArray fields
     *
     * @param name name for this MyArray object
     * @param size size of mArray to be created
     */
    MyArray(String name, int size) {
        this.name = name;
        mArray = new int[size];
    }

    @Override
    public String toString() {
        String s = name + "[] =";
        for (int i = 0; i < mArray.length; i++) {
            s = s + " " + mArray[i];
        }
        return s;
    }

    /**
     * Display contents of mArray to standard output
     */
    void print() {
        // call method toString implicitly with this
        System.out.println(this.toString());

        // or call method toString explicitly
        //System.out.println(this.toString());
    }

    /**
     * Modify all elements in mArray to contain random integers in range [0,12]
     */
    public void random() {
        int x ;
        for(int i=0;i< 10 ;i++){
            x = 0 + (int)(Math.random()*12);
            mArray[i] = x;
        }
        
    }


    /**
     * Circularly rotate element of mArray once, to either left or right
     *
     * @param direction direction to rotate, either LEFT or RIGHT
     */
    public void rotate(int direction) {
        int temp;
        if (direction == 1){
            for(int k = 0;k < 11;k++){
                temp = mArray[0];
                if(k == 0){
                    mArray[k] = mArray[k+1];
                    mArray[k] = temp;
                }
            }
        }
        else{
            temp = mArray[9];
			for(int n = 9;n>0 ;n--){
				mArray[n] = mArray[n-1];
			    mArray[n] = temp;
        }
    }
}

    public static void main(String[] args) {
        final int SIZE = 10;

        MyArray m;     // declare a reference for MyArray object

        m = new MyArray("a", SIZE);


        m.random();
        m.print();

        System.out.println("Rotate LEFT:");
        m.rotate(LEFT);
        m.print();

        System.out.println("Rotate RIGHT:");
        m.rotate(RIGHT);
        m.print();
    }
}

