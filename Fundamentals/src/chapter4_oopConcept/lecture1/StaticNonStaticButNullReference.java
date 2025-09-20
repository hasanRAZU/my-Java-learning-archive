package chapter4_oopConcept.lecture1;

public class StaticNonStaticButNullReference {

    static int a = 2134;
    int b = 234;


    public static void main(String[] args) {

        StaticNonStaticButNullReference nullRef = null;

        System.out.println(nullRef.a);      // related with Class/Static
        System.out.println(nullRef.b);      // related with Object Creation (using 'new' keyword)

    }
}
