public class Prototypecls implements Cloneable{
    String name;
    int age;
    Prototypecls(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public Prototypecls clone(){
        try{
            return (Prototypecls) super.clone();
        } catch (CloneNotSupportedException e) {

        }
        return null;
    }
    public void show(){
        System.out.println(name+"  "+age);
    }
}
