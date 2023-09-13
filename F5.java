import java.io.*;

public class F5 {
    public static void main(String[] args) {
        int n, sum = 0, avg = 0;
        Console con = System.console();
        if(con == null){
            return;
        }
        n = Integer.parseInt(con.readLine("Enter the value of n(Number of elements): "));
        int k = n;
        while(n != 0){
            int number;
            number = Integer.parseInt(con.readLine("Enter number: "));
            sum += number;
            n--;
        }
        con.printf("Sum = " + sum);
        con.printf("Avg = " + sum/k);
    }    
}
