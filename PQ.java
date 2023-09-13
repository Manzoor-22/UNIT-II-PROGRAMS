import java.util.*;

public class PQ {
    public static void main(String args[]){
        Queue<Integer> q = new PriorityQueue<>();
        q.add(5);
        q.add(3);
        q.add(1);
        Iterator<Integer> itr = q.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
