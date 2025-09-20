package chapter4_oopConcept.lecture8;

import java.io.*;

public  class SerializablePractice03_Inheritance {}

class SerializeDeserialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        System.out.println("Serializing Start");
        Stu writeStudent = new Stu(123456789, "bangladeshi", 101, "Razu", 3.42f, "myPass");

        // Serialize
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/chapter4/lecture8/saveHere3.ser"));
        objectOutputStream.writeObject(writeStudent);
        objectOutputStream.close();
        System.out.println(writeStudent);
        System.out.println("Serializing Complete\n\n");


        // DeSerialize
        System.out.println("DeSerializing Start");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/chapter4/lecture8/saveHere3.ser"));
        Stu readStudent = (Stu) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(readStudent);        // print the DeSerialized Object
        System.out.println("DeSerializing Complete\n\n");
    }
}



class Person {
    private final long nID;
    private final String nationality;

    Person(){           // It is needed for object initialization
                        // when DeSerializing the object
                        // because, this object was not serialized
                        // but when deserializing 'student' object,
                        // it needs its parent class default value
                        // so, this constructor is called for obj init
        this.nID = 0L;
        this.nationality = "";

        System.out.println("Person init - 01");
    }

    Person(long nID, String nationality) {
        this.nID = nID;
        this.nationality = nationality;

        System.out.println("Person init - 02");
    }

    @Override
    public String toString() {
        return "Person{" +
                "nID=" + nID +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
class Stu extends Person implements java.io.Serializable {
    private final int id;
    private final String name;
    private final float cgpa;
    private final transient String password;    // transient -> don't serialize

    Stu(long nId, String nationality, int id, String name, float cgpa, String password){
        super(nId, nationality);
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
        this.password = password;
    }

    @Override
    public String toString() {
        return super.toString() + ", Stu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                ", password='" + password + '\'' +
                '}';
    }
}
