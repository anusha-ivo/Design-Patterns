import java.util.ArrayList;
import java.util.stream.Stream;

public class Flatmap {
    public static void main(String[] args){
        ArrayList a=new ArrayList();
        a.add(23);
        a.add(43);
        ArrayList a2=new ArrayList();
        a2.add("45");
        a2.add(90);
        ArrayList a3=new ArrayList();
        a3.add(a);
        a3.add(a2);
        System.out.println(a3);
        Stream sf = a3.stream().flatMap(x->((ArrayList)x).stream());
        sf.forEach(System.out::println);

    }
}
