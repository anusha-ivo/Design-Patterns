import java.util.stream.Stream;

public class Streamcreation {
    public static void main(String[] args){
        Stream s=Stream.of(1,2,"anu",40.67);
        s.forEach(System.out::println);
        Stream sg =Stream.generate(()->Math.random());
        sg.limit(23).forEach(System.out::println);
        Stream si =Stream.iterate(2,  n->n+1);
        si.limit(5).forEach(System.out::println);

    }
}
