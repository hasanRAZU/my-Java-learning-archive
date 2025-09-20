package chapter4_oopConcept.lecture4;

class Parent{
    int value = 100;
}

class Child extends Parent{
    int value = 200;
}
public class FieldDoesntFollowOverriding {
    public static void main(String[] args) {
        Parent obj = new Child();
        System.out.println(obj.value);      // 100 ? :: 200 ?
        System.out.println("Answer: 100, cause field doesnt follow 'Overriding Concept'");
    }

}
