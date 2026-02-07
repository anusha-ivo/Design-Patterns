public class Comparable2 implements Comparable<Comparable2>{
    String name;
    int age;

    @Override
    public String toString() {
        return "Comparable2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    Comparable2(String name, int age){
        this.name=name;
        this.age=age;
    }
    public int compareTo(Comparable2 c){
        if(c.name.equals(this.name)){
            return c.age-this.age;
        }
     return this.age-c.age;
    }

}
