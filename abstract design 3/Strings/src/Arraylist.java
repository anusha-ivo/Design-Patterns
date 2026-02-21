import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
    public static void main(String[] args){

        ArrayList a=new ArrayList();
        a.add("anusha");
        a.add(23);
        System.out.println(a);
        Iterator i=a.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}
