import java.util.Comparator;
import java.util.Objects;
import java.util.TreeMap;

public class Treemapexample {
    public static void main(String[] args){
        TreeMap t=new TreeMap(new Comparator<Object>(){
            public int compare(Object o1,Object o2){
                return o1.toString().compareTo(o2.toString());
            }
        }
        );
        t.put(1,"hi");
        t.put(5,23);
        t.put("hii",54);
        t.put(2,"null");
        t.put("null",65);
        t.put("null",60);
        t.put(1,"null");
        System.out.println(t);

    }
}
