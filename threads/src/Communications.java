public class Communications {
    public static void main(String[] args)throws Exception{
        Mycomm m=new Mycomm();
        m.start();
        synchronized (m){
            m.wait();
        }
        System.out.println(m.sum);



    }
}
class Mycomm extends Thread {
    int sum=0;
    public void run(){
        synchronized (this){
            for(int i=0;i<10;i++){
                sum=sum+i;
            }
           this.notify();

        }
    }

}