import java.util.concurrent.Semaphore;

public class Semaphoresexample {
    public static void main(String[] args){
        Semaphore s=new Semaphore(2);
        for(int i=0;i<4;i++){
            Mysemaphore m=new Mysemaphore(s);
            m.start();
        }
        System.out.println("main thread started");

    }
}
class Mysemaphore extends Thread{
    Semaphore s;
    Mysemaphore(Semaphore s){
        this.s=s;
    }
    public void run() {
        try{
            s.acquire();
            System.out.println(Thread.currentThread().getName()+"acquired lock");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+"release lock");;
        } catch (InterruptedException e) {

        }
        finally {
            s.release();



        }
    }

}
