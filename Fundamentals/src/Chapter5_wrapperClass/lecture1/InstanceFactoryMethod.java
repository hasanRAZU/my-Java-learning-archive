package Chapter5_wrapperClass.lecture1;

class Main{
    public static void main(String[] args) {
        Main m = new Main();
        Main instanceFactoryMethod = m.getInstance();
    }



    Main getInstance(){
        return new Main();
    }
}



public class InstanceFactoryMethod {}
