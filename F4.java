import java.io.*;

public class F4 {
    public static void main(String[] args) {
        String data;
        Console con = System.console();
        if(con == null)
            return;
        data = con.readLine("Enter a string: ");
        con.printf(data);
    }
}
