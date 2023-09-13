import java.util.*;

public class CC {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Date = " + c.get(Calendar.DATE));
        System.out.println("Time = " + c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
    }
}
