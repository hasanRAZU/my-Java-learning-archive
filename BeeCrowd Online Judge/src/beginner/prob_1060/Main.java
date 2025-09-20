package beginner.prob_1060;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for(int i = 0; i < 6; i++){
            double num = scanner.nextDouble();
            if(num >= 0) count++;
        }
        System.out.println(count + " valores positivos");

    }
}
