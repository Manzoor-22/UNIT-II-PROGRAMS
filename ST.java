import java.util.*;

public class ST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string seperated by ',': ");
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s, ",");
        int sum = 0;
        while(st.hasMoreTokens()){
            sum += Integer.parseInt(st.nextToken());
        }
        System.out.println(sum);
    }
}
