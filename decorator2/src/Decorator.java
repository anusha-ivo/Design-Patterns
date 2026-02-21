public class Decorator implements Dress{
     Dress d;
    Decorator(Dress d){
        this.d=d;
    }
    public boolean wear(){
        System.out.println("noramal dress");
        return false;
    }

}
