import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
//import com.sun.tools.javac.code.Attribute.Array;

/**
 * Javatut2
 */
public class Javatut2 {
    //Generics : It allows us to use operation on any type or object
   public static void main(String[] args) {
    String [] gA1 = {"one","two"};
    Integer[] gA2 = {1,2,3,4};
    printStuff(gA1);
    printStuff(gA2);
    ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(1,2,3,4));
    printAL(al1);

    myGeneric<Integer> myGI = new myGeneric<Integer>();
    myGI.setVal(10);
    System.out.println(myGI.getVal());

    myGeneric<String> myGs = new myGeneric<String>();
    myGs.setVal("Cats");
    System.out.println(myGs.getVal());

   }

    public static <E> void printStuff(E[] arr)
    {
        for (E x : arr) {
            System.out.println(x);
        }
    }


    //it prints anytype of arraylist
    public static void printAL(ArrayList<?> aL)
    {
        for(Object x: aL)
        System.out.println(x); 
    }

}

//A generic class
class myGeneric<T>
{
    T val;
    public void setVal(T val){
        this.val = val ;
    }

    public T getVal()
    {
        return val;
    }

}