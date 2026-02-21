import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class HashMapexample {
    public static void main(String[] args){
        HashMap h=new HashMap();
        h.put("anu",22   );
       h.put(1,"anu");
       h.put(2,"dhanu");
       h.put(4,"syk");
       String s2=(String) h.put(1,"dhanu");
       System.out.println(h.get(1));
       System.out.println(s2);
       System.out.println(h);
       System.out.println(h.containsValue("anu"));
       System.out.println(h.containsValue("dhanu"));
       System.out.println(h.containsKey(1));
       Set s=h.keySet();
       System.out.println(s);
        Collection c=h.values();
        System.out.println(c);
        Set sk=h.entrySet();
        System.out.println(sk);



    }
}
