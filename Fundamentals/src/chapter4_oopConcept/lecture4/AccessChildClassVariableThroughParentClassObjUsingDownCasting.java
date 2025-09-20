package chapter4_oopConcept.lecture4;

class AA {
    int value1 = 10;
}

class BB extends AA {
    int value2 = 30;

}

public class AccessChildClassVariableThroughParentClassObjUsingDownCasting {
    public static void main(String[] args) {
        AA obj1 = new BB();
        System.out.println(((BB)obj1).value2);       // down casting  // shortcut

        BB obj2 = (BB) obj1;                          // down casting explanation
        System.out.println(obj2.value2);            // access child class value through down casting
    }
}
