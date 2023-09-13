import java.util.*;

public class SS {
    public static void main(String[] args) {
        SortedSet<Integer> ss = new TreeSet<>();
        ss.add(1);
        ss.add(8);
        ss.add(3);
        for(int k : ss){
            System.out.println(k);
        }
    }
}
