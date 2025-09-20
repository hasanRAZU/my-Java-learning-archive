// Incomplete

package chapter4_oopConcept.lecture8;

class StudentClass{
    private int id;
    private String name;

    StudentClass(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Main{
    public static void main(String[] args) {
        StudentClass studentClass1 = new StudentClass(101, "razu");
        // StudentClass studentClass2 = studentClass1.clone();
    }
}

public class CloneAble {}
