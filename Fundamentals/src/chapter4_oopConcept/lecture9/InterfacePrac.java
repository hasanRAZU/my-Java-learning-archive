package chapter4_oopConcept.lecture9;

interface A{
    Object fun();
}

interface B{
    Number fun();
}

class C implements A,B{

    @Override
    public Integer fun() {

        return 0;
    }
}

public class InterfacePrac {
}
