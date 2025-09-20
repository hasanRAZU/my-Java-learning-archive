package beginner.prob_1151;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n <= 0 || n >= 46) return;;

        int store1 = 0;
        int store2 = 0;


        for(int i = 0; i < n; i++){

            if (i == 0 || i == 1) {
                store2 = i;
                System.out.print(i);
            }
            else {
                if (i % 2 == 0) {
                    System.out.print(store1 + store2);
                    store1 += store2;
                }
                else {
                    System.out.print(store1 + store2);
                    store2 += store1;
                }
            }

            if( i != n-1) System.out.print(" ");
        }
        System.out.println();       // Extra line
    }
}
