import java.util.concurrent.CountDownLatch;

public class Countdownlatch {
    public static void main(String[] args)throws Exception{
        CountDownLatch l=new CountDownLatch(1);
        for(int i=1;i<=3;i++){
            Mycount m=new Mycount(l);
            m.start();

        }
        Thread.sleep(20);
        l.await();
        System.out.println("main thread waiting complete after coundown reaches to 0");
    }
}
class Mycount extends Thread {
    CountDownLatch l;
    Mycount(CountDownLatch l){
        this.l=l;
    }
    public void run(){
        try{
            System.out.println("decreasing bount by "+Thread.currentThread().getName());

        } catch (Exception e) {

        }
        finally {
            l.countDown();
        }
    }

}