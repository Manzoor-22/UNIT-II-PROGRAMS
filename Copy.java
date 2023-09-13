import java.io.*;

public class Copy {
    public static void main(String args[]){
        try{
            FileInputStream fis = new FileInputStream("a.txt");
            FileOutputStream fos = new FileOutputStream("b.txt");
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
