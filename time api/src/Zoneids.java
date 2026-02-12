import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Zoneids {
    public static void main(String[] args){
        ZoneId z=ZoneId.systemDefault();
        System.out.println(z);
        ZoneId z2=ZoneId.of("America/Los_Angeles");
        System.out.println(z2);
        ZonedDateTime zt=ZonedDateTime.now(z2);
        System.out.println(zt);
    }
}
