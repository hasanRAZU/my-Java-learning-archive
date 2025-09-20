package design_pattern.creational_design_pattern.$1__singleton_design_pattern;



class SingletonClass{

    private static SingletonClass instance;
    private SingletonClass(){}

    static SingletonClass getInstance(){
        if(instance == null)
            instance = new SingletonClass();
        return instance;
    }
}



public class SingleTonDesignPattern {
    static void main() {
        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();

        System.out.println("obj1 = " + obj1.hashCode());
        System.out.println("obj2 = " + obj2.hashCode());
    }
}
