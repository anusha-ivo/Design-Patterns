public class Employe implements Cloneable{
    private String name;
    private int age;
    private String dpt;
    Employe(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setDpt(String dpt){
        this.dpt=dpt;
    }
    public  Employe clone(){
        try{
            return (Employe) super.clone();
        } catch (CloneNotSupportedException e) {

        }
        return null;
    }
    public void show(){
        System.out.println(name+""+age+""+dpt);
    }

}
