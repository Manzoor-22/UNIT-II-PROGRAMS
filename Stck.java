import java.util.*;

public class Stck {
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        Iterator<Integer> itr = s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
