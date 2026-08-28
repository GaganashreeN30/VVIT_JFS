public class Student {

    String name;

    void study() {
        System.out.println("Student is studying");
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.study();
    }
}