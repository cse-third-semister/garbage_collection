import java.util.ArrayList;
import java.util.List;

class Student {
   String name;
    private int id;
    private String course;

    public Student(String name, int id, String c) {
        this.name = name;
        this.id = id;
        this.course = c;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Student " + name + " (ID: " + id + ") has been garbage collected.");
    }
   
}

public class q7 {
    public static void main(String[] args) {
        // Creating some students
        Student student1 = new Student("Alice", 1001, "Math");
        Student student2 = new Student("Bob", 1002, "Odia");
     
      

        // Garbage collection
        student1 = null;
        student2 = null;
        System.gc();
    }
    
}
