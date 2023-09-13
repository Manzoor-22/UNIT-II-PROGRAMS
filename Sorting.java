import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(3);
        al.add(1);
        al.add(6);
        for(int k : al){
            System.out.print(k);
        }
        System.out.println();
        Collections.sort(al);
        for(int k : al){
            System.out.print(k);
        }
    }
}
