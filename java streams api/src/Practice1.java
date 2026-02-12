import java.util.stream.Stream;

public class Practice1 {
    public static void main(String[] args){
      Stream s = Stream.of("anu","kavt",34);
      s.forEach(System.out::println);
      Stream sg =Stream.generate(Math::random);
      sg.limit(23).forEach(System.out::println);
      Stream si =Stream.iterate(2, n->n+2);
      si.limit(6).forEach(System.out::println);
    }
}
