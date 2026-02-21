import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callexample {
    public static void main(String[] args)throws Exception{
        Myrun[] m={new Myrun(3),new Myrun(2)};
        ExecutorService e= Executors.newFixedThreadPool(4);
        for (Myrun m2:m) {
            Future f = e.submit(m2);

            System.out.println(f.get());
        }
        e.shutdown();

    }
}
class Myrun implements Callable{
    int num;
    Myrun(int num){
        this.num=num;
    }


    int sum=0;
    public Object call() throws Exception{
       for(int i=0;i<num;i++){
           sum=sum+i;
       }
       return sum;

    }
}