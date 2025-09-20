package chapter4_oopConcept.lecture5;

class A{ }
class B extends A{}
class C extends A{}
class D extends A{}

public class InstanceOfOperator {
    public static void main(String[] args) {
        A obj = new  C();

        if(obj instanceof A){
            System.out.println("obj instanceOf A: true");       //true
        } else if (obj instanceof B) {
            System.out.println("obj instance of B: true");      // false
        }else if(obj instanceof C){
            System.out.println("obj instance of C: true");      //false
        } else if (obj instanceof D) {
            System.out.println("obj instance of D: true");      //false
        }

    /*Formula
        D obj = new C();
        obj instanceOf A

        Compiler Check -> D extends A  ||  A extends D  ||  D  == A
        Runtime Check ->  C extends A  || C == A
*/
    }
}
