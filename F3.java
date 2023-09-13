import java.io.*;

public class F3 {
    public static void main(String[] args) {
        String filename = "a.txt";
        String outputfile = "Output.txt";
        try{
            FileReader fr = new FileReader(filename);
            FileWriter fw = new FileWriter(outputfile);
            int k;
            while((k = fr.read()) != -1){
                fw.write(k);
            }
            if(fr != null){
                fr.close();
            }
            if(fw != null){
                fw.close();
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
