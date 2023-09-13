import java.util.*;

public class GregCal {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc);
        System.out.println(gc.getTime());
        System.out.println(gc.get(GregorianCalendar.HOUR));
    }
}
