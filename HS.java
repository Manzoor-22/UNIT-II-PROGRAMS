import java.util.*;

public class HS {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();
        hs.add(5);
        hs.add(3);
        hs.add(3);
        hs.add(8);
        hs.add(1);
        hs.add(11);
        Iterator<Integer> itr = hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
