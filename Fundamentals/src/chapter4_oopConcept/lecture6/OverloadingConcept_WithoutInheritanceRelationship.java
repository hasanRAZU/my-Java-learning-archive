package chapter4_oopConcept.lecture6;

class A1{}
class B1{}
class C1{}
class D1{}
public class OverloadingConcept_WithoutInheritanceRelationship {
    public static void method(Object object){System.out.println("Object");}
    public static void method(A1 a1){System.out.println("A1");}
    public static void method(B1 b1){System.out.println("B1");}
    public static void method(C1 c1){System.out.println("C1");}


    public static void main(String[] args) {
        method(new D1());       // no exact method for 'D' type parameter
                                // so, look for common object as a parameter
                                // which is 'Object obj'
    }
}
