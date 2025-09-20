package chapter4_oopConcept.lecture4;

class Parent2{
    public Parent2(){

    }
}

class Child2{
    public Child2(){
        super();            // process 2 -> swap line 11 & 12 -> 'super()' and 'this(100)'
        //this(100);        // process 1 -> uncomment and run
    }
    public Child2(int value){

    }
}

public class SuperAndThisCanNotStayTogetherInConstructorInConstructorChaining {
    public static void main(String[] args) {
        Child2 obj = new Child2();
    }
}
