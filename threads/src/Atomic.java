import java.util.concurrent.atomic.AtomicInteger;

public class Atomic {
    public static void main(String[] args)throws Exception{
        Myatomic m=new Myatomic();
        Thread t=new Thread(m);
        Thread t2=new Thread(m);
        t.start();
        t2.start();
        t.join();
        t2.join();
        System.out.println(m.a.get());


    }
}
class Myatomic implements Runnable{
    AtomicInteger a=new AtomicInteger(0);
    public void run(){
        for(int i=0;i<=1000;i++){
            a.incrementAndGet();
        }
    }
}
