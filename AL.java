import java.util.*;

public class AL {
    public static void main(String args[]){
        List<List<Integer>> al = new ArrayList<>();
        al.add(new ArrayList<>(List.of(1,3)));
        al.add(new ArrayList<>(List.of(6,8)));

        for(int i = 0; i < al.size(); i++){
            System.out.println(al.get(i).get(0));
            System.out.println(al.get(i).get(1));
        }
    }
}
