import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.sun.tools.javac.code.Attribute.Array;

// import com.sun.tools.javac.util.List;
import java.util.*;
 /**
 * callclass
 */
 
 public class callclass { 
    public static void main(String[] args) {
        List<Integer> oneToten =  IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
        //Stream allows to groups of  objects so we can aggregate them
        //
        List<Integer> squares  = oneToten.stream().map(x -> x*x).collect(Collectors.toList()); 
       //Map takes in the input of each value inside one to ten and use it.
        for (int x : squares) {
             System.out.println(x);
        }    

        //filter that we use to eliminate values unlike map
        //We showcase the even values below.
        List<Integer> evens = oneToten.stream().filter(x ->(x%2) == 0).collect(Collectors.toList());
        for (int x : evens) {
            System.out.println(x);
        }

        //to limit our stream to 5
        IntStream limit5 = IntStream.range(1, 10).limit(5);
        limit5.forEach(System.out::println);

        //reduce to multiply or use an operation over and over.
        int mulAll = IntStream.range(1, 5).reduce(1, (x,y)->x*y);
        System.out.println(mulAll);

        //Coverting int into doublestream

        DoubleStream<IntSummaryStatistics> stream = IntStream.range(1, 10).mapToDouble(i -> i);
        //Using Summary statistics.
        IntSummaryStatistics istats = IntStream.range(1, 10).summaryStatistics();
        System.out.println(istats.getAverage());
        System.out.println(istats.getMax());
        System.out.println(istats.getMin());
        System.out.println(istats.getSum());
        System.out.println(istats.getCount());


        ArrayList<Integer> oneTo5 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        oneTo5.forEach(x -> System.out.println(x * 2));
        oneTo5.forEach(x -> {if(x%2 == 0)System.out.println(x); });

        List<Integer> fib = new LinkedList<Integer>();

        //iterate will create a stram of iteration.
        //limit is used to limit ourresult to 10
        //map is going to store the reult into the list
        //collect will collect them into a container
        fib = Stream.iterate(new int[] {0,1}, t -> new int[]{t[1],t[0]+t[1]}).limit(10).map(n -> n[0]).collect(Collectors.toList());
        fib.foreach(x -> System.out.println(x)); 

    
            
        }








        
    }
}