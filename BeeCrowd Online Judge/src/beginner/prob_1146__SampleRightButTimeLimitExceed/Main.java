package beginner.prob_1146__SampleRightButTimeLimitExceed;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sccaner = new Scanner(System.in);

        while(true){
            int i, x = sccaner.nextInt();
            if(x == 0) return;;

            for (i = 1; i <= x; i ++){
                System.out.print(i + " ");
                if (i == x) System.out.print(" ");
            }

            System.out.println();
        }
    }
}
