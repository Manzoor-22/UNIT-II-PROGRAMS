import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        try{
            String data = "WELCOME";
            FileWriter fos = new FileWriter("Output.txt");
            fos.write(data);
            if(fos != null){
                fos.close();
            }
        }
        catch(IOException e){
            e.getStackTrace();
        }
    }
}
