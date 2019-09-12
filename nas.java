// import com.sun.tools.javac.code.Attribute.Array;
// import com.sun.tools.javac.util.List; 

import java.util.*;/**
 * nas
 */
public class nas {
   
    public static int sums(int ... nums) {
        int sum =0;
        for (int x:nums) {
            sum += x;
        }
        return sum;
    }
    
   static List<Object> getRandList()
    {
        String name = "Abdul";
        int age = 20;
        return Arrays.asList(name,age);
    }
    public static void main(String[] args) 
    {     
        System.out.println("Sum is "+ sums(2,3,4,5));
        List<Object> randList = getRandList();
        System.out.println(randList);
    }
    
} 