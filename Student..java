public class Student {
    String name;
    int marks;

    // Constructor
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Display student info
    public void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
}
