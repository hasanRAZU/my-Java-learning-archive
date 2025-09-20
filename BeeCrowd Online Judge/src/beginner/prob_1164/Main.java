package beginner.prob_1164;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();

        int sum;

        for (int i = 0; i < testCase; i++) {
            int testNummber = scanner.nextInt();

            sum = 0;
            for (int j = testNummber / 2; j > 0; j--) {
                    if (testNummber % j == 0){
                        sum+= j;
                    }
            }
            if(sum == testNummber) System.out.println(testNummber +" eh perfeito");
            else System.out.println(testNummber +" nao eh perfeito");
        }
    }
}
