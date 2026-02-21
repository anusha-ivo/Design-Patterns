import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpools {
    public static void main(String[] args){
        Myexecutors[] m={new Myexecutors("anu"),new Myexecutors("abhi"),new Myexecutors("kav"),new Myexecutors("dhanu")};
        ExecutorService service= Executors.newFixedThreadPool(4);
        for(Myexecutors m2:m){
            service.submit(m2);

        }
        service.shutdown();

    }
}
class Myexecutors extends Thread{
    String name;
    Myexecutors(String name){
        this.name=name;
    }
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName()+"executing task");
        } catch (Exception e) {

        }
    }
}
