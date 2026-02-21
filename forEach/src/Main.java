import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(23);
        a.add("anu");
        a.forEach(System.out::println);
        a.forEach(a1->System.out.println(a));

    }
}