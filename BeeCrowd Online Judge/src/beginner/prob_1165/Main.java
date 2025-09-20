package beginner.prob_1165;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();

        if(testCase < 1 || testCase > 100) return;

        for (int i = 0; i < testCase; i++) {

            int testNumber = scanner.nextInt();

            if( testNumber <=1 || testNumber > 10000000 ) return;
            checkPrime(testNumber);
        }


    }


    static void checkPrime(int testNumber){

        for (int j = 2; j <= testNumber/2; j++) {

            if (testNumber % j == 0){
                System.out.println(testNumber +" nao eh primo");
                return;
            }
        }

        System.out.println(testNumber +" eh primo");
    }
}

