package Chapter5_wrapperClass.lecture1;



class SameClass{
    public static void main(String[] args) {
        SameClass staticInstanceFactoryMethod = getStaticInstance();
        DifferentClass staticDifferentClassFactoryMethod = DifferentClass.getDifferentClassFactoryMethod();
    }


    static SameClass getStaticInstance(){       // static factory method [sane class]
        return new SameClass();
    }
}

class DifferentClass{
    static DifferentClass getDifferentClassFactoryMethod(){     // called 'static factory method' [different class]
        return new DifferentClass();                            // also called 'Pattern Factory Method'
    }
}




public class StaticFactoryMethod {}

