package design_pattern.creational_design_pattern.$2__prototype_design_pattern;

class Student implements Cloneable {
    private String name;
    private int age;
    private int id;

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}




public class Main {
    static void main() throws CloneNotSupportedException {
        Student student1 = new Student("Razu", 26, 101);
        Student student2 = student1.clone();


        System.out.println("Prototype: Different Hash Code");
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

    }
}
