package chapter4_oopConcept.lecture8;

import java.io.*;


public class SerializablePractice01 {
    public static void main(String[] args) throws IOException {
        Student student = new Student(101, "Razu", 3.42f);
        // Serialize
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/chapter4/lecture8/saveHere.ser"));
        objectOutputStream.writeObject(student);
        objectOutputStream.close();
    }
}
class DeserializablePractice{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // DeSerialize
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/chapter4/lecture8/saveHere.ser"));
        Student student = (Student) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(student);
    }
}
class Student implements java.io.Serializable {
    private int id;
    private String name;
    private float cgpa;

    Student(int id, String name, float cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
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
