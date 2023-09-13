import java.util.*;

class Student{
    int rollno;
    String name;
    Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }
    public String showName(){
        return name;
    }
    public int showRollNo(){
        return rollno;
    }
}

public class Comp {
    public static void main(String[] args) {
        List<Student> al = new ArrayList<>();
        al.add(new Student(25, "Manzoor"));
        al.add(new Student(15, "Faheem"));
        al.add(new Student(48, "Kareem"));

        for(Student s : al){
            System.out.println(s.showName() + " " + s.showRollNo());
        }

        Comparator<Student> cmp = (s1, s2) -> Integer.compare(s1.showRollNo(), s2.showRollNo());

        Collections.sort(al, cmp);

        for(Student s : al){
            System.out.println(s.showName() + " " + s.showRollNo());
        }
    }
}
