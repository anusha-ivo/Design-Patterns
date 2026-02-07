import java.util.Comparator;

public class Comparatorr2  {
    String name;
    int age;

    @Override
    public String toString() {
        return "Comparatorr2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    Comparatorr2(String name, int age){
        this.age=age;
        this.name=name;
    }

}
class Helper implements Comparator<Comparatorr2> {
    public int compare(Comparatorr2 c,Comparatorr2 c2){
        if(c.age>c2.age){
            return 1;
        } else if (c.age<c2.age) {
            return -1;

        }
        else
            return 0;
    }

}
