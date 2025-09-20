package chapter3_fundamentals.practice2;

public class ExplicitCasting {
    public static void main(String[] args) {
        int i = (int) 0b00000000100110011001000101011001;         // 32 bit
        short sh = (short) i;                               // 16 bit

        System.out.println("int "+ i +" converted to short: " + sh + "\n");
        System.out.println("The printed short value is garbage ?? \nAnswer: no, lets see how it works\n");

        System.out.println("Integer to Binary String: " + Integer.toBinaryString(i));
        System.out.println("Short to Binary String  :         " + Integer.toBinaryString(sh).substring(16)); // lost of 16 bit  when converting from integer to short

        short sh2 = (short) 0b1001000101011001;
        System.out.println("short val1: " + sh + " & val2: " + sh2);
        System.out.println("\nLoss of bits, this is how Explicit Type Casting works");
    }
}
