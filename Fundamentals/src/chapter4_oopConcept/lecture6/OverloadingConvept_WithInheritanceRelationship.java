package chapter4_oopConcept.lecture6;


class A2{}
class B2 extends A2{}
class C2 extends  B2{}
class D2 extends C2{}
public class OverloadingConvept_WithInheritanceRelationship {
    public static void method(Object object){System.out.println("Object");}
    public static void method(A2 a2){System.out.println("A2");}
    public static void method(B2 b2){System.out.println("B2");}


    public static void main(String[] args) {
        method(new D2());       //if 'D2' type parameterized method is not found
                                // search for its parent class with the same method name
                                // Direct parent is "C', but not found
                                // go for another level of parent, "B", found
                                // so, call method for-> method(B2 b2)
    }
}
