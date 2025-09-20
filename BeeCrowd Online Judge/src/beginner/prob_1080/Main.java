package beginner.prob_1080;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxValue = 0, maxValPos = 0;
        for(int i = 1 ; i <= 100; i++){
            int currentValue = scanner.nextInt();
            if(maxValue <= currentValue){
                maxValue = currentValue;
                maxValPos = i;
            }
        }

        System.out.println(maxValue +"\n" + maxValPos);
    }
}

