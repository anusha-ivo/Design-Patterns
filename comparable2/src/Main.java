import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        Comparable2 c=new Comparable2("anu",34);
        Comparable2 c2=new Comparable2("kav",13);
        a.add(c);
        a.add(c2);
        Collections.sort(a);
        System.out.println(a);

    }
}