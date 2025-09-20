package chapter4_oopConcept.lecture1;

public class Static_NonStatic {

    public static int val = 23;
    {
        System.out.println(val);
    }

    public int val2 = 24;
    static{
//        System.out.println(val2);
    }

    public static void main(String[] args) {
         Static_NonStatic st = new Static_NonStatic();
    }
}
