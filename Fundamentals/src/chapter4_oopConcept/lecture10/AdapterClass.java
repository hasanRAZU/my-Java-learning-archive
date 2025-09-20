package chapter4_oopConcept.lecture10;


interface Shape{
    void draw();
    void changeOrientation();
}


//Intermediate situation between interface and class
public abstract class AdapterClass implements Shape{
    @Override
    public void draw() {
        // implementation
    }

    @Override
    public void changeOrientation() {
        // implementation
    }
}

class Circle extends AdapterClass{
        /*    provide implementation if needed otherwise
              use implemented default method.
            */
}
class Rectangle extends AdapterClass{
    @Override
    public void changeOrientation() {
        // do something
    }
}


