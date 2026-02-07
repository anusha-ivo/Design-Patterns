public class Comparablecls implements Comparable<Comparablecls> {
    String name;
    int age;

    Comparablecls(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Comparablecls{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int compareTo(Comparablecls c) {
       if(this.age==c.age){
           return (this.name.compareTo(c.name));
       } else if (this.age>c.age) {
           return -1;

       }
       else
           return 1;

    }

    }

