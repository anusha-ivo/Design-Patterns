import java.time.LocalDateTime;

public class local1 {
    public static void main(String[] args){
        LocalDateTime l=LocalDateTime.of(1992,2,28,12,45);
        System.out.println(l);
            System.out.println("after 6 months :"+l.plusMonths(6));
            System.out.println("before 7 months: "+l.minusMonths(7));



    }
}
