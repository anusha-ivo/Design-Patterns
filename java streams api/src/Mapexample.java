import java.util.ArrayList;
import java.util.stream.Stream;

public class Mapexample {
    public static void main(String[] args){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(23);
        a.add(25);
        Stream s =a.stream().map(i->i*2);
        s.forEach(System.out::println);

    }
}
