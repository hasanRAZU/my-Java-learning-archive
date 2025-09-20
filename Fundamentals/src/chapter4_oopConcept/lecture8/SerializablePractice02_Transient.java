package chapter4_oopConcept.lecture8;

import java.io.*;

public  class SerializablePractice02_Transient {}

class Serialize {
    public static void main(String[] args) throws IOException {
        Students student = new Students(101, "Razu", 3.42f, "myPass");

        // Serialize
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/chapter4/lecture8/saveHere2.ser"));
        objectOutputStream.writeObject(student);
        objectOutputStream.close();
    }
}
class Deserialize{
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // DeSerialize
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/chapter4/lecture8/saveHere2.ser"));
        Students student = (Students) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(student);        // print the DeSerializable Object
    }
}
class Students implements java.io.Serializable {
    private int id;
    private String name;
    private float cgpa;
    private transient String password;    // transient -> don't serialize

    Students(int id, String name, float cgpa, String password){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                ", password='" + password + '\'' +
                '}';
    }
}
