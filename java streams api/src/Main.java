import java.util.ArrayList;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add("anu");
        a.add(34);
        a.add("kavya");
        System.out.println(a);
       Stream s1 =a.stream();
       s1.forEach(System.out::println);
      Stream s2 =a.parallelStream();
      s2.forEach(System.out::println);




    }
}