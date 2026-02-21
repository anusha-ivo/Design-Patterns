import java.util.ArrayList;
import java.util.stream.Stream;

public class Filters {
    public static void main(String[] args){
        ArrayList<String> a=new ArrayList<>();
        a.add("kav");
        a.add("anu");
       // a.add(56);
        Stream s =a.stream();
        s.forEach(System.out::println);
        Stream s2 =a.stream().filter(name->name.startsWith("k"));
        s2.forEach(System.out::println);
    }
}
