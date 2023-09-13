import java.io.*;

public class FH {
    public static void main(String[] args) {
        try{
            String data = "WELCOME";
            String fname = "Demo.txt";
            FileWriter fw = new FileWriter(fname);
            fw.write(data);
            if(fw != null)
                fw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
