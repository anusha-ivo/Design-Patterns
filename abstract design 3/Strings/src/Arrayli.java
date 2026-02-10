import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class Arrayli {
    public static void main(String[] args){
        ArrayList a=new ArrayList();
        a.add(0,"ANU");
        a.add(0,"kavy");
        Iterator i=a.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println(a);
    }
}
