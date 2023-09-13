import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;

public class Vctr {
    public static void main(String args[]){
        Vector<Integer> v = new Vector<>(5);
        v.add(1);
        v.add(2);
        v.add(3);
        Iterator<Integer> itr = v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Enumeration<Integer> e = v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

    }
}
