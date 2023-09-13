import java.util.*;

public class II {
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(3);
        al.add(5);
        al.add(7);
        ListIterator<Integer> itr = al.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }
}
