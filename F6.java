import java.io.*;

public class F6 {
    public static void main(String[] args) {
        Console con = System.console();
        if(con == null){
            return;
        }
        int number = Integer.parseInt(con.readLine("Enter a number: "));
        String isPrime = "Prime";
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                isPrime = "Not prime";
            }
        }
        con.printf("Number is " + isPrime);
    }
}
