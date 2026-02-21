public class Destructorss {
    public static void main(String[] args){
        Garbage g=new Garbage();
        g=null;
        System.gc();

    }

}
class Garbage{
    public void finalize(){
        System.out.println("this is garbage collector");
    }
}
