import java.util.Comparator;

public class Comparatorr {
    String name;
    int age;

    public Comparatorr(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Comparatorr{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class Helper implements Comparator<Comparatorr> {
    public int compare(Comparatorr c,Comparatorr c2){
        if(c.age>c2.age){
            return 1;
        } else if (c.age<c2.age) {
            return -1;

        }
        else
            return 0;
    }


}
class Helper2 implements Comparator<Comparatorr>{
    public int compare(Comparatorr c1,Comparatorr c2){
         return (c1.name.compareTo(c2.name));
    }
}
