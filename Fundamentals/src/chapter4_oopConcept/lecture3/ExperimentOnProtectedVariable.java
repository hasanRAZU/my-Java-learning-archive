package chapter4_oopConcept.lecture3;


import chapter4_oopConcept.support.Lecture3_ExperimentOnProtectedVariable;        // from another package

public class ExperimentOnProtectedVariable extends Lecture3_ExperimentOnProtectedVariable {

    void method1(){
        System.out.println(value);  //access protected value from another package directly
                                    // only through 'extends'
    }

    void method2(){
        ExperimentOnProtectedVariable obj = new ExperimentOnProtectedVariable();    // only through protected variable's class object
        System.out.println(obj.value); //access protected value from another package directly
        // only through 'extends'
    }

}

class NewClass extends ExperimentOnProtectedVariable{
    void method3(){
        System.out.println(value);  //access protected value from another package directly
                                    // only through 'extends'
    }

    void method4(){
        ExperimentOnProtectedVariable obj = new ExperimentOnProtectedVariable();
        /*System.out.println(obj.value);*/       // this will not work // compilation error
    }
}

