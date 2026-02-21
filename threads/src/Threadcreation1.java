public class Threadcreation1 {

    public static void main(String[] args)throws Exception{
       // Thread n=Thread.currentThread();
        Myclass.mt=Thread.currentThread();
         Myclass m=new Myclass();
        m.start();
        Thread.sleep(3000);
        //Thread.yield();
        //m.join();



       // Thread.sleep(200);
        for(int i=0;i<=4;i++){
            System.out.println("this is by main thread");
        }

    }
}
class Myclass extends Thread{
    static Thread mt;
   /* Thread n;
    Myclass(Thread n){
        this.n=n;
    }

    */
    public void run(){
        try {
            mt.join();
        } catch (InterruptedException e) {

        }

        for(int i=0;i<4;i++){
            System.out.println("this is by child thread using join ");
        }
    }
}