package beginner.prob_1072;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int inCount = 0;
        int outCount = 0;

        if(n>=1 && n < 10000) {
            for (int i = 1; i <= n; i++) {
                long x = scanner.nextLong();
                if(x>-10000000 && x<10000000){
                    if(x>=10 && x<=20) inCount++;
                    else outCount++;
                }
            }
        }

        System.out.println(inCount +" in\n" + outCount +" out");
    }
}
