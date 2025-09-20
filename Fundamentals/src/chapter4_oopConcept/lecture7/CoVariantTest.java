package chapter4_oopConcept.lecture7;

class Shape{
    public void draw() {
        System.out.println("Shape");
    }
}
class Circle extends Shape{
    @Override public void draw(){
        System.out.println("Circle");
    }
}
class Rectangle extends Shape{
    @Override public void draw(){
        System.out.println("Rectangle");
    }
}


class Parent{
    public Shape getShape(){
        return new Shape();
    }
}

class Child1 extends Parent {
    @Override
    public Shape getShape(){
        return new Circle();
    }
}

class Child2 extends Parent{
    @Override
    public Circle getShape(){
        return new Circle();
    }
}

public class CoVariantTest {
    public static void main(String[] args) {
        Parent obj1 = new Child1(); // Child1 obj1 = new Child1();  // same result
        obj1.getShape().draw();

        Parent obj2 = new Child2(); // Parent obj2 = new Child2();  // same result
        obj2.getShape().draw();
    }
}
