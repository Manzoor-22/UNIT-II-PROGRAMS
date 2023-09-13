import java.io.*;

public class F1 {
    public static void main(String[] args) {
        String f1 = "a.txt";
        String f2 = "Output.txt";
        try{
            FileInputStream fis = new FileInputStream(f1);
            FileOutputStream fos = new FileOutputStream(f2);

            int c;
            while((c = fis.read()) != -1){
                fos.write(c);
            }

            if(fis != null) 
                fis.close();
            if(fos != null)
                fos.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
