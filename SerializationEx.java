import java.io.*;

class Student implements Serializable {
    String name;
    int rollno;
}

public class SerializationEx {
    public static void main(String args[]) {
        Student s = new Student();
        s.name = "A";
        s.rollno = 45;
        String filename = "output.txt";
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s);
            System.out.println("Object saved!");
            oos.close();
            fos.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}