class Student { 
    private int rollNo; 
    private String name; 

    public Student(int r, String n) { 
        rollNo = r; 
        name = n; 
    } 

    public void show() { 
        System.out.println("Roll: " + rollNo + " | Name: " + name); 
    } 
}

public class packages {
    public static void main(String[] args) {
        Student student1 = new Student(93, "Your Name");
        student1.show();
    }
}
