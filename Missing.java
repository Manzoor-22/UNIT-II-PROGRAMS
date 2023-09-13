import java.util.*;

public class Missing {
    public static void main(String args[])    {

    }

    public int firstMissingPositive(int[] nums) {
        Queue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 1)
                continue;
            pq.add(nums[i]);
        }
        return pq.peek();
    }
}
