import java.io.File;

public class Fileex {
    public static void main(String[] args) {
        File fobj = new File("c.txt");
        System.out.println(fobj.getName());
        System.out.println(fobj.getPath());
        System.out.println(fobj.getAbsolutePath());
        System.out.println(fobj.canRead());
        System.out.println(fobj.canWrite());
        System.out.println(fobj.length());
    }
}
