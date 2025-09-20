package chapter4_oopConcept.lecture4;

class Parent1{
    private int value;

    public Parent1(int value){
        this.value = value;
        System.out.println(this.value);
    }
}

class Child1 extends Parent1{
    public Child1(){
        this(100);      // calling another constructor from the same class
    }

    public Child1(int value){
        super(value);       // calling 'super' class 'constructor'
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Parent1 obj = new Child1();
        Parent1 obj2 = new Child1(200);
    }
}
