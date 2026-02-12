import java.time.LocalDate;
import java.time.LocalTime;

public class Customisetime {
    public static void main(String[] args){
        LocalTime l=LocalTime.now();
        System.out.println(l);
       int h= l.getHour();
        int m=l.getMinute();
        int n=l.getNano();
        int s=l.getSecond();
        System.out.printf("%d:%d:%d:%d",h,m,s,n);
    }
}