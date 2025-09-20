package chapter4_oopConcept.lecture9;


class Course{
    private int courseId;
    private String courseName;

    Course(int courseId, String courseName){
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public int getCourseId() {
        return courseId;
    }
    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}






class Student implements Cloneable{

    private int studentId;
    private String studentName;
    private float cgpa;
    private Course course;

    Student(int studentId, String  studentName, float cgpa, Course course){
        this.studentId = studentId;
        this.studentName = studentName;
        this.cgpa = cgpa;
        this.course = course;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
    public Course getCourse() {
        return course;
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", cgpa=" + cgpa +
                ", course=" + course +
                '}';
    }


}





public class SallowCloning {
    public static void main(String[] args) throws CloneNotSupportedException {

        Course course = new Course(101, "Algo");
        Student student1 = new Student(1, "Monjurul", 3.4f, course);

        Student student2 = student1.clone();  // Student2 clones Student1

        // Print both student
        System.out.println("First Print: 2nd student is cloned from student1");
        System.out.println(student1 +" \n"+ student2);

        // Change value of cloned student
        student2.setStudentId(2);
        student2.setStudentName("Hasan");
        student2.setCgpa(4.0f);
        student2.getCourse().setCourseId(102);
        student2.getCourse().setCourseName("DS");

        // Print both students
        System.out.println("\nSecond Print: ");
        System.out.println(student1 +" \n"+ student2);

        System.out.println("\n1. we see, changing studentId in student2 does not reflect on student1, " +
                "it means student1 and student2 is deeply cloned\n"
        +"2. but changing courseValue in student2 reflects on student1, " +
                "it means course is not deeply cloned.");

    }
}
