import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        Helper h=new Helper();
        Helper2 h2=new Helper2();
        Comparatorr c=new Comparatorr("anu",12);
        Comparatorr c2=new Comparatorr("abhi",20);
        a.add(c);
        a.add(c2);
        Collections.sort(a,h);
        System.out.println(a);
        Collections.sort(a,h2);
        System.out.println(a);


    }
}