import java.time.LocalDate;

public class CustomiseLocaddate {
    public static void main(String[] args){
        LocalDate l=LocalDate.now();
        System.out.println(l);
        int d = l.getDayOfMonth();
      int mm =l.getMonthValue();
      int y  =l.getYear();
      System.out.printf("%d-%d-%d",d,mm,y);
    }
}
