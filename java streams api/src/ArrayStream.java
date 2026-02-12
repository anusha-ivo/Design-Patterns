import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ArrayStream {
    public static void main(String[] args){
        int [] a={10,30,45};
        IntStream s1 =Arrays.stream(a);
        s1.forEach(System.out::println);
        String[] s={"anu","abhi","sneha"};
        Stream s2 = Arrays.stream(s);
        s2.forEach(System.out::println);
        long[] la={1l,2l,3l};
       LongStream sl =Arrays.stream(la);
       sl.forEach(System.out::println);
       double[] ad={2.4d,4.5d};
     DoubleStream sd =Arrays.stream(ad);
     sd.forEach(System.out::println);


    }
}
