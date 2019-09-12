import java.util.*;

public class javtut {
    public static int sums(int ... nums) {  //Finding sums using Different types of Parameters
        int sum =0;
        for (int x:nums) {
            sum += x;
        }
        return sum;
    }
    
   static List<Object> getRandList()  //Making use of Lists(Used for returning values of different datatypes)
    {
        String name = "Abdul";
        int age = 20;
        return Arrays.asList(name,age);
    }

    static int Factorial(int n){        //Finding Factorials using recursion
         if (n == 1)
         {
             return 1;
         }
         else
         {
              int result = n * Factorial(n -1);//recursion method
              return result;
         }
    }

    
    public static void main(String[] args) 
    {     
        System.out.println("Sum is "+ sums(2,3,4,5)); //Result for the method Sums
        List<Object> randList = getRandList(); //result for the method getRandlist
        System.out.println(randList);

        System.out.println("The factorial of 5 is "+ Factorial(5));//Output of the factorial 5
    }
    
} 