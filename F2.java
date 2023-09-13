import java.io.*;

public class F2 {
    public static void main(String[] args) throws IOException {
        String f1 = "a.txt";
        try{

            FileReader fr = new FileReader(f1);
            int k;
            while((k = fr.read()) != -1){
                System.out.print((char) k);
            }
            if(fr != null){
                fr.close();
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
