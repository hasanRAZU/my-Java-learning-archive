package beginner.prob_1176;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();


        for(int i = 0; i < testCase; i++){

            int findFibonacci = scanner.nextInt();
            if(findFibonacci < 0  || findFibonacci > 60) return;

            long[] arr = new long[findFibonacci+1];

            for( int j = 0; j <= findFibonacci; j ++){
                arr[j] = j;
                if(j == 1) break;
            }

            for(int k = 2; k <= findFibonacci; k++){
                arr[k] = arr[k-2] + arr[k-1];
            }


                System.out.println("Fib(" + findFibonacci + ") = " + arr[findFibonacci] );
        }
    }
}
