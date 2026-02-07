import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        Comparatorr2 c=new Comparatorr2("anu",23);
        Comparatorr2 c2=new Comparatorr2("kav",34);
        a.add(c);
        a.add(c2);
        //Collections.sort(a);
       // System.out.println(a);
        Helper h=new Helper();
        Collections.sort(a,h);
        System.out.println(a);


    }
}