package chapter3_fundamentals.practice4;

public class FloatDoubleCanNotBeEqual {
    public static void main(String[] args) {
        float f = (float) 4 /125;
        double d = (double) 4 / 125;

        System.out.println("(float) 4/125 == (double) 4/125 ?");
        System.out.println( f == d);


        double d2 = (double) 4 / 125;
        float f2 = (float) d2;

        System.out.println("\n\n(double) 4/125 == (float) double ?");
        System.out.println( f == d);
    }
}
