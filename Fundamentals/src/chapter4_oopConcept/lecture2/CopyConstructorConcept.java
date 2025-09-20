package chapter4_oopConcept.lecture2;

class Student{
    private int id;
    private String name;
    private float cgpa;
    public Student(int id, String name, float cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public Student(Student student){        //copying a constructor
        this.id = student.id;
        this.name = student.name;
        this.cgpa = student.cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}

public class CopyConstructorConcept {
    public static void main(String[] args) {
        Student s1 = new Student(10, "razu", 3.42f);
        Student s2 = new Student(20, "hasan", 3.32f);

        Student s3 = new Student(s1);       // Copy Constructor

        System.out.println(s1 + "  hashcode: " + s1.hashCode());
        System.out.println(s2 + " hashcode: " + s2.hashCode());
        System.out.println(s3 + "  hashcode: " + s3.hashCode());

    }
}
