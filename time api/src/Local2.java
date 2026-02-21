import java.time.LocalDateTime;

public class Local2 {
    public static void main(String[] args){
        LocalDateTime l=LocalDateTime.now();
        System.out.println(l);
       int d= l.getDayOfMonth();
       int m= l.getMonthValue();
       int y= l.getYear();
      int h= l.getHour();
      int s =l.getSecond();
       int n=l.getNano();
       System.out.printf("%d-%d-%d-%d-%d-%d",d,m,y,h,s,n);
       LocalDateTime l2=LocalDateTime.of(2022,12,13,2,32);
    }
}
