package chapter4_oopConcept.lecture10;

interface A{
    void function();
}
interface B{
    void function();
}
class C{

    public void function() {
        System.out.println("function C");
    }
}


class Main extends C{
    public static void main(String[] args) {

        C obj = new Main();
        A obj2 = (A) obj;       // compiler does not check the first compile time check ->relation between (A and C)

        obj2.function();
    }
}

public class ObjectCasting_Interface_Class {

}
