class Student {
    // Fields (state)
    int rollNo;
    String name;
    double marks;

    // Method (behaviour)
    void display() {
        System.out.println("Roll: " + rollNo + " Name: " + name);
    }
}

public class test2 {
    public static void main(String[] args) {
        Student s1 = new Student(); // object creation
        s1.rollNo = 101;
        s1.name = "Arjun";
        s1.marks = 92.5;
        s1.display();
    }
}