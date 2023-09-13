import java.io.*;
import java.util.*;

public class F7 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader("a.txt"));
            String data;
            while((data = br.readLine()) != null){
                l.add(data);
            }
        }
        catch (IOException e){
            System.out.println(e);
        }
        finally{
            int n = 2;
            for(int i = n; i < l.size(); i++){
                System.out.println(l.get(i));
            }
        }
    }
}
