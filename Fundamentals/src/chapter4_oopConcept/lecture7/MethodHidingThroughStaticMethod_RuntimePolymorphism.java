package chapter4_oopConcept.lecture7;

class AA1{
    public static void myMethod(){
        System.out.println("AA1");
    }
}
class BB1 extends AA1{
    public static void myMethod(){
        System.out.println("BB1");
    }
}


public class MethodHidingThroughStaticMethod_RuntimePolymorphism {
    public static void main(String[] args) {
        AA1 aa1 = new BB1();

                            // it automatically replaced with -> AA1.myMethod()
        aa1.myMethod();     // for static, no runtime concept, follows 'reference type' object only
    }
}
