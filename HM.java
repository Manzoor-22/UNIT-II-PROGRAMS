import java.util.*;

public class HM {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(1, "One");
        m.put(2, "Two");
        m.put(3, "Three");
        for(Map.Entry<Integer, String> k : m.entrySet()){
            System.out.println(k.getKey() + " " + k.getValue());
        }
    }
}
