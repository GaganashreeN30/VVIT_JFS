class Student {
    String name;
}

public class MultipleObjects {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Gagana";
        student2.name = "Chandu";

        System.out.println(student1.name);
        System.out.println(student2.name);
    }
}