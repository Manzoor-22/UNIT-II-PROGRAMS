import java.io.*;

public class Copy2 {
    public static void main(String args[]){
        try{
            FileInputStream fis = new FileInputStream("a.txt");
            FileOutputStream fos = new FileOutputStream("c.txt");
            int k;
            while((k = fis.read()) != -1){
                char c = (char) k;
                if(Character.isLowerCase(c)){
                    c = Character.toUpperCase(c);
                }
                else{
                    c = Character.toLowerCase(c);
                }
                fos.write(c);
            }
            fos.close();
            fis.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
