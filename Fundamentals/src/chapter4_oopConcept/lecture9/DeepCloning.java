package chapter4_oopConcept.lecture9;


class Courses implements Cloneable{
    private int coursesId;
    private String coursesName;

    Courses(int coursesId, String coursesName){
        this.coursesId = coursesId;
        this.coursesName = coursesName;
    }

    public void setCoursesId(int coursesId) {
        this.coursesId = coursesId;
    }
    public void setCoursesName(String coursesName){
        this.coursesName = coursesName;
    }


    @Override
    public String toString() {
        return "Courses{" +
                "coursesId=" + coursesId +
                ", coursesName='" + coursesName + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}






class Students implements Cloneable{

    private int studentsId;
    private String studentsName;
    private float cgpa;
    private Courses courses;

    Students(int studentsId, String  studentsName, float cgpa, Courses courses){
        this.studentsId = studentsId;
        this.studentsName = studentsName;
        this.cgpa = cgpa;
        this.courses = courses;
    }

    public void setStudentsId(int studentsId) {
        this.studentsId = studentsId;
    }
    public void setStudentsName(String studentsName) {
        this.studentsName = studentsName;
    }
    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
    public Courses getCourses() {
        return courses;
    }
    public void setCourses(Courses courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentsId=" + studentsId +
                ", studentsName='" + studentsName + '\'' +
                ", cgpa=" + cgpa +
                ", courses=" + courses +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Courses course = (Courses) this.courses.clone();
        Students students = (Students) super.clone();
        students.setCourses(course);
        return  students;
    }
}





public class DeepCloning {
    public static void main(String[] args) throws CloneNotSupportedException {

        Courses courses = new Courses(101, "Algo");
        Students students = new Students(1, "Monjurul", 3.4f, courses);

        // Only students is cloned with its courses. check the clone() method in students
        Students students2 = (Students) students.clone();

        // Print both student
        System.out.println("First Print");
        System.out.println(students);
        System.out.println(students2);

        // Change all 'course value' of cloned student
        students2.setStudentsId(2);
        students2.setStudentsName("Hasan");
        students2.setCgpa(4.0f);
        students2.getCourses().setCoursesId(102);      // try to change the 'course' values
        students2.getCourses().setCoursesName("DS");

        // Again print both students
        System.out.println("\n\nSecond Print: ");
        System.out.println(students);
        System.out.println(students2);

        System.out.println("\nNote: All changes in students2 does not reflect on student1, means deep cloning");

    }
}
