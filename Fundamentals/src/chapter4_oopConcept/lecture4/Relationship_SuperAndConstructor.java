package chapter4_oopConcept.lecture4;


class A{
    private int value1;
    public A(){
        System.out.println("class A :: parameterless constructor");
    }

    public A(int value1){
        System.out.println("class A :: parameterised constructor");
    }
}

class B extends A {
    public B(){
        System.out.println("class B :: parameterless constructor");
    }

    public B(int value){
        super(value);
        System.out.println("class B :: parameterised constructor");
    }
}



public class Relationship_SuperAndConstructor {
    public static void main(String[] args) {
        B obj1 = new B();
        System.out.println("\n\n");
        B obj2 = new B(10);
    }
}
