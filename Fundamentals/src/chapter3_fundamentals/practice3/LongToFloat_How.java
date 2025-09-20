package chapter3_fundamentals.practice3;


public class LongToFloat_How {
    public static void main(String[] var0) {
        long var1 = Long.valueOf(Long.MAX_VALUE);
        float var3 = (float)var1;
        System.out.println("Long: " + var1 + "\nFloat: " + var3);
    }
}
