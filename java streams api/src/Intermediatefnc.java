import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class Intermediatefnc {
    public static void main(String[] args){
        ArrayList a=new ArrayList();
        a.add(23);
        a.add(12);
        a.add(56);
        a.add(57);
        a.add(56);
       Stream s = a.stream().distinct();
       s.forEach(System.out::println);
       Stream s2=a.stream().sorted();
       s2.forEach(System.out::println);
       Stream s3=a.stream().sorted(Comparator.reverseOrder());
       s3.forEach(System.out::println);



    }
}
