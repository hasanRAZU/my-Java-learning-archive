package beginner.prob_1065;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        for(int i = 0; i < 5; i++){
            if(scanner.nextInt() % 2 == 0 ){
                count++;
            }
        }

        System.out.println(count +" valores pares");
    }
}
