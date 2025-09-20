package beginner.prob_1070;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        int count = 0;
        while(count != 6){
            if(number % 2 == 1){
                System.out.println(number);
                count++;
            }
            number ++;
        }
    }
}
