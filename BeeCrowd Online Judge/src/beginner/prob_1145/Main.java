package beginner.prob_1145;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int x = Integer.parseInt(str[0]);
        int y = Integer.parseInt(str[1]);
        int iterator = x;


        if (1 < x && x < 20 && x < y && y < 100000) {
            /*x = 0;
            while (true) {
                for (int i = 1; i <= iterator; i++){
                    ++x;
                    System.out.print(x);
                    if (x == y) return;
                    System.out.print(" ");
                }
                System.out.println();
            }*/

            x = 0;
            for(int i = 1; i <= y; i++){
                ++x;
                System.out.print(x);
                if(i % iterator == 0) {
                    System.out.println();
                    continue;
                }
                System.out.print(" ");
            }
        }
    }
}

