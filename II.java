import java.util.*;

public class II {
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(3);
        al.add(5);
        al.add(7);
        Iterator<Integer> itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
