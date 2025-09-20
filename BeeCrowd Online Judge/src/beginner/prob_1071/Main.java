package beginner.prob_1071;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        int larger, smaller;
        if(firstNumber >= secondNumber){
            larger = firstNumber;
            smaller = secondNumber;
        }else {
            larger = secondNumber;
            smaller = firstNumber;
        }


        int sum = 0;
        for (int i = smaller+1 ; i < larger ; i ++){
            if(i % 2 == 1  || i % 2 == -1){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
