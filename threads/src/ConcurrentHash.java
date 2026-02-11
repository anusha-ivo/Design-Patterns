import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHash {
     static ConcurrentHashMap c=new ConcurrentHashMap();
    public static void main(String[] args)throws Exception{
        c.put(1,"anu");
        c.put(2,"abhi");
        c.put("null",9);//string
        c.put(null,0);//null is not allowed
        Myconcurrent m=new Myconcurrent();
        m.start();
        m.join();
        System.out.println(c);


    }
}
class Myconcurrent extends Thread
{
    public void run(){
        ConcurrentHash.c.put(4,"dhanu");

    }
}