package chapter4_oopConcept.lecture6;

class A{
    public A(){

    }

    public A(double d, Long l ){
        System.out.println("Double");
    }

}

public class OverloadingConcept_DataTypeConversion {


    public static void main(String[] args) {
        float f = (float) 3.2;
        long l = 324;
        A obj = new A(f,l);
    }
}
