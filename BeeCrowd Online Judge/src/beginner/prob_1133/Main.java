package beginner.prob_1133;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();


        if(val1 < val2) result(val1, val2);
        else if(val2 < val1) result(val2, val1);
    }

    static void result(int val1, int val2){
        for (int i = val1 +1; i < val2; i++){
            if(i % 5 == 2  || i % 5 == 3) System.out.println(i);
        }
    }
}

