package beginner.prob_1067;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if( x >= 1 && x <= 1000){
            for(int i = 1; i <= x; i++){
                if(i % 2 == 1) System.out.println(i);
            }
        }

    }
}
