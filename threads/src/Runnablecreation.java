public class Runnablecreation {
    public static void main(String[] args){
        Myrunnable m=new Myrunnable();
        Myrunnable m2=new Myrunnable();
        Thread t=new Thread(m,"t1");
        t.start();
        Thread t2=new Thread(m,"t2");
        t2.start();


    }
}
class Myrunnable implements Runnable{
    public void run () {
        show();

    }public static synchronized void show(){
            for (int i = 0; i < 4; i++) {
                System.out.println("this is by child thread " + Thread.currentThread().getName());
            }

        }
    }


