import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        Comparablecls c=new Comparablecls("shrav",90);
        Comparablecls c2=new Comparablecls("kav",90);
        a.add(c);
        a.add(c2);
        Collections.sort(a);
        System.out.println(a);


    }
}